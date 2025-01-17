package tech.investbuddy.predictionservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PredictionResponse {

    @JsonProperty("recommended_domain")
    private String recommendedDomain;

    @JsonProperty("match_preferred_domain")
    private boolean matchPreferredDomain;

    @JsonProperty("ignored_domains")
    private List<String> ignoredDomains;

    @JsonProperty("selected_sector")
    private String selectedSector;

    @JsonProperty("preferred_domains_sent")
    private List<PredictionRequest.PreferredDomains> preferredDomainsSent;

    @JsonProperty("city_index")
    private int cityIndex;
}
