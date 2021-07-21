package com.dio.live.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class BancoHoras {

    @AllArgsConstructor //Constrói todos os construtores com parâmetro pelo Lombok
    @NoArgsConstructor  //Constrói todos os construtores sem parâmetro pelo Lombok
    @EqualsAndHashCode  //Constrói o Equal e HashCode pelo Lombok
    @Embeddable
    public class BancoHorasId implements Serializable{
        private long idBancoHoras;
        private long idMovimentacao;
        private long idUsuario;
    }
    @EmbeddedId
    private BancoHorasId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;
}
