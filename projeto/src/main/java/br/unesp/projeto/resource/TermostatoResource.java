package br.unesp.projeto.resource;

import br.unesp.projeto.model.Termostato;
import br.unesp.projeto.service.TermostatoService;
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
@RequestMapping("/termostato")
@Slf4j
public class TermostatoResource {
    
    @Autowired
    private TermostatoService termostatoService;
    
    @GetMapping("/")
    public List<Termostato> getAllTermostato() {

        return termostatoService.findAll();
    }
    
    
    @GetMapping("/{idTermostato}")
    public Termostato getTermostatoById(@PathVariable(value = "idTermostato") long idTermostato) {
        Termostato termostato = termostatoService.findById(idTermostato);

        return termostato;
    }
    
    @DeleteMapping("/{idTermostato}")
    public boolean delete(@PathVariable(value = "idTermostato")  long idTermostato) {
        boolean delete = false;
        Termostato termostatoDelete = termostatoService.findById(idTermostato);

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
    
    
    @PutMapping("/{idTermostato}")
    public boolean updateTermostato(@PathVariable(value = "idTermostato") long idTermostato,
            @RequestBody Termostato termostato) {
        boolean update = false;
        
        Termostato termostatoUpdate = termostatoService.findById(idTermostato);        
        Termostato newTermostato = termostatoService.findById(idTermostato);  
        // Campos que estão sendo atualizados
        termostatoUpdate.setTemperatura(newTermostato.getTemperatura());

        Termostato termostatoUpdated = termostatoService.update(termostatoUpdate);
        if (termostatoUpdated != null){
            update = true;
        }

        return update;
    }
    
    
}
