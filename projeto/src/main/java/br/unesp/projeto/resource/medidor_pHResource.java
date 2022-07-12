package br.unesp.projeto.resource;

import br.unesp.projeto.model.Medidor_ph;
import br.unesp.projeto.service_r.medidor_pHServiceImpl;
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
public class medidor_pHResource {
    
    @Autowired
    private medidor_pHServiceImpl medidor_phService;
    
    @GetMapping("/")
    public List<Medidor_ph> getAllmedidor_pH() {

        return medidor_phService.findAll();
    }
    
    
    @GetMapping("/{cpf}")
    public Medidor_ph getmedidor_pHByCpf(@PathVariable(value = "cpf") String cpf) {
        Medidor_ph medidor_ph = medidor_phService.findByCpf(cpf);

        return medidor_ph;
    }
    
    @DeleteMapping("/{cpf}")
    public boolean delete(@PathVariable(value = "cpf") String cpf) {
        boolean delete = false;
        Medidor_ph medidor_phDelete = medidor_phService.findByCpf(cpf);

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
    
    
    @PutMapping("/{cpf}")
    public boolean updatemedidor_pH(@PathVariable(value = "cpf") String cpf,
            @RequestBody Medidor_ph medidor_ph) {
        boolean update = false;
        
        Medidor_ph medidor_phUpdate = medidor_phService.findByCpf(cpf);        
        Medidor_ph newmedidor_pH = medidor_phService.findByCpf(cpf);  
        // Campos que estão sendo atualizados
        medidor_phUpdate.setph(newmedidor_pH.getph());

        Medidor_ph medidor_phUpdated = medidor_phService.update(medidor_phUpdate);
        if (medidor_phUpdated != null){
            update = true;
        }

        return update;
    }
    
    
}
