package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter //Constrói todos os Gets pelo Lombok
@Setter //Constrói todos os Sets pelo Lombok
@AllArgsConstructor //Constrói todos os construtores com parâmetro pelo Lombok
@NoArgsConstructor  //Constrói todos os construtores sem parâmetro pelo Lombok
@EqualsAndHashCode  //Constrói o Equal e HashCode pelo Lombok
@Builder
@Entity
@Audited
public class Usuario {
    @Id
    private Long id;
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    @ManyToOne
    private Empresa empresa;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;
}
