package br.com.psylogos.infra.panas;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(schema = "psylogos", name = "tb_panas_response_entity")
public class PanasResponseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "adjectives")
    private List<String> adjectives;
}
