/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.projeto.model;
import java.util.ArrayList;
import java.util.List;

import java.util.Date;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;


@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Aquario {
    @Id
    private long idAquario;
    private String nome;
    private String endereco;
    private String horario_func;
    private String contato;
    private float precoIngresso;
    
    public Aquario() {

    }
    
    public long getIdAquario() {
        return idAquario;
    }

    public void setIdAquario(long idAquario) {
        this.idAquario = idAquario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getendereco() {
        return endereco;
    }

    public void setendereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String gethorario_func() {
        return horario_func;
    }

    public void sethorario_func(String horario_func) {
        this.horario_func = horario_func;
    }
    
     public String getcontato() {
        return contato;
    }

    public void setcontato(String contato) {
        this.contato = contato;
    }
    
    public float getprecoIngresso() {
        return precoIngresso;
    }

    public void setprecoIngresso(float precoIngresso) {
        this.precoIngresso = precoIngresso;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (this.idAquario ^ (this.idAquario >>> 32));
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
        final Aquario other = (Aquario) obj;
        if (this.idAquario!= other.idAquario) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Aquario{" + "idAquario=" + idAquario + ", nome=" + nome
                + ", endereco=" + endereco + ", horario_func=" + horario_func + ", contato=" + contato +
                ", precoIngresso=" + precoIngresso + '}';
    }
}
