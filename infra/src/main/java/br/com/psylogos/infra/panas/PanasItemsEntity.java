package br.com.psylogos.infra.panas;


import core.enums.PanasStatusEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(schema = "psylogos", name = "tb_panas_items")
public class PanasItemsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "item")
    @Enumerated(EnumType.STRING)
    private List<PanasStatusEnum> items;
}
