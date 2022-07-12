/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service_r;

import br.unesp.projeto.model.Medidor_ph;
import br.unesp.projeto.repository.medidor_pHDAO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class medidor_pHServiceImpl {

    @Autowired
    private medidor_pHDAO repository;

    public medidor_pHServiceImpl() {
        
    }

    public Medidor_ph save(Medidor_ph entity) {
        Medidor_ph persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    public Medidor_ph findByCpf(String cpf) {
        Medidor_ph insertedEntity = null;

        if (repository != null) {
            insertedEntity = repository.findByCpf(cpf);
        }

        return insertedEntity;
    }

    public void delete(Medidor_ph entity) {

        if (repository != null) {
            repository.delete(entity);
        }
    }

    public Medidor_ph update(Medidor_ph entity) {

        Medidor_ph persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    public List<Medidor_ph> findAll() {
        List<Medidor_ph> list = null;
       
        if (repository != null) {
            list = new ArrayList<>();
            list = repository.findAll();
            Collections.sort(list,Collections.reverseOrder());
        }
        
        return list;
    }

}
