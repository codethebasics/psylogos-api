package br.com.psylogos.infra.panas;

import core.data.PanasResponse;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(schema = "psylogos", name = "tb_panas_response")
public class PanasResponseEntity {

    public PanasResponseEntity(PanasResponse panasResponse) {
        this.adjectives = Arrays.asList(panasResponse.getAdjectives());
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "adjectives")
    private List<String> adjectives;
}
