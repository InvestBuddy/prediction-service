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
        String apiUrl = "http://flask-service:8000/predict/";
        HttpEntity<PredictionRequest> requestEntity = new HttpEntity<>(predictionRequest);

        try {
            ResponseEntity<PredictionResponse> apiResponse = restTemplate.exchange(
                    apiUrl,
                    HttpMethod.POST,
                    requestEntity,
                    PredictionResponse.class
            );

            System.out.println("Request sent: " + predictionRequest);
            System.out.println("Response received: " + apiResponse.getBody());
            return ResponseEntity.ok(apiResponse.getBody());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(null);
        }
    }


    @GetMapping("/test")
    public String test() {
        return  "hello world";
    }
}
