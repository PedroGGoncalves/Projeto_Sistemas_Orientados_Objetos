/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.projeto.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
/**
 *
 * @author aluno
 */
public class Funcionario {
    private long idFuncionario;
    private String nome_completo;
    private String RG;
    private String CPF;
   // private List<Area> funcao;
    private float salario;
    private Date data_nascimento;
    private Date contratacao;
    private boolean login;
    private List<Login> loginn;
    
    public Funcionario() {

    }
    
    public long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    
    public String getNome() {
        return nome_completo;
    }

    public void setNome(String nome_completo) {
        this.nome_completo = nome_completo;
    }
    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
    
     public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    /*
    public Area getArea() {
        return funcao;
    }

    public void setArea(Area funcao) {
        this.funcao = funcao;
    }*/
    
    public float getsalario() {
        return salario;
    }

    public void setsalario(float salario) {
        this.salario = salario;
    }
    
    public Date getdata_nascimento() {
        return data_nascimento;
    }

    public void setdata_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    
    public Date getcontratacao() {
        return contratacao;
    }

    public void setcontratacao(Date contratacao) {
        this.contratacao = contratacao;
    }
    
    public boolean islogin() {
        return login;
    }

    public void setlogin(boolean login) {
        this.login = login;
    }
    
    public List<Login> getLoginn() {
        return loginn;
    }

    public void setLoginn(List<Login> loginn) {
        this.loginn = loginn;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (this.idFuncionario ^ (this.idFuncionario >>> 32));
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
        final Funcionario other = (Funcionario) obj;
        if (this.idFuncionario!= other.idFuncionario) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Funcionario{" + "idFuncionario=" + idFuncionario + ", nome_completo=" + nome_completo
                + ",RG=" + RG + ", CPF=" + CPF + ", salario="
                + salario + ", data_nascimento=" + data_nascimento + ", contratacao="
                + contratacao + ", status=" + login + ", loginn=" + loginn +'}';
        /*falta o Area funcao aki*/
    }

    public java.sql.Date getcontratacaoo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
