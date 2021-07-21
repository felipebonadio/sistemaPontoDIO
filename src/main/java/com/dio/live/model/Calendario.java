package com.dio.live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter //Constrói todos os Gets pelo Lombok
@Setter //Constrói todos os Sets pelo Lombok
@AllArgsConstructor //Constrói todos os construtores com parâmetro pelo Lombok
@NoArgsConstructor  //Constrói todos os construtores sem parâmetro pelo Lombok
@EqualsAndHashCode  //Constrói o Equal e HashCode pelo Lombok
@Builder
@Entity
public class Calendario {
    @Id
    private Long id;
    @ManyToOne
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
}
