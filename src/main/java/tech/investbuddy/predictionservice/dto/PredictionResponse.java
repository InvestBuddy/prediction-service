package tech.investbuddy.predictionservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PredictionResponse {
    private String recommended_domain;
    private String match_preferred_domain;
    private String selected_sector;
    private List<PredictionRequest.PreferredDomains> preferred_domains_sent;
}
