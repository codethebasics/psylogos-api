package core.data;

import java.time.LocalDateTime;

public final class GameState {
    private final User user;
    private final Badge[] badges;
    private final Boolean hasOnboarded;
    private final LocalDateTime studyStartDate;
    private final InstrumentResponse[] responses;
    private final PingStatus[] pings;
    private final SocialDemographicData socialDemographicData;

    private GameState(Builder builder) {
        this.user = builder.user;
        this.badges = builder.badges;
        this.hasOnboarded = builder.hasOnboarded;
        this.studyStartDate = builder.studyStartDate;
        this.responses = builder.responses;
        this.pings = builder.pings;
        this.socialDemographicData = builder.socialDemographicData;
    }

    public User getUser() {
        return user;
    }

    public Badge[] getBadges() {
        return badges;
    }

    public Boolean getHasOnboarded() {
        return hasOnboarded;
    }

    public LocalDateTime getStudyStartDate() {
        return studyStartDate;
    }

    public InstrumentResponse[] getResponses() {
        return responses;
    }

    public PingStatus[] getPings() {
        return pings;
    }

    public SocialDemographicData getSocialDemographicData() {
        return socialDemographicData;
    }

    public interface UserStep {
        Builder user(User user);
    }

    public static UserStep builder() {
        return Builder::new;
    }

    public static class Builder {
        private final User user;
        private Badge[] badges;
        private Boolean hasOnboarded;
        private LocalDateTime studyStartDate;
        private InstrumentResponse[] responses;
        private PingStatus[] pings;
        private SocialDemographicData socialDemographicData;

        private Builder(User user) {
            if (user == null)
                throw new IllegalArgumentException("O usuário deve ser informado");

            this.user = user;
        }

        public Builder badges(Badge[] badges) {
            this.badges = (badges != null) ? badges.clone() : new Badge[0];
            return this;
        }

        public Builder hasOnboarded(Boolean hasOnboarded) {
            this.hasOnboarded = hasOnboarded;
            return this;
        }

        public Builder studyStartDate(LocalDateTime studyStartDate) {
            this.studyStartDate = studyStartDate;
            return this;
        }

        public Builder responses(InstrumentResponse[] responses) {
            this.responses = (responses != null) ? responses.clone() : new InstrumentResponse[0];
            return this;
        }

        public Builder pings(PingStatus[] pings) {
            this.pings = (pings != null) ? pings.clone() : new PingStatus[0];
            return this;
        }

        public Builder socialDemographicData(SocialDemographicData data) {
            this.socialDemographicData = data;
            return this;
        }

        public GameState build() {
            return new GameState(this);
        }
    }
}
