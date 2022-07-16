package br.unesp.projeto.service;


public class ServiceFactory {
    
    private ServiceFactory(){        
    }
    
    public static AquarioService getAquarioService(){
        return new AquarioServiceImpl();
    }
    
    public static ArmazemService getArmazemService(){
        return new ArmazemServiceImpl();
    }
    
    public static FuncionarioService getFuncionarioService(){
        return new FuncionarioServiceImpl();
    }
    
    public static LoginService getLoginService(){
        return new LoginServiceImpl();
    }
    
    public static Medidor_OxigenaçãoService getMedidor_OxigenaçãoService(){
        return new Medidor_OxigenaçãoServiceImpl();
    }
    
     public static Medidor_SalinidadeService getMedidor_SalinidadeService(){
        return new Medidor_SalinidadeServiceImpl();
    }
     
      public static Medidor_pHService getMedidor_pHService(){
        return new Medidor_pHServiceImpl();
    }
      
       public static TanqueService getTanqueService(){
        return new TanqueServiceImpl();
    }
       
        public static TermostatoService getTermostatoService(){
        return new TermostatoServiceImpl();
    }
}
