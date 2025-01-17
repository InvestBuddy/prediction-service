package tech.investbuddy.predictionservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class PredictionRequest {
    @JsonProperty("Gender")
    private String gender;

    @JsonProperty("City")
    private String city;

    @JsonProperty("Age")
    private int age;

    @JsonProperty("Income")
    private double income;
    @JsonProperty("Risk_Tolerance")
    private String riskTolerance;

    @JsonProperty("Investment_History")
    private List<String> investmentHistory;

    @JsonProperty("Financial_Objective")
    private String financialObjective;

    @JsonProperty("Preferred_Sector")
    private String preferredSector;

    @JsonProperty("Investment_Frequency")
    private String investmentFrequency;

    @JsonProperty("PreferredDomain")
    private List<String> preferredDomain;

    public enum PreferredDomains {
        actions,
        cryptomonnaies,
        ETF,
        immobilier,
        obligations,
        startups
    }

}
