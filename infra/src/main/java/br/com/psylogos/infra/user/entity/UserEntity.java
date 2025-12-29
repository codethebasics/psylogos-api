package br.com.psylogos.infra.user.entity;

import jakarta.persistence.*;

@Entity
@Table(schema = "psylogos", name = "tb_user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

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
