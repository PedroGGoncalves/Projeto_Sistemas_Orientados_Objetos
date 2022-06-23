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
public class WebSite {
    private long idWebSite;
    private String Descricao;
    private String horario_func;
    private String contato;
    private String DescricaoValores;
    
    public WebSite() {

    }
    
    public long getIdWebSite() {
        return idWebSite;
    }

    public void setWebSite(long idWebSite) {
        this.idWebSite = idWebSite;
    }
    
    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
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
    
    public String getDescricaoValores() {
        return DescricaoValores;
    }

    public void setDescricaoValores(String DescricaoValores) {
        this.DescricaoValores = DescricaoValores;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (this.idWebSite ^ (this.idWebSite >>> 32));
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
        final WebSite other = (WebSite) obj;
        if (this.idWebSite!= other.idWebSite) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "WebSite{" + "idWebSite=" + idWebSite + ",Descricao=" +Descricao+ ", horario_func=" + horario_func + ",contato="+contato+",DescricaoValores="+DescricaoValores+'}';
    }
}
