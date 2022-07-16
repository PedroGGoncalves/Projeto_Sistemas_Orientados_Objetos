package br.unesp.projeto.resource;

import br.unesp.projeto.model.Medidor_ph;
import br.unesp.projeto.service.Medidor_pHService;
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
@CrossOrigin(origins="http://localhost:8080")
@RequestMapping("/medidor_ph")
@Slf4j
public class Medidor_pHResource {
    

    private Medidor_pHService medidor_phService;
    
    @GetMapping("/")
    public List<Medidor_ph> getAllmedidor_pH() {

        return medidor_phService.findAll();
    }
    
    
    @GetMapping("/{ph}")
    public Medidor_ph getmedidor_pHByCpf(@PathVariable(value = "idMedidor_ph") long idMedidor_ph) {
        Medidor_ph medidor_ph = medidor_phService.findById(idMedidor_ph);

        return medidor_ph;
    }
    
    @DeleteMapping("/{ph}")
    public boolean delete(@PathVariable(value = "idMedidor_ph") long idMedidor_ph) {
        boolean delete = false;
        Medidor_ph medidor_phDelete = medidor_phService.findById(idMedidor_ph);

        if (medidor_phDelete != null){
         medidor_phService.delete(medidor_phDelete);
         delete = true;
        }        

        return delete;
    }
    
    
    @PostMapping("/")
    public boolean savemedidor_pH(@RequestBody Medidor_ph medidor_ph) {
        boolean insert = false;

        Medidor_ph medidor_phInsert = medidor_phService.save(medidor_ph);
        if (medidor_phInsert != null){
            insert = true;
        }

        return insert;
    }
    
    
    @PutMapping("/{ph}")
    public boolean updatemedidor_pH(@PathVariable(value = "ph") long idMedidor_ph,
            @RequestBody Medidor_ph medidor_ph) {
        boolean update = false;
        
        Medidor_ph medidor_phUpdate = medidor_phService.findById(idMedidor_ph);        
        Medidor_ph newmedidor_pH = medidor_phService.findById(idMedidor_ph);  
        // Campos que estão sendo atualizados
        medidor_phUpdate.setPh(newmedidor_pH.getPh());

        Medidor_ph medidor_phUpdated = medidor_phService.update(medidor_phUpdate);
        if (medidor_phUpdated != null){
            update = true;
        }

        return update;
    }
    
    
}
