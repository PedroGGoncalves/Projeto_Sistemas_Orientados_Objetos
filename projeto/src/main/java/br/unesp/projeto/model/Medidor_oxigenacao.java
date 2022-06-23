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
class Medidor_oxigenacao {
    private int oxigenacao;
    
    public Medidor_oxigenacao () {
       // this.itemTermostato   = new ArrayList<>();
    }
    
    public int getoxigenacao() {
        return oxigenacao;
    }

    public void setoxigenacao(int oxigenacao) {
        this.oxigenacao = oxigenacao;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) ((this.oxigenacao >>> 32) ^ this.oxigenacao);
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
        final Medidor_oxigenacao other = (Medidor_oxigenacao) obj;
        if (this.oxigenacao != other.oxigenacao) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Medidor_oxigenacao{" + "oxigenacao=" + oxigenacao + '}';
    }
}
