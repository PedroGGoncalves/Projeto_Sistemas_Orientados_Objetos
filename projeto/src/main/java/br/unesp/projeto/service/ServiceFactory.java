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
        return (AquarioService) new AquarioServiceImpl();
    }
    
    public static ArmazemService getArmazemService(){
        return (ArmazemService) new  ArmazemServiceImpl();
    }
    public static FuncionarioService getFuncionarioService(){
        return (FuncionarioService) new  FuncionarioServiceImpl();
    }
    public static TanqueService getTanqueService(){
        return (TanqueService) new  TanqueServiceImpl();
    }
    public static TermostatoService getTermostatoService(){
        return (TermostatoService) new  TermostatoServiceImpl();
    }
    public static LoginService getloginService(){
        return (LoginService) new  loginServiceImpl();
    }
    public static medidor_OxigenaçãoService getmedidor_OxigenaçãoService(){
        return (medidor_OxigenaçãoService) new  medidor_OxigenaçãoServiceImpl();
    }
    public static  medidor_SalinidadeService getmedidor_SalinidadeService(){
        return (medidor_SalinidadeService) new  medidor_SalinidadeServiceImpl();
    }
    public static medidor_pHService getmedidor_pHService(){
        return (medidor_pHService) new  medidor_pHServiceImpl();
    }
}
