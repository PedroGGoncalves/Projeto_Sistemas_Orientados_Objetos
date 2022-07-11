/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;

public class ServiceFactory {
    private ServiceFactory(){        
    }
    
    public static AquarioService getAquarioService(){
        return new AquarioServiceImpl();
    }
    
    public static ArmazemService getArmazemService(){
        return new  ArmazemServiceImpl();
    }
    public static FuncionarioService getFuncionarioService(){
        return new  FuncionarioServiceImpl();
    }
    public static TanqueService getTanqueService(){
        return new  TanqueServiceImpl();
    }
    public static TermostatoService getTermostatoService(){
        return new  TermostatoServiceImpl();
    }
    public static loginService getloginService(){
        return new  loginServiceImpl();
    }
    public static medidor_OxigenaçãoService getmedidor_OxigenaçãoService(){
        return new  medidor_OxigenaçãoServiceImpl();
    }
    public static  medidor_SalinidadeService getmedidor_SalinidadeService(){
        return new  medidor_SalinidadeServiceImpl();
    }
    public static medidor_pHService getmedidor_pHService(){
        return new  medidor_pHServiceImpl();
    }
}
