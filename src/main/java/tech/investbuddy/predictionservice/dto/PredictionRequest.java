package tech.investbuddy.predictionservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PredictionRequest {
    @JsonProperty("Gender")
    private String Gender;

    @JsonProperty("City")
    private String city;  // Correspond à "City" dans le JSON

    @JsonProperty("Age")
    private float age;  // Correspond à "Age" dans le JSON

    @JsonProperty("Income")
    private float income;  // Correspond à "Income" dans le JSON

    @JsonProperty("Risk_Tolerance")
    private String riskTolerance;  // Correspond à "Risk_Tolerance" dans le JSON

    @JsonProperty("Investment_History")
    private List<String> investmentHistory;  // Correspond à "Investment_History"

    @JsonProperty("Financial_Objective")
    private String financialObjective;  // Correspond à "Financial_Objective"

    @JsonProperty("Preferred_Sector")
    private String preferredSector;  // Correspond à "Preferred_Sector"

    @JsonProperty("Investment_Frequency")
    private String investmentFrequency;  // Correspond à "Investment_Frequency"

    @JsonProperty("PreferredDomain")
    private List<String> PreferredDomain;

    public enum PreferredDomains {
        actions,
        cryptomonnaies,
        ETF,
        immobilier,
        obligations,
        startups
    }

}
