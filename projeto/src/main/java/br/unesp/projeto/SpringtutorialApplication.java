package br.unesp.projeto;

import br.unesp.projeto.entity.*;
import br.unesp.projeto.service.*;
import br.unesp.projeto.utils.InstanceGenerator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringtutorialApplication implements CommandLineRunner {
    private AquarioService aq = new AquarioService();
    private ArmazemService ar = new ArmazemService();
    private FuncionarioService func = new FuncionarioService();
    private LoginService log = new LoginService();
    private Medidor_OxigenaçãoService medOxi = new Medidor_OxigenaçãoService();
    private Medidor_SalinidadeService medSal = new Medidor_SalinidadeService();
    private Medidor_pHService medPh = new Medidor_pHService();
    private TanqueService tan = new TanqueService();
    private TermostatoService term = new TermostatoService();
    
    
    public static void main(String[] args) {
        SpringApplication.run(SpringtutorialApplication.class, args);
    }
    

    @Override
    public void run(String... args) throws Exception {
        
    int op = -1;
         
       while (op != 6) {
            op = leitura();

            switch (op) {
                case 1: {
                    System.out.println("Inserindo....");
                    Aquario aquario = InstanceGenerator.getAquario("Aquarium", "Rua 5", "09h - 17h","aquarium@uol.com.br" ,(float) 30.0,null,null,null);
                    Armazem armazem = InstanceGenerator.getArmazem(5);
                    
                    
                    System.out.println(aquario);
                    aq.save(aquario);
                    ar.save(armazem);
      
                }
                break;
                case 2: {
                    System.out.println("Atualizando....");
                    final int id=0;
                    Aquario fc = aq.findById(id);
                    System.out.println(fc);
                    
                    Aquario fu = aq.update(fc);
                    System.out.println(fu);
                }
                break;
                case 3: {
                    System.out.println("Excluindo....");                    
                    final int id=0;
                    System.out.println("Localizando uma pessoa para o ID: " + id);
                    Aquario fc = aq.findById(id);
                    System.out.println(fc);
                    System.out.println("Excluindo a pessoa de CPF: " + fc.getIdAquario());
                    aq.delete(fc);                    
                }
                break;
                case 4: {
                    System.out.println("Consultando....");
                    final int id=0;
                    System.out.println("Localizando uma pessoa para o CPF: " + id);
                    Aquario fc = aq.findById(id);
                    System.out.println(fc);
                }
                break;
                case 5: {
                    System.out.println("Listando todos....");
                    List<Aquario> list = aq.findAll();
                    for (Aquario f : list){
                        System.out.println(f);
                    }
                }
                break;
                case 6: {
                    System.out.println("Saindo....");
                }
                
            }

        }
    }  
    
    
     private int leitura() {
        System.out.println("1 - Inserir");
        System.out.println("2 - Atualizar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Consultar");
        System.out.println("5 - Listar todos");
        System.out.println("6 - Sair");
        System.out.print("OPÇÃO: ");
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();  
      }
     
}
