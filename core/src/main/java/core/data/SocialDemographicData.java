package core.data;

public final class SocialDemographicData {
    private final String age;
    private final String gender;
    private final String maritalStatus;
    private final String education;
    private final String occupation;
    private final String continuousMedication;
    private final String medicationDetails;
    private final String healthDiagnosis;
    private final String diagnosisDetails;
    private final String monthlyIncome;
    private final String platforms;
    private final String otherPlatform;
    private final String usagePeriod;
    private final String dailyUsage;
    private final String purposeTalk;
    private final String purposeShare;
    private final String purposeWatch;
    private final String purposeSearch;

    private SocialDemographicData(
            String age,
            String gender,
            String maritalStatus,
            String education,
            String occupation,
            String continuousMedication,
            String medicationDetails,
            String healthDiagnosis,
            String diagnosisDetails,
            String monthlyIncome,
            String platforms,
            String otherPlatform,
            String usagePeriod,
            String dailyUsage,
            String purposeTalk,
            String purposeShare,
            String purposeWatch,
            String purposeSearch) {
        this.age = age;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.education = education;
        this.occupation = occupation;
        this.continuousMedication = continuousMedication;
        this.medicationDetails = medicationDetails;
        this.healthDiagnosis = healthDiagnosis;
        this.diagnosisDetails = diagnosisDetails;
        this.monthlyIncome = monthlyIncome;
        this.platforms = platforms;
        this.otherPlatform = otherPlatform;
        this.usagePeriod = usagePeriod;
        this.dailyUsage = dailyUsage;
        this.purposeTalk = purposeTalk;
        this.purposeShare = purposeShare;
        this.purposeWatch = purposeWatch;
        this.purposeSearch = purposeSearch;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getEducation() {
        return education;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getContinuousMedication() {
        return continuousMedication;
    }

    public String getMedicationDetails() {
        return medicationDetails;
    }

    public String getHealthDiagnosis() {
        return healthDiagnosis;
    }

    public String getDiagnosisDetails() {
        return diagnosisDetails;
    }

    public String getMonthlyIncome() {
        return monthlyIncome;
    }

    public String getPlatforms() {
        return platforms;
    }

    public String getOtherPlatform() {
        return otherPlatform;
    }

    public String getUsagePeriod() {
        return usagePeriod;
    }

    public String getDailyUsage() {
        return dailyUsage;
    }

    public String getPurposeTalk() {
        return purposeTalk;
    }

    public String getPurposeShare() {
        return purposeShare;
    }

    public String getPurposeWatch() {
        return purposeWatch;
    }

    public String getPurposeSearch() {
        return purposeSearch;
    }

    public static class Builder {
        private String age;
        private String gender;
        private String maritalStatus;
        private String education;
        private String occupation;
        private String continuousMedication;
        private String medicationDetails;
        private String healthDiagnosis;
        private String diagnosisDetails;
        private String monthlyIncome;
        private String platforms;
        private String otherPlatform;
        private String usagePeriod;
        private String dailyUsage;
        private String purposeTalk;
        private String purposeShare;
        private String purposeWatch;
        private String purposeSearch;

        public Builder age(String age) {
            this.age = age;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder maritalStatus(String maritalStatus) {
            this.maritalStatus = maritalStatus;
            return this;
        }

        public Builder education(String education) {
            this.education = education;
            return this;
        }

        public Builder occupation(String occupation) {
            this.occupation = occupation;
            return this;
        }

        public Builder continuousMedication(String continuousMedication) {
            this.continuousMedication = continuousMedication;
            return this;
        }

        public Builder medicationDetails(String medicationDetails) {
            this.medicationDetails = medicationDetails;
            return this;
        }

        public Builder healthDiagnosis(String healthDiagnosis) {
            this.healthDiagnosis = healthDiagnosis;
            return this;
        }

        public Builder diagnosisDetails(String diagnosisDetails) {
            this.diagnosisDetails = diagnosisDetails;
            return this;
        }

        public Builder monthlyIncome(String monthlyIncome) {
            this.monthlyIncome = monthlyIncome;
            return this;
        }

        public Builder platforms(String platforms) {
            this.platforms = platforms;
            return this;
        }

        public Builder otherPlatform(String otherPlatform) {
            this.otherPlatform = otherPlatform;
            return this;
        }

        public Builder usagePeriod(String usagePeriod) {
            this.usagePeriod = usagePeriod;
            return this;
        }

        public Builder dailyUsage(String dailyUsage) {
            this.dailyUsage = dailyUsage;
            return this;
        }

        public Builder purposeTalk(String purposeTalk) {
            this.purposeTalk = purposeTalk;
            return this;
        }

        public Builder purposeShare(String purposeShare) {
            this.purposeShare = purposeShare;
            return this;
        }

        public Builder purposeWatch(String purposeWatch) {
            this.purposeWatch = purposeWatch;
            return this;
        }

        public Builder purposeSearch(String purposeSearch) {
            this.purposeSearch = purposeSearch;
            return this;
        }

        public SocialDemographicData build() {
            return new SocialDemographicData(
                    age,
                    gender,
                    maritalStatus,
                    education,
                    occupation,
                    continuousMedication,
                    medicationDetails,
                    healthDiagnosis,
                    diagnosisDetails,
                    monthlyIncome,
                    platforms,
                    otherPlatform,
                    usagePeriod,
                    dailyUsage,
                    purposeTalk,
                    purposeShare,
                    purposeWatch,
                    purposeSearch);
        }
    }
}
