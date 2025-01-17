package tech.investbuddy.predictionservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserProfileResponse {

    private Long id;

    private UUID userId;

    private String city;

    private LocalDate dateOfBirth;

    private Integer age;

    private Double income;

    private Gender gender;

    private RiskTolerance riskTolerance;

    private List<String> investmentHistory;

    private FinancialObjective financialObjective;

    private PreferredSector preferredSector;

    private InvestmentFrequency investmentFrequency;

    private List<String> preferredDomain;

    public enum Gender {
        WOMAN, MAN
    }

    public enum RiskTolerance {
        LOW, MEDIUM, HIGH
    }

    public enum FinancialObjective {
        RETRAITE, EPARGNE_DE_SECURITE, ACHAT_IMMOBILIER, EDUCATION_DES_ENFANTS, VOYAGES, EPARGNE_DE_DEPART, INVESTIR_DANS_EDUCATION
    }

    public enum PreferredSector {
        ACTIONS, CRYPTOMONNAIES, ETF, IMMOBILIER, OBLIGATIONS, STARTUPS
    }

    public enum InvestmentFrequency {
        MENSUEL, TRIMESTRIEL, ANNUEL
    }
}