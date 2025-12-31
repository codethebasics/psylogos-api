package br.com.psylogos.infra.game;

import br.com.psylogos.infra.badge.BadgeEntity;
import br.com.psylogos.infra.data.SocialDemographicDataEntity;
import br.com.psylogos.infra.ping.PingStatusMatrixEntity;
import br.com.psylogos.infra.user.UserEntity;
import br.com.psylogos.infra.instrument.InstrumentResponseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
@Table(schema = "psylogos", name = "tb_game_state")
public class GameStateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_user")
    private UserEntity user;

    @OneToMany(mappedBy = "gameState")
    private List<BadgeEntity> badges;

    @Column(name = "has_onboarded")
    private Boolean hasOnboarded;

    @Column(name = "study_start_date")
    private LocalDateTime studyStartDate;

    @OneToMany(mappedBy = "gameState")
    private List<InstrumentResponseEntity> responses;

    @OneToMany(mappedBy = "gameState")
    private List<PingStatusMatrixEntity> pingsStatusesMatrix;

    @OneToOne(mappedBy = "gameState")
    private SocialDemographicDataEntity socialDemographicData;
}
