/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.resource;

import br.unesp.projeto.model.Aquario;
import br.unesp.projeto.service.AquarioServiceImpl;
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
public class AquarioResource {
    
    @Autowired
    private AquarioServiceImpl aquarioService;
    
    @GetMapping("/")
    public List<Aquario> getAllAquario() {

        return aquarioService.findAll();
    }
    
    
    @GetMapping("/{cpf}")
    public Aquario getAquarioByCpf(@PathVariable(value = "cpf") String cpf) {
        Aquario aquario = aquarioService.findByCpf(cpf);

        return aquario;
    }
    
    @DeleteMapping("/{cpf}")
    public boolean delete(@PathVariable(value = "cpf") String cpf) {
        boolean delete = false;
        Aquario aquarioDelete = aquarioService.findByCpf(cpf);

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
    
    
    @PutMapping("/{cpf}")
    public boolean updateAquario(@PathVariable(value = "cpf") String cpf,
            @RequestBody Aquario aquario) {
        boolean update = false;
        
        Aquario aquarioUpdate = aquarioService.findByCpf(cpf);        
        Aquario newAquario = aquarioService.findByCpf(cpf);  
        // Campos que estão sendo atualizados
        aquarioUpdate.setNome(newAquario.getNome());

        Aquario aquarioUpdated = aquarioService.update(aquarioUpdate);
        if (aquarioUpdated != null){
            update = true;
        }

        return update;
    }
    
    
}
