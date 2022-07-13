/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;


public class DaoFactory {
    private DaoFactory(){        
    }
    
    public static AquarioDAO getAquarioDAO(){
        return new  AquarioDAOImpl();
    }
    
    public static ArmazemDAO getArmazemDAO(){
        return new  ArmazemDAOImpl();
    }
    
    public static FuncionarioDAO getFuncionarioDAO(){
        return new  FuncionarioDAOImpl();
    }
    
    public static LoginDAO getLoginDAO(){
        return new  LoginDAOImpl();
    }
    public static TanqueDAO getTanqueDAO(){
        return new  TanqueDAOImpl();
    }
    
    public static TermostatoDAO getTermostatoDAO(){
        return new  TermostatoDAOImpl();
    }
    
    public static medidor_OxigenaçãoDAO getmedidor_OxigenaçãoDAO(){
        return new  medidor_OxigenacaoDAOImpl();
    }
    public static medidor_SalinidadeDAO getmedidor_salinidadeDAO(){
        return new  medidor_SalinidadeDAOImpl();
    }
    public static medidor_PhDAO getmedidor_pHDAO(){
        return new  medidor_PhDAOImpl();
    }
    
    
}

