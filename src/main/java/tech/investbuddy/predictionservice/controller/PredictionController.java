package tech.investbuddy.predictionservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import tech.investbuddy.predictionservice.dto.PredictionRequest;
import tech.investbuddy.predictionservice.dto.PredictionResponse;
import tech.investbuddy.predictionservice.dto.UserProfileResponse;

import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/prediction")
public class PredictionController {

    private final RestTemplate restTemplate;


    @PostMapping("/predict")
    public ResponseEntity<PredictionResponse> predict(@RequestBody UserProfileResponse userProfileResponse) {
        String apiUrl = "http://localhost:8000/predict"; // your flasK endpoint

        System.out.println("userProfileResponse" + userProfileResponse);

        PredictionRequest predictionRequest = PredictionRequest.builder()
                .city(userProfileResponse.getCity())
                .age(userProfileResponse.getAge())
                .gender(String.valueOf(userProfileResponse.getGender()).toLowerCase())
                .income(userProfileResponse.getIncome())
                .riskTolerance(String.valueOf(userProfileResponse.getRiskTolerance()).toLowerCase())
                .investmentHistory(userProfileResponse.getInvestmentHistory().stream()
                        .map(String::toLowerCase)  // Transforme chaque élément en minuscules
                        .collect(Collectors.toList()))  // Recollecte les éléments dans une liste
                .investmentFrequency(String.valueOf(userProfileResponse.getInvestmentFrequency()).toLowerCase())
                .financialObjective(String.valueOf(userProfileResponse.getFinancialObjective()).toLowerCase())
                .preferredSector(String.valueOf(userProfileResponse.getPreferredSector()).toLowerCase())
                .preferredDomain(userProfileResponse.getPreferredDomain().stream()
                        .map(String::toLowerCase)  // Transforme chaque élément en minuscules
                        .collect(Collectors.toList()))  // Recollecte les éléments dans une liste
                .build();

        System.out.println("predictionRequest" + predictionRequest);

        // Préparer la requête HTTP
        HttpEntity<PredictionRequest> requestEntity = new HttpEntity<>(predictionRequest);

        // Faire l'appel API
        ResponseEntity<PredictionResponse> apiResponse = restTemplate.exchange(
                apiUrl,
                HttpMethod.POST,
                requestEntity,
                PredictionResponse.class
        );

        System.out.println("Response received: " + apiResponse.getBody());

        // Retourner la réponse
        return ResponseEntity.ok(apiResponse.getBody());
    }

    @GetMapping("/test")
    public String test() {
        return  "hello world";
    }
}
