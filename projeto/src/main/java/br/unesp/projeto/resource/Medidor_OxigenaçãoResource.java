package br.unesp.projeto.resource;

import br.unesp.projeto.model.Medidor_oxigenacao;
import br.unesp.projeto.service.Medidor_OxigenaçãoService;
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
public class Medidor_OxigenaçãoResource {
    
    @Autowired
    private Medidor_OxigenaçãoService medidor_oxigenacaoService;
    
    @GetMapping("/")
    public List<Medidor_oxigenacao> getAllMedidor_Oxigenação() {

        return medidor_oxigenacaoService.findAll();
    }
    
    
    @GetMapping("/{idMedidor_Oxigenacao}")
    public Medidor_oxigenacao getMedidor_OxigenaçãoByCpf(@PathVariable(value = "oxigenacao") long idMedidor_Oxigenacao) {
        Medidor_oxigenacao medidor_oxigenacao = medidor_oxigenacaoService.findById(idMedidor_Oxigenacao);

        return medidor_oxigenacao;
    }
    
    @DeleteMapping("/{idMedidor_Oxigenacao}")
    public boolean delete(@PathVariable(value = "oxigenacao") long idMedidor_Oxigenacao) {
        boolean delete = false;
       Medidor_oxigenacao medidor_oxigenacaoDelete = medidor_oxigenacaoService.findById(idMedidor_Oxigenacao);

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
    
    
    @PutMapping("/{idMedidor_Oxigenacao}")
    public boolean updateMedidor_Oxigenação(@PathVariable(value = "idMedidor_Oxigenacao") long idMedidor_Oxigenacao,
            @RequestBody Medidor_oxigenacao medidor_oxigenacao) {
        boolean update = false;
        
       Medidor_oxigenacao medidor_oxigenacaoUpdate = medidor_oxigenacaoService.findById(idMedidor_Oxigenacao);        
        Medidor_oxigenacao newMedidor_Oxigenação = medidor_oxigenacaoService.findById(idMedidor_Oxigenacao);  
        // Campos que estão sendo atualizados
        medidor_oxigenacaoUpdate.setOxigenacao(newMedidor_Oxigenação.getOxigenacao());

        Medidor_oxigenacao medidor_oxigenacaoUpdated = medidor_oxigenacaoService.update(medidor_oxigenacaoUpdate);
        if (medidor_oxigenacaoUpdated != null){
            update = true;
        }

        return update;
    }
    
    
}
