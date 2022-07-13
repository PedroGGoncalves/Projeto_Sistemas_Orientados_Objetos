package br.unesp.projeto.resource;

import br.unesp.projeto.model.Termostato;
import br.unesp.projeto.service.TermostatoServiceImpl;
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
public class TermostatoResource {
    
    @Autowired
    private TermostatoServiceImpl termostatoService;
    
    @GetMapping("/")
    public List<Termostato> getAllTermostato() {

        return termostatoService.findAll();
    }
    
    
    @GetMapping("/{temperatura}")
    public Termostato getTermostatoByCpf(@PathVariable(value = "temperatura") Long temperatura) {
        Termostato termostato = termostatoService.find(temperatura);

        return termostato;
    }
    
    @DeleteMapping("/{temperatura}")
    public boolean delete(@PathVariable(value = "temperatura") Long temperatura) {
        boolean delete = false;
        Termostato termostatoDelete = termostatoService.find(temperatura);

        if (termostatoDelete != null){
         termostatoService.delete(termostatoDelete);
         delete = true;
        }        

        return delete;
    }
    
    
    @PostMapping("/")
    public boolean saveTermostato(@RequestBody Termostato termostato) {
        boolean insert = false;

        Termostato termostatoInsert = termostatoService.save(termostato);
        if (termostatoInsert != null){
            insert = true;
        }

        return insert;
    }
    
    
    @PutMapping("/{temperatura}")
    public boolean updateTermostato(@PathVariable(value = "temperatura") Long temperatura,
            @RequestBody Termostato termostato) {
        boolean update = false;
        
        Termostato termostatoUpdate = termostatoService.find(temperatura);        
        Termostato newTermostato = termostatoService.find(temperatura);  
        // Campos que estão sendo atualizados
        termostatoUpdate.setTemperatura(newTermostato.getTemperatura());

        Termostato termostatoUpdated = termostatoService.update(termostatoUpdate);
        if (termostatoUpdated != null){
            update = true;
        }

        return update;
    }
    
    
}