package br.unesp.projeto.resource;

import br.unesp.projeto.model.Medidor_salinidade;
import br.unesp.projeto.service.medidor_SalinidadeService;
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
@RequestMapping("/medidor_salinidade")
@Slf4j
public class Medidor_SalinidadeResource {
    
    private medidor_SalinidadeService medidor_salinidadeService;
    
    @GetMapping("/")
    public List<Medidor_salinidade> getAllMedidor_salinidade() {

        return medidor_salinidadeService.findAll();
    }
    
    
    @GetMapping("/{idMedidor_Salinidade}")
    public Medidor_salinidade getMedidor_salinidadeByCpf(@PathVariable(value = "idMedidor_Salinidade") long idMedidor_Salinidade) {
        Medidor_salinidade medidor_salinidade = medidor_salinidadeService.findById(idMedidor_Salinidade);

        return medidor_salinidade;
    }
    
    @DeleteMapping("/{idMedidor_Salinidade}")
    public boolean delete(@PathVariable(value = "idMedidor_Salinidade") long idMedidor_Salinidade) {
        boolean delete = false;
        Medidor_salinidade medidor_salinidadeDelete = medidor_salinidadeService.findById(idMedidor_Salinidade);

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
    public boolean updateMedidor_salinidade(@PathVariable(value = "idMedidor_Salinidade") long idMedidor_Salinidade,
            @RequestBody Medidor_salinidade medidor_salinidade) {
        boolean update = false;
        
        Medidor_salinidade medidor_salinidadeUpdate = medidor_salinidadeService.findById(idMedidor_Salinidade);        
        Medidor_salinidade newMedidor_salinidade = medidor_salinidadeService.findById(idMedidor_Salinidade);  
        // Campos que estão sendo atualizados
        medidor_salinidadeUpdate.setSalinidade(newMedidor_salinidade.getSalinidade());

        Medidor_salinidade medidor_salinidadeUpdated = medidor_salinidadeService.update(medidor_salinidadeUpdate);
        if (medidor_salinidadeUpdated != null){
            update = true;
        }

        return update;
    }
    
    
}
