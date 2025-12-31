package br.com.psylogos.infra.ping;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class PingStatusMatrixId {
    @Column(name = "id")
    private Long id;

    @Column(name = "linha")
    private Integer linha;

    @Column(name = "coluna")
    private Integer coluna;

    @Column(name = "id_gamestate")
    private Long gameStateId;
}
