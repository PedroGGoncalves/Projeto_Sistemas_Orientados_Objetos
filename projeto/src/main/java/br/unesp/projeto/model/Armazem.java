/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.model;
import java.util.ArrayList;
import java.util.List;

public class Armazem {
    
     // private List<Comida> alimento;
     private long idArmazem;
    private int quantidade;
    
    public Armazem() {

    }
    
    public long getIdAquario() {
        return idArmazem;
    }

    public void setIdAquario(long idAquario) {
        this.idArmazem = idAquario;
    }
    
     public int getquantidade() {
        return quantidade;
    }

    public void setIquantidade(int quantidade) {
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
