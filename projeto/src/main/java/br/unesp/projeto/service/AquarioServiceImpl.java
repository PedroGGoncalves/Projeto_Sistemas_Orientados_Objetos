/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service_r;

import br.unesp.projeto.model.Aquario;
import br.unesp.projeto.service_r.AquarioService;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class AquarioServiceImpl {

    @Autowired
    private AquarioService repository;

    public AquarioServiceImpl() {
        
    }

    public Aquario save(Aquario entity) {
        Aquario persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    public Aquario findByCpf(String cpf) {
        Aquario insertedEntity = null;

        if (repository != null) {
            insertedEntity = repository.findByCpf(cpf);
        }

        return insertedEntity;
    }

    public void delete(Aquario entity) {

        if (repository != null) {
            repository.delete(entity);
        }
    }

    public Aquario update(Aquario entity) {

        Aquario persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    public List<Aquario> findAll() {
        List<Aquario> list = null;
       
        if (repository != null) {
            list = new ArrayList<>();
            list = repository.findAll();
            Collections.sort(list,Collections.reverseOrder());
        }
        
        return list;
    }

}