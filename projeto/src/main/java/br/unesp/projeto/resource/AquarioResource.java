/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.resource;

import br.unesp.projeto.model.Aquario;
import br.unesp.projeto.service.AquarioService;
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
@RequestMapping("/aquario")
@Slf4j
public class AquarioResource {
    

    private AquarioService aquarioService;
    
    @GetMapping("/")
    public List<Aquario> getAllAquario() {

        return aquarioService.findAll();
    }
    
    
    @GetMapping("/{IdAquario}")
    public Aquario getAquarioByCpf(@PathVariable(value = "IdAquario") long IdAquario) {
        Aquario aquario = aquarioService.findById(IdAquario);

        return aquario;
    }
    
    @DeleteMapping("/{IdAquario}")
    public boolean delete(@PathVariable(value = "IdAquario")long IdAquario) {
        boolean delete = false;
        Aquario aquarioDelete = aquarioService.findById(IdAquario);

        if (aquarioDelete != null){
         aquarioService.delete(aquarioDelete);
         delete = true;
        }        

        return delete;
    }
    
    
    @PostMapping("/")
    public boolean saveAquario(@RequestBody Aquario aquario) {
        boolean insert = false;

        Aquario aquarioInsert = aquarioService.save(aquario);
        if (aquarioInsert != null){
            insert = true;
        }

        return insert;
    }
    
    
    @PutMapping("/{IdAquario}")
    public boolean updateAquario(@PathVariable(value = "IdAquario") long IdAquario,
            @RequestBody Aquario aquario) {
        boolean update = false;
        
        Aquario aquarioUpdate = aquarioService.findById(IdAquario);        
        Aquario newAquario = aquarioService.findById(IdAquario);  
        // Campos que estão sendo atualizados
        aquarioUpdate.setNome(newAquario.getNome());

        Aquario aquarioUpdated = aquarioService.update(aquarioUpdate);
        if (aquarioUpdated != null){
            update = true;
        }

        return update;
    }
    
    
}
