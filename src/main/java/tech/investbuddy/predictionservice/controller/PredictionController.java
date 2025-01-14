package tech.investbuddy.predictionservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import tech.investbuddy.predictionservice.dto.PredictionRequest;
import tech.investbuddy.predictionservice.dto.PredictionResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/prediction")
public class PredictionController {

    private final RestTemplate restTemplate;


    @PostMapping("/predict")
    public ResponseEntity<PredictionResponse> predict(@RequestBody PredictionRequest predictionRequest) {
        String apiUrl = "http://localhost:8000/predict"; // your flasK endpoint

        // Préparer la requête HTTP
        HttpEntity<PredictionRequest> requestEntity = new HttpEntity<>(predictionRequest);

        // Faire l'appel API
        ResponseEntity<PredictionResponse> apiResponse = restTemplate.exchange(
                apiUrl,
                HttpMethod.POST,
                requestEntity,
                PredictionResponse.class
        );

        // Retourner la réponse
        return ResponseEntity.ok(apiResponse.getBody());
    }

    @GetMapping("/test")
    public String test() {
        return  "hello world";
    }
}
