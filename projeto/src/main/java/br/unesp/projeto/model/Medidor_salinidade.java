/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.projeto.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author aluno
 */
public class Medidor_salinidade {
    private int salinidade;
    
    public Medidor_salinidade () {
       // this.itemTermostato   = new ArrayList<>();
    }
    
    public int getsalinidade() {
        return salinidade;
    }

    public void setsalinidade(int ph) {
        this.salinidade = salinidade;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) ((this.salinidade >>> 32) ^ this.salinidade);
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
        final Medidor_salinidade other = (Medidor_salinidade) obj;
        if (this.salinidade != other.salinidade) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Medidor_salinidade{" + "salinidade=" + salinidade + '}';
    }
}
