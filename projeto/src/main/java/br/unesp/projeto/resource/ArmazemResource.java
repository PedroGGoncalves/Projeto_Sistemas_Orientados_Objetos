package br.unesp.projeto.resource;

import br.unesp.projeto.model.Armazem;
import br.unesp.projeto.service.ArmazemServiceImpl;
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
public class ArmazemResource {
    
    @Autowired
    private ArmazemServiceImpl armazemService;
    
    @GetMapping("/")
    public List<Armazem> getAllArmazem() {

        return armazemService.findAll();
    }
    
    
    @GetMapping("/{idArmazem}")
    public Armazem getArmazemByCpf(@PathVariable(value = "idArmazem") String idArmazem) {
        Armazem armazem = armazemService.find(idArmazem);

        return armazem;
    }
    
    @DeleteMapping("/{idArmazem}")
    public boolean delete(@PathVariable(value = "idArmazem") String idArmazem) {
        boolean delete = false;
        Armazem armazemDelete = armazemService.find(idArmazem);

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
    public boolean updateArmazem(@PathVariable(value = "idArmazem") String idArmazem,
            @RequestBody Armazem armazem) {
        boolean update = false;
        
        Armazem armazemUpdate = armazemService.find(idArmazem);        
        Armazem newArmazem = armazemService.find(idArmazem);  
        // Campos que estão sendo atualizados
        armazemUpdate.setIdArmazem(newArmazem.getIdArmazem());

        Armazem armazemUpdated = armazemService.update(armazemUpdate);
        if (armazemUpdated != null){
            update = true;
        }

        return update;
    }
    
    
}
