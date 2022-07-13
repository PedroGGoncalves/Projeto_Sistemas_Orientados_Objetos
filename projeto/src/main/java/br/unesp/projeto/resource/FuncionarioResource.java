package br.unesp.projeto.resource;

import br.unesp.projeto.model.Funcionario;
import br.unesp.projeto.service.FuncionarioServiceImpl;
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
    
    
    @GetMapping("/{IdFuncionario}")
    public Funcionario getFuncionarioByCpf(@PathVariable(value = "IdFuncionario") Long IdFuncionario) {
        Funcionario funcionario = funcionarioService.find(IdFuncionario);

        return funcionario;
    }
    
    @DeleteMapping("/{IdFuncionario}")
    public boolean delete(@PathVariable(value = "IdFuncionario") Long IdFuncionario) {
        boolean delete = false;
        Funcionario funcionarioDelete = funcionarioService.find(IdFuncionario);

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
    
    
    @PutMapping("/{IdFuncionario}")
    public boolean updateFuncionario(@PathVariable(value = "IdFuncionario") Long IdFuncionario,
            @RequestBody Funcionario funcionario) {
        boolean update = false;
        
        Funcionario funcionarioUpdate = funcionarioService.find(IdFuncionario);        
        Funcionario newFuncionario = funcionarioService.find(IdFuncionario);  
        // Campos que estão sendo atualizados
        funcionarioUpdate.setNome_completo(newFuncionario.getNome_completo());

        Funcionario funcionarioUpdated = funcionarioService.update(funcionarioUpdate);
        if (funcionarioUpdated != null){
            update = true;
        }

        return update;
    }
    
    
}
  
