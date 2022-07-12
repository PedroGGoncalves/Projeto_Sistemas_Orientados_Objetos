package br.unesp.projeto.resource;

import br.unesp.projeto.model.Funcionario;
import br.unesp.projeto.service_r.FuncionarioServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entidade/api")
public class FuncionarioResource {
    
    @Autowired
    private FuncionarioServiceImpl funcionarioService;
    
    @GetMapping("/")
    public List<Funcionario> getAllFuncionario() {

        return funcionarioService.findAll();
    }
    
    
    @GetMapping("/{cpf}")
    public Funcionario getFuncionarioByCpf(@PathVariable(value = "cpf") String cpf) {
        Funcionario funcionario = funcionarioService.findByCpf(cpf);

        return funcionario;
    }
    
    @DeleteMapping("/{cpf}")
    public boolean delete(@PathVariable(value = "cpf") String cpf) {
        boolean delete = false;
        Funcionario funcionarioDelete = funcionarioService.findByCpf(cpf);

        if (funcionarioDelete != null){
         funcionarioService.delete(funcionarioDelete);
         delete = true;
        }        

        return delete;
    }
    
    
    @PostMapping("/")
    public boolean saveFuncionario(@RequestBody Funcionario funcionario) {
        boolean insert = false;

        Funcionario funcionarioInsert = funcionarioService.save(funcionario);
        if (funcionarioInsert != null){
            insert = true;
        }

        return insert;
    }
    
    
    @PutMapping("/{cpf}")
    public boolean updateFuncionario(@PathVariable(value = "cpf") String cpf,
            @RequestBody Funcionario funcionario) {
        boolean update = false;
        
        Funcionario funcionarioUpdate = funcionarioService.findByCpf(cpf);        
        Funcionario newFuncionario = funcionarioService.findByCpf(cpf);  
        // Campos que estão sendo atualizados
        funcionarioUpdate.setNome(newFuncionario.getNome());

        Funcionario funcionarioUpdated = funcionarioService.update(funcionarioUpdate);
        if (funcionarioUpdated != null){
            update = true;
        }

        return update;
    }
    
    
}
  
