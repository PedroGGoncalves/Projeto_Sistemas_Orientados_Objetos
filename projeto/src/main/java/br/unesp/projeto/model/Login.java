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
public class Login {
    private long idLogin;
    private String ID;
    private String Senha;
    
    public Login() {

    }
    
    public long getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(long idLogin) {
        this.idLogin = idLogin;
    }
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
     public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (this.idLogin ^ (this.idLogin >>> 32));
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
        final Login other = (Login) obj;
        if (this.idLogin!= other.idLogin) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Login{" + "idLogin=" + idLogin + ",ID=" +ID + ", Senha=" + Senha +'}';
    }
    
}
