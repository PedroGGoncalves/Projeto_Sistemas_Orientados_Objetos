package br.unesp.projeto.resource;

import br.unesp.projeto.model.Medidor_salinidade;
import br.unesp.projeto.service.medidor_SalinidadeServiceImpl;
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
public class medidor_SalinidadeResource {
    
    @Autowired
    private medidor_SalinidadeServiceImpl medidor_salinidadeService;
    
    @GetMapping("/")
    public List<Medidor_salinidade> getAllMedidor_salinidade() {

        return medidor_salinidadeService.findAll();
    }
    
    
    @GetMapping("/{salinidade}")
    public Medidor_salinidade getMedidor_salinidadeByCpf(@PathVariable(value = "salinidade") Long salinidade) {
        Medidor_salinidade medidor_salinidade = medidor_salinidadeService.find(salinidade);

        return medidor_salinidade;
    }
    
    @DeleteMapping("/{salinidade}")
    public boolean delete(@PathVariable(value = "salinidade") Long salinidade) {
        boolean delete = false;
        Medidor_salinidade medidor_salinidadeDelete = medidor_salinidadeService.find(salinidade);

        if (medidor_salinidadeDelete != null){
         medidor_salinidadeService.delete(medidor_salinidadeDelete);
         delete = true;
        }        

        return delete;
    }
    
    
    @PostMapping("/")
    public boolean saveMedidor_salinidade(@RequestBody Medidor_salinidade medidor_salinidade) {
        boolean insert = false;

        Medidor_salinidade medidor_salinidadeInsert = medidor_salinidadeService.save(medidor_salinidade);
        if (medidor_salinidadeInsert != null){
            insert = true;
        }

        return insert;
    }
    
    
    @PutMapping("/{salinidade}")
    public boolean updateMedidor_salinidade(@PathVariable(value = "salinidade") Long salinidade,
            @RequestBody Medidor_salinidade medidor_salinidade) {
        boolean update = false;
        
        Medidor_salinidade medidor_salinidadeUpdate = medidor_salinidadeService.find(salinidade);        
        Medidor_salinidade newMedidor_salinidade = medidor_salinidadeService.find(salinidade);  
        // Campos que estão sendo atualizados
        medidor_salinidadeUpdate.setSalinidade(newMedidor_salinidade.getSalinidade());

        Medidor_salinidade medidor_salinidadeUpdated = medidor_salinidadeService.update(medidor_salinidadeUpdate);
        if (medidor_salinidadeUpdated != null){
            update = true;
        }

        return update;
    }
    
    
}