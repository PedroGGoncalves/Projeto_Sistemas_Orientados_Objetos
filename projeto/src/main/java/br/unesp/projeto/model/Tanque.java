/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.projeto.model;
import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;


@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Tanque {
    @Id
    // private List<Comida> alimento;
    // private List<Especies> especie;
    private long idTanque;
    private int individuos;
    private float ph;
    private float salinidade;
    private float oxigenacao;
    private String horario_alimento;
    private boolean filtro;
    private String QR_CODE;
    private Termostato termostato;
    private Medidor_ph medidor_ph;
    private Medidor_salinidade medidor_salinidade;
    private Medidor_oxigenacao medidor_oxigenacao;
    /*temperatura termostato seria a msm do tanque?*/
    
    public Tanque() {

    }
    /*
    public Comida getComida() {
        return alimento;
    }

    public void setComida(Comida especie) {
        this.alimento = alimento;
    }*/
    /*
    public Especies getEspecies() {
        return especie;
    }

    public void setEspecies(Especies especie) {
        this.especie = especie;
    }*/
    public long getIdTanque() {
        return idTanque;
    }

    public void setIdTanque(long idTanque) {
        this.idTanque = idTanque;
    }
    
    public int getindividuos() {
        return individuos;
    }

    public void setsalario(int individuos) {
        this.individuos = individuos;
    }
    
    public float getph() {
        return ph;
    }

    public void setph(float ph) {
        this.ph = ph;
    }
    
     public float getsalinidade() {
        return salinidade;
    }

    public void setsalinidade(float salinidade) {
        this.salinidade = salinidade;
    }

    public float getoxigenacao() {
        return oxigenacao;
    }

    public void setoxigenacao(float oxigenacao) {
        this.oxigenacao = oxigenacao;
    }
    
    public String gethorario_alimento() {
        return horario_alimento;
    }

    public void sethorario_alimento(String horario_alimento) {
        this.horario_alimento = horario_alimento;
    }
    
    public boolean isfiltro() {
        return filtro;
    }

    public void setfiltro(boolean filtro) {
        this.filtro = filtro;
    }
    
    public String getQR_CODE() {
        return QR_CODE;
    }

    public void setQR_CODE(String QR_CODE) {
        this.QR_CODE= QR_CODE;
    }
    
    public Termostato getTermostato() {
        return termostato;
    }

    public void setTermostato(Termostato termostato) {
        this.termostato = termostato;
    }
    
    public Medidor_ph getMedidor_ph() {
        return medidor_ph;
    }

    public void setMedidor_ph(Medidor_ph medidor_ph) {
        this.medidor_ph = medidor_ph;
    }
    
    public Medidor_salinidade getMedidor_salinidade() {
        return medidor_salinidade;
    }

    public void setMedidor_salinidade(Medidor_salinidade medidor_salinidade) {
        this.medidor_salinidade = medidor_salinidade;
    }
    
    public Medidor_oxigenacao getMedidor_oxigenacao() {
        return medidor_oxigenacao;
    }

    public void setMedidor_oxigenacao(Medidor_oxigenacao medidor_oxigenacao) {
        this.medidor_oxigenacao = medidor_oxigenacao;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (this.idTanque ^ (this.idTanque >>> 32));
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tanque other = (Tanque) obj;
        if (this.idTanque!= other.idTanque) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Tanque{" + "idTanque=" + idTanque + ", individuos=" + individuos
                + ",ph=" + ph + ", salinidade=" + salinidade + ", oxigenacao="
                + oxigenacao + ", horario_alimento=" + horario_alimento + ", filtro="
                + filtro + ", QR_CODE=" + QR_CODE + ",termostato="+termostato+",medidor_ph="
                +medidor_ph+",medidor_salinidade="+medidor_salinidade+",medidor_oxigenacao="+medidor_oxigenacao+'}';
        /*falta o comida e especies aki*/
    }
}
