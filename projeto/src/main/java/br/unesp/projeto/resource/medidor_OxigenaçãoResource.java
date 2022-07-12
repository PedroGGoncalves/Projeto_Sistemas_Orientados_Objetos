package br.unesp.projeto.resource;

import br.unesp.projeto.model.Medidor_oxigenacao;
import br.unesp.projeto.service.medidor_OxigenaçãoServiceImpl;
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
public class medidor_OxigenaçãoResource {
    
    @Autowired
    private medidor_OxigenaçãoServiceImpl medidor_oxigenacaoService;
    
    @GetMapping("/")
    public List<Medidor_oxigenacao> getAllMedidor_Oxigenação() {

        return medidor_oxigenacaoService.findAll();
    }
    
    
    @GetMapping("/{oxigenacao}")
    public Medidor_oxigenacao getMedidor_OxigenaçãoByCpf(@PathVariable(value = "oxigenacao") String oxigenacao) {
        Medidor_oxigenacao medidor_oxigenacao = medidor_oxigenacaoService.find(oxigenacao);

        return medidor_oxigenacao;
    }
    
    @DeleteMapping("/{oxigenacao}")
    public boolean delete(@PathVariable(value = "oxigenacao") String oxigenacao) {
        boolean delete = false;
       Medidor_oxigenacao medidor_oxigenacaoDelete = medidor_oxigenacaoService.find(oxigenacao);

        if (medidor_oxigenacaoDelete != null){
         medidor_oxigenacaoService.delete(medidor_oxigenacaoDelete);
         delete = true;
        }        

        return delete;
    }
    
    
    @PostMapping("/")
    public boolean saveMedidor_Oxigenação(@RequestBody Medidor_oxigenacao medidor_oxigenacao) {
        boolean insert = false;

       Medidor_oxigenacao medidor_oxigenacaoInsert = medidor_oxigenacaoService.save(medidor_oxigenacao);
        if (medidor_oxigenacaoInsert != null){
            insert = true;
        }

        return insert;
    }
    
    
    @PutMapping("/{oxigenacao}")
    public boolean updateMedidor_Oxigenação(@PathVariable(value = "oxigenacao") String oxigenacao,
            @RequestBody Medidor_oxigenacao medidor_oxigenacao) {
        boolean update = false;
        
       Medidor_oxigenacao medidor_oxigenacaoUpdate = medidor_oxigenacaoService.find(oxigenacao);        
        Medidor_oxigenacao newMedidor_Oxigenação = medidor_oxigenacaoService.find(oxigenacao);  
        // Campos que estão sendo atualizados
        medidor_oxigenacaoUpdate.setOxigenacao(newMedidor_Oxigenação.getOxigenacao());

        Medidor_oxigenacao medidor_oxigenacaoUpdated = medidor_oxigenacaoService.update(medidor_oxigenacaoUpdate);
        if (medidor_oxigenacaoUpdated != null){
            update = true;
        }

        return update;
    }
    
    
}