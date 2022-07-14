/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.utils;

import br.unesp.projeto.entity.Aquario;
import br.unesp.projeto.entity.Armazem;
import br.unesp.projeto.entity.Funcionario;
import br.unesp.projeto.entity.Login;
import br.unesp.projeto.entity.Medidor_oxigenacao;
import br.unesp.projeto.entity.Medidor_ph;
import br.unesp.projeto.entity.Medidor_salinidade;
import br.unesp.projeto.entity.Tanque;
import br.unesp.projeto.entity.Termostato;
import java.util.Date;
import java.util.List;

public class InstanceGenerator {
    
    private InstanceGenerator() {

    }  
    
    private String nome;
    private String endereco;
    private String horario_func;
    private String contato;
    private float precoIngresso;
    
      public static Aquario getAquario(long idAquario, String nome, String endereco, String horario_func,
        String contato, float precoIngresso, Funcionario funcionario, Tanque tanque, Armazem armazem  ){
        Aquario aquario = new Aquario();
        aquario.setIdAquario(idAquario);
        aquario.setNome(nome);
        aquario.setEndereco(endereco);
        aquario.setHorario_func(horario_func);
        aquario.setFuncionario(funcionario);
        aquario.setTanque(tanque);
        aquario.setArmazem(armazem);
      
        return aquario;
    }
      
    public static Armazem getArmazem(long idArmazem, int quantidade){
        Armazem armazem = new Armazem();
        armazem.setIdArmazem(idArmazem);
        armazem.setQuantidade(quantidade);
        
        return armazem;
    }
    
    public static Funcionario getFuncionario(long idFuncionario, String nome_completo, String RG, String CPF,
        float salario, Date data_nascimento, Date contratacao, boolean login, Tanque tanques, Login logins ){
        Funcionario funcionario = new Funcionario();
        funcionario.setIdFuncionario(idFuncionario);
        funcionario.setNome_completo(nome_completo);
        funcionario.setRG(RG);
        funcionario.setCPF(CPF);
        funcionario.setSalario(salario);
        funcionario.setData_nascimento(data_nascimento);
        funcionario.setContratacao(contratacao);
        funcionario.setLogin(login);
        funcionario.setTanques(tanques);
        funcionario.setLogins(logins);
      
        return funcionario;
    }
    
     public static Login getLogin(String ID, String Senha){
        Login login = new Login();
        login.setID(ID);
        login.setSenha(Senha);
 
      
        return login;
    }

     
     
      public static Medidor_oxigenacao getMedidor_oxigenacao(long idMedidor_Oxigenacao, float oxigenacao){
        Medidor_oxigenacao medidorOxi = new Medidor_oxigenacao();
        medidorOxi.setIdMedidor_Oxigenacao(idMedidor_Oxigenacao);
        medidorOxi.setOxigenacao(oxigenacao);
 
      
        return medidorOxi;
    }
      
       public static Medidor_ph getMedidor_ph(long idMedidor_ph, float ph){
        Medidor_ph medidorPh = new Medidor_ph();
        medidorPh.setIdMedidor_ph(idMedidor_ph);
        medidorPh.setPh(ph);
 
      
        return medidorPh;
    }
       
       public static Medidor_salinidade getMedidor_salinidade(long idMedidor_Salinidade, float salinidade){
        Medidor_salinidade medidorSal = new Medidor_salinidade();
        medidorSal.setIdMedidor_Salinidade(idMedidor_Salinidade);
        medidorSal.setSalinidade(salinidade);
 
      
        return medidorSal;
    }
       
        public static Tanque getTanque(long idTanque, int individuos, float ph, float salinidade,
                float oxigenacao,String horario_alimento,boolean filtro,String QR_CODE,
                Funcionario funcionarios,Termostato termostato, Medidor_ph medidor_ph,
                Medidor_salinidade medidor_salinidade, Medidor_oxigenacao medidor_oxigenacao){
        Tanque tanque = new Tanque();
        tanque.setIdTanque(idTanque);
        tanque.setIndividuos(individuos);
        tanque.setPh(ph);
        tanque.setSalinidade(salinidade);
        tanque.setOxigenacao(oxigenacao);
        tanque.setHorario_alimento(horario_alimento);
        tanque.setFiltro(filtro);
        tanque.setQR_CODE(QR_CODE);
        tanque.setFuncionarios((List<Funcionario>) funcionarios);
        tanque.setTermostato(termostato);
        tanque.setMedidor_ph(medidor_ph);
        tanque.setMedidor_salinidade(medidor_salinidade);
        tanque.setMedidor_oxigenacao(medidor_oxigenacao);
 
    
        return tanque;
    }
      
}
