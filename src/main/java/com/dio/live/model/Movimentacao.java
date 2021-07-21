package com.dio.live.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter //Constrói todos os Gets pelo Lombok
@Setter //Constrói todos os Sets pelo Lombok
@AllArgsConstructor //Constrói todos os construtores com parâmetro pelo Lombok
@NoArgsConstructor  //Constrói todos os construtores sem parâmetro pelo Lombok
@EqualsAndHashCode  //Constrói o Equal e HashCode pelo Lombok
@Builder
@Entity
public class Movimentacao {

    @AllArgsConstructor //Constrói todos os construtores com parâmetro pelo Lombok
    @NoArgsConstructor  //Constrói todos os construtores sem parâmetro pelo Lombok
    @EqualsAndHashCode  //Constrói o Equal e HashCode pelo Lombok
    @Embeddable //duas chaves primarias embutidas
    public class MovimentacaoId implements Serializable{
        private long idMovimento;
        private long idUsuario;
    }
    @Id
    @EmbeddedId //fala que o id composto é dessa classe
    private MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private Calendario calendario;

}
