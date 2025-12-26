package core.user;

public final class User {
    private final String nickname;
    private final Integer points;
    private final Integer level;
    private final Integer responseRate;
    private final Integer currentStreak;
    private final Integer completeDays;
    private final String avatar;

    private User(
            String nickname,
            Integer points,
            Integer level,
            Integer responseRate,
            Integer currentStreak,
            Integer completeDays,
            String avatar) {
        this.nickname = nickname;
        this.points = points;
        this.level = level;
        this.responseRate = responseRate;
        this.currentStreak = currentStreak;
        this.completeDays = completeDays;
        this.avatar = avatar;
    }

    private User(
            String nickname,
            Integer points,
            Integer level,
            Integer responseRate,
            Integer currentStreak,
            Integer completeDays) {
        this.nickname = nickname;
        this.points = points;
        this.level = level;
        this.responseRate = responseRate;
        this.currentStreak = currentStreak;
        this.completeDays = completeDays;
        this.avatar = null;
    }

    public String getNickname() {
        return nickname;
    }

    public Integer getPoints() {
        return points;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getResponseRate() {
        return responseRate;
    }

    public Integer getCurrentStreak() {
        return currentStreak;
    }

    public Integer getCompleteDays() {
        return completeDays;
    }

    public String getAvatar() {
        return avatar;
    }

    public static class Builder {
        private String nickname;
        private Integer points;
        private Integer level;
        private Integer responseRate;
        private Integer currentStreak;
        private Integer completeDays;
        private String avatar;

        public Builder nickname(final String nickname) {
            this.nickname = nickname;
            return this;
        }

        public Builder points(final Integer points) {
            this.points = points;
            return this;
        }

        public Builder level(final Integer level) {
            this.level = level;
            return this;
        }

        public Builder responseRate(final Integer responseRate) {
            this.responseRate = responseRate;
            return this;
        }

        public Builder currentStreak(final Integer currentStreak) {
            this.currentStreak = currentStreak;
            return this;
        }

        public Builder completeDays(final Integer completeDays) {
            this.completeDays = completeDays;
            return this;
        }

        public Builder avatar(final String avatar) {
            this.avatar = avatar;
            return this;
        }

        public User build() {
            return new User(
                    nickname,
                    points,
                    level,
                    responseRate,
                    currentStreak,
                    completeDays,
                    avatar);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "nickname='" + nickname + '\'' +
                ", points=" + points +
                ", level=" + level +
                ", responseRate=" + responseRate +
                ", currentStreak=" + currentStreak +
                ", completeDays=" + completeDays +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
