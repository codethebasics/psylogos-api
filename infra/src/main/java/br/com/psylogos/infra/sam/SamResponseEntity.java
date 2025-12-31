package br.com.psylogos.infra.sam;

import core.data.SamResponse;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(schema = "psylogos", name = "tb_sam_response")
public class SamResponseEntity {

    public SamResponseEntity(SamResponse sam) {
        this.pleasure = sam.getPleasure();
        this.arousal = sam.getArousal();
        this.dominance = sam.getDominance();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "pleasure")
    private Integer pleasure;

    @Column(name = "arousal")
    private Integer arousal;

    @Column(name = "dominance")
    private Integer dominance;
}
