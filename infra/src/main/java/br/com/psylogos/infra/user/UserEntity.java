package br.com.psylogos.infra.user;

import core.data.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(schema = "psylogos", name = "tb_user")
public class UserEntity {

    public UserEntity(User user) {
        this.nickname = user.getNickname();
        this.points = user.getPoints();
        this.level = user.getLevel();
        this.responseRate = user.getResponseRate();
        this.currentStreak = user.getCurrentStreak();
        this.completeDays = user.getCompleteDays();
        this.avatar = user.getAvatar();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nickname", unique = true, nullable = false)
    private String nickname;

    @Column(name = "points")
    private Integer points;

    @Column(name = "level")
    private Integer level;

    @Column(name = "response_rate")
    private Integer responseRate;

    @Column(name = "current_streak")
    private Integer currentStreak;

    @Column(name = "complete_days")
    private Integer completeDays;

    @Column(name = "avatar")
    private String avatar;
}
