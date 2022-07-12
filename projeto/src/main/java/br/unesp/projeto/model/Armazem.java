/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.model;
import java.util.ArrayList;
import java.util.List;

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

public class Armazem {
     @Id
     // private List<Comida> alimento;
     private long idArmazem;
    private int quantidade;
    
    public Armazem() {

    }
    
    public long getIdArmazem() {
        return idArmazem;
    }

    public void setIdArmazem(long idArmazem) {
        this.idArmazem = idArmazem;
    }
    
     public int getquantidade() {
        return quantidade;
    }

    public void setquantidade(int quantidade) {
        this.quantidade = quantidade;
    }
   
     /*
    public Comida getComida() {
        return alimento;
    }

    public void setComida(Comida especie) {
        this.alimento = alimento;
    }*/
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (this.idArmazem ^ (this.idArmazem >>> 32));
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
        final Armazem other = (Armazem) obj;
        if (this.idArmazem!= other.idArmazem) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Armazem{" + "idArmazem=" + idArmazem + ", nome=" + quantidade
                + ", quantidade="  + '}';
    }
}
