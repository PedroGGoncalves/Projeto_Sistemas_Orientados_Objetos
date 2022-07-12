package br.unesp.projeto.resource;

import br.unesp.projeto.model.Termostato;
import br.unesp.projeto.service_r.TermostatoServiceImpl;
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
    
    
    @GetMapping("/{cpf}")
    public Termostato getTermostatoByCpf(@PathVariable(value = "cpf") String cpf) {
        Termostato termostato = termostatoService.findByCpf(cpf);

        return termostato;
    }
    
    @DeleteMapping("/{cpf}")
    public boolean delete(@PathVariable(value = "cpf") String cpf) {
        boolean delete = false;
        Termostato termostatoDelete = termostatoService.findByCpf(cpf);

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
    
    
    @PutMapping("/{cpf}")
    public boolean updateTermostato(@PathVariable(value = "cpf") String cpf,
            @RequestBody Termostato termostato) {
        boolean update = false;
        
        Termostato termostatoUpdate = termostatoService.findByCpf(cpf);        
        Termostato newTermostato = termostatoService.findByCpf(cpf);  
        // Campos que estão sendo atualizados
        termostatoUpdate.settemperatura(newTermostato.gettemperatura());

        Termostato termostatoUpdated = termostatoService.update(termostatoUpdate);
        if (termostatoUpdated != null){
            update = true;
        }

        return update;
    }
    
    
}