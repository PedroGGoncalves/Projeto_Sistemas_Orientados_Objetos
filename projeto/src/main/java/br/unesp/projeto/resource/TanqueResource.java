package br.unesp.projeto.resource;

import br.unesp.projeto.model.Tanque;
import br.unesp.projeto.service.TanqueServiceImpl;
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
    private TanqueServiceImpl tanqueService;
    
    @GetMapping("/")
    public List<Tanque> getAllTanque() {

        return tanqueService.findAll();
    }
    
    
    @GetMapping("/{idTanque}")
    public Tanque getTanqueByCpf(@PathVariable(value = "idTanque") String idTanque) {
        Tanque tanque = tanqueService.find(idTanque);

        return tanque;
    }
    
    @DeleteMapping("/{idTanque}")
    public boolean delete(@PathVariable(value = "idTanque") String idTanque) {
        boolean delete = false;
        Tanque tanqueDelete = tanqueService.find(idTanque);

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
    public boolean updateTanque(@PathVariable(value = "idTanque") String idTanque,
            @RequestBody Tanque tanque) {
        boolean update = false;
        
        Tanque tanqueUpdate = tanqueService.find(idTanque);        
        Tanque newTanque = tanqueService.find(idTanque);  
        // Campos que estão sendo atualizados
        tanqueUpdate.setIdTanque(newTanque.getIdTanque());

        Tanque tanqueUpdated = tanqueService.update(tanqueUpdate);
        if (tanqueUpdated != null){
            update = true;
        }

        return update;
    }
    
    
}