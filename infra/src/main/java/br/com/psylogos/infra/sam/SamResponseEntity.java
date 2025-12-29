package br.com.psylogos.infra.sam;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = "psylogos", name = "tb_sam_response")
public class SamResponseEntity {

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
