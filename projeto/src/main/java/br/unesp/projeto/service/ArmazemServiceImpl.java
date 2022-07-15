/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;

import br.unesp.projeto.model.Armazem;
import br.unesp.projeto.repository.ArmazemRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class ArmazemServiceImpl {

    @Autowired
    private ArmazemRepository repository;

    public ArmazemServiceImpl() {
        
    }

    public Armazem save(Armazem entity) {
        Armazem persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    public Armazem findById(long Id) {
        Armazem insertedEntity = null;

        if (repository != null) {
            insertedEntity = repository.findById(Id);
        }

        return insertedEntity;
    }

    public void delete(Armazem entity) {

        if (repository != null) {
            repository.delete(entity);
        }
    }

    public Armazem update(Armazem entity) {

        Armazem persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    public List<Armazem> findAll() {
        List<Armazem> list = null;
       
        if (repository != null) {
            list = new ArrayList<>();
            list = repository.findAll();
            Collections.sort(list,Collections.reverseOrder());
        }
        
        return list;
    }

}
