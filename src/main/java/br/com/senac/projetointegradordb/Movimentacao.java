
package br.com.senac.projetointegradordb;

import RegraNegocios.AjudaCustoCalcularValor;
import RegraNegocios.AjudaCustoDefinirPorcentagem;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;

/**
 * Classe Movimentação
 * @author daviremzetti
 */
@Entity @Table(name="movimentacao")
public class Movimentacao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne @JoinColumn(name = "idMilitar")
    private Militar militar;
    @ManyToOne @JoinColumn(name = "idOrigem")
    private Lotacao origem;
    @ManyToOne @JoinColumn(name = "idDestino")
    private Lotacao destino;
    @Column(name="dataMov")
    private LocalDate Data_Mov;
    private float porcentagem;
    private float valor;
    private String pago = "NÃO";

    public int getId() {
        return id;
    }

    public Militar getMilitar() {
        return militar;
    }

    public Lotacao getOrigem() {
        return origem;
    }

    public Lotacao getDestino() {
        return destino;
    }

    public LocalDate getData_Mov() {
        return Data_Mov;
    }

    public float getPorcentagem() {
        return porcentagem;
    }

    public float getValor() {
        return valor;
    }

    public String getPago() {
        return pago;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMilitar(Militar militar) {
        this.militar = militar;
    }

    public void setOrigem(Lotacao origem) {
        this.origem = origem;
    }

    public void setDestino(Lotacao destino) {
        this.destino = destino;
    }

    public void setData_Mov(LocalDate Data_Mov) {
        this.Data_Mov = Data_Mov;
    }

    public void setPorcentagem() {
        this.porcentagem = AjudaCustoDefinirPorcentagem.definir(militar, this);
    }

    public void setValor() {
        this.valor = AjudaCustoCalcularValor.definir(militar, this);
    }

    public void setPago(String pago) {
        this.pago = pago;
    }
}
