package br.com.psylogos.infra.badge;

import br.com.psylogos.infra.game.GameStateEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(schema = "psylogos", name = "tb_badge")
public class BadgeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "unlocked")
    private Boolean unlocked;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_gamestate")
    private GameStateEntity gameState;
}
