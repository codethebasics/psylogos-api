package br.com.psylogos.infra.ping;

import br.com.psylogos.infra.game.GameStateEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(schema = "psylogos", name = "tb_ping_status_matrix")
public class PingStatusMatrixEntity {
    @EmbeddedId
    private PingStatusMatrixId id;

    @OneToMany(mappedBy = "pingStatusMatrix")
    private List<PingStatusEntity> pingStatus;

    @MapsId("gameStateId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_gamestate")
    private GameStateEntity gameState;
}
