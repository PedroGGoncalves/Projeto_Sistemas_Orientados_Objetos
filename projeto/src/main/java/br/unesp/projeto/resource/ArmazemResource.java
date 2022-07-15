package br.unesp.projeto.resource;

import br.unesp.projeto.model.Armazem;
import br.unesp.projeto.service.ArmazemService;
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

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("/armazem")
@Slf4j
public class ArmazemResource {
    

    private ArmazemService armazemService;
    
    @GetMapping("/")
    public List<Armazem> getAllArmazem() {

        return armazemService.findAll();
    }
    
    
    @GetMapping("/{idArmazem}")
    public Armazem getArmazemByCpf(@PathVariable(value = "idArmazem") long idArmazem) {
        Armazem armazem = armazemService.findById(idArmazem);

        return armazem;
    }
    
    @DeleteMapping("/{idArmazem}")
    public boolean delete(@PathVariable(value = "idArmazem") long idArmazem) {
        boolean delete = false;
        Armazem armazemDelete = armazemService.findById(idArmazem);

        if (armazemDelete != null){
         armazemService.delete(armazemDelete);
         delete = true;
        }        

        return delete;
    }
    
    
    @PostMapping("/")
    public boolean saveArmazem(@RequestBody Armazem armazem) {
        boolean insert = false;

        Armazem armazemInsert = armazemService.save(armazem);
        if (armazemInsert != null){
            insert = true;
        }

        return insert;
    }
    
    
    @PutMapping("/{idArmazem}")
    public boolean updateArmazem(@PathVariable(value = "idArmazem") long idArmazem,
            @RequestBody Armazem armazem) {
        boolean update = false;
        
        Armazem armazemUpdate = armazemService.findById(idArmazem);        
        Armazem newArmazem = armazemService.findById(idArmazem);  
        // Campos que estão sendo atualizados
        armazemUpdate.setIdArmazem(newArmazem.getIdArmazem());

        Armazem armazemUpdated = armazemService.update(armazemUpdate);
        if (armazemUpdated != null){
            update = true;
        }

        return update;
    }
    
    
}
