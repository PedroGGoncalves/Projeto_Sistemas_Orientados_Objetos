package br.unesp.projeto.resource;

import br.unesp.projeto.model.Tanque;
import br.unesp.projeto.service.TanqueService;
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
public class TanqueResource {
    
    @Autowired
    private TanqueService tanqueService;
    
    @GetMapping("/")
    public List<Tanque> getAllTanque() {

        return tanqueService.findAll();
    }
    
    
    @GetMapping("/{idTanque}")
    public Tanque getTanqueById(@PathVariable(value = "idTanque") long idTanque) {
        Tanque tanque = tanqueService.findById(idTanque);

        return tanque;
    }
    
    @DeleteMapping("/{idTanque}")
    public boolean delete(@PathVariable(value = "idTanque") long idTanque) {
        boolean delete = false;
        Tanque tanqueDelete = tanqueService.findById(idTanque);

        if (tanqueDelete != null){
         tanqueService.delete(tanqueDelete);
         delete = true;
        }        

        return delete;
    }
    
    
    @PostMapping("/")
    public boolean saveTanque(@RequestBody Tanque tanque) {
        boolean insert = false;

        Tanque tanqueInsert = tanqueService.save(tanque);
        if (tanqueInsert != null){
            insert = true;
        }

        return insert;
    }
    
    
    @PutMapping("/{idTanque}")
    public boolean updateTanque(@PathVariable(value = "idTanque") long idTanque,
            @RequestBody Tanque tanque) {
        boolean update = false;
        
        Tanque tanqueUpdate = tanqueService.findById(idTanque);        
        Tanque newTanque = tanqueService.findById(idTanque);  
        // Campos que estão sendo atualizados
        tanqueUpdate.setIdTanque(newTanque.getIdTanque());

        Tanque tanqueUpdated = tanqueService.update(tanqueUpdate);
        if (tanqueUpdated != null){
            update = true;
        }

        return update;
    }
    
    
}
