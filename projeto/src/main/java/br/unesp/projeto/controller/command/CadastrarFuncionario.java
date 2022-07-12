package br.unesp.projeto.controller.command;

import br.unesp.projeto.model.Funcionario;
import br.unesp.projeto.service.FuncionarioService;
import br.unesp.projeto.service.ServiceFactory;
import java.sql.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastrarFuncionario implements ICommand {
    
     private FuncionarioService service;
     
     
      public CadastrarFuncionario() {
        this.service = ServiceFactory.getFuncionarioService();
    }
    
     @Override
        public String execute(HttpServletRequest request, HttpServletResponse response) {
        String page = "index.html";

        String nome = request.getParameter("nome_completo");
        String rg = request.getParameter("RG");
        String cpf = request.getParameter("CPF");
        String salario = request.getParameter("salário");
        String datanasc = request.getParameter("data_nascimento");
        String contr = request.getParameter("contratacao");
        String log = request.getParameter("login");
        String log2 = request.getParameter("loginn");
    
        System.out.println("DADOS: "
                + nome + " - "
                + rg + " - "
                + cpf + " - "
                + salario + " - "
                + datanasc + " - "
                + contr + " - "
                + log + " - "
                + log2 + " - "
        );
        
        Funcionario func = new Funcionario();
        func.setNome(nome);
        func.setRG(rg);
        func.setCPF(cpf);
        func.setsalario(Float.parseFloat(salario));
        func.setdata_nascimento((datanasc));
        func.setcontratacao((contr));
        func.setlogin(Boolean.parseBoolean(log));
        func.setLoginn((log2));
        

        return page;
    }
}
       
