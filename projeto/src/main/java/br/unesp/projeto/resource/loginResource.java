/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.resource;

import br.unesp.projeto.model.Login;
import br.unesp.projeto.service.loginServiceImpl;
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
public class loginResource {
    
    @Autowired
    private loginServiceImpl loginService;
    
    @GetMapping("/")
    public List<Login> getAlllogin() {

        return loginService.findAll();
    }
    
    
    @GetMapping("/{idLogin}")
    public Login getloginByCpf(@PathVariable(value = "idLogin") String idLogin) {
        Login login = loginService.find(idLogin);

        return login;
    }
    
    @DeleteMapping("/{idLogin}")
    public boolean delete(@PathVariable(value = "idLogin") String idLogin) {
        boolean delete = false;
        Login loginDelete = loginService.find(idLogin);

        if (loginDelete != null){
         loginService.delete(loginDelete);
         delete = true;
        }        

        return delete;
    }
    
    
    @PostMapping("/")
    public boolean savelogin(@RequestBody Login login) {
        boolean insert = false;

        Login loginInsert = loginService.save(login);
        if (loginInsert != null){
            insert = true;
        }

        return insert;
    }
    
    
    @PutMapping("/{idLogin}")
    public boolean updatelogin(@PathVariable(value = "idLogin") String idLogin,
            @RequestBody Login login) {
        boolean update = false;
        
        Login loginUpdate = loginService.find(idLogin);        
        Login newlogin = loginService.find(idLogin);  
        // Campos que estão sendo atualizados
        loginUpdate.setIdLogin(newlogin.getIdLogin());

        Login loginUpdated = loginService.update(loginUpdate);
        if (loginUpdated != null){
            update = true;
        }

        return update;
    }
    
    
}