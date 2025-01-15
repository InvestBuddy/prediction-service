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
    private String recommendedDomain;  // Correspond à "recommended_domain"

    @JsonProperty("match_preferred_domain")
    private boolean matchPreferredDomain;  // Correspond à "match_preferred_domain"

    @JsonProperty("selected_sector")
    private String selectedSector;  // Correspond à "selected_sector"

    @JsonProperty("preferred_domains_sent")
    private List<String> preferredDomainsSent;  // Correspond à "preferred_domains_sent"

    @JsonProperty("ignored_domains")
    private List<String> ignoredDomains;  // Correspond à "ignored_domains"

    @JsonProperty("city_index")
    private int cityIndex;
}
