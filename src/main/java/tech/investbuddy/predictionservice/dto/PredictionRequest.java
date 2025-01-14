package tech.investbuddy.predictionservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PredictionRequest {
    private String Gender;
    private String City;
    private String Age;
    private String Income;
    private String Risk_Tolerance;
    private String Investment_History;
    private String Financial_Objective;
    private String Preferred_Sector;
    private String Investment_Frequency;
    private List<PreferredDomains> PreferredDomain;

    public enum PreferredDomains {
        actions,
        cryptomonnaies,
        ETF,
        immobilier,
        obligations,
        startups
    }

}
