package io.github.Guimaraes131.super_poderes_inuteis.superPoder;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "superpoder")
public class SuperPoder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;

    @Column(name = "nivel_inutilidade")
    private Integer nivelInutilidade;
}
