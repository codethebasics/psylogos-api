package br.com.psylogos.infra.data;

import br.com.psylogos.infra.game.GameStateEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = "psylogos", name = "tb_social_demographic_data")
public class SocialDemographicDataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "age")
    private String age;

    @Column(name = "gender")
    private String gender;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "education")
    private String education;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "continuous_medication")
    private String continuousMedication;

    @Column(name = "medication_details")
    private String medicationDetails;

    @Column(name = "health_diagnosis")
    private String healthDiagnosis;

    @Column(name = "diagnosis_details")
    private String diagnosisDetails;

    @Column(name = "monthly_income")
    private String monthlyIncome;

    @Column(name = "platforms")
    private String platforms;

    @Column(name = "other_platform")
    private String otherPlatform;

    @Column(name = "usage_period")
    private String usagePeriod;

    @Column(name = "daily_usage")
    private String dailyUsage;

    @Column(name = "purpose_talk")
    private String purposeTalk;

    @Column(name = "purpose_share")
    private String purposeShare;

    @Column(name = "purpose_watch")
    private String purposeWatch;

    @Column(name = "purpose_search")
    private String purposeSearch;

    @OneToOne(fetch = FetchType.LAZY)
    private GameStateEntity gameState;
}
