/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;

import br.unesp.projeto.model.Termostato;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import br.unesp.projeto.repository.TermostatoRepository;

@Component
public class TermostatoService {

    @Autowired
    private TermostatoRepository repository;

    public TermostatoService() {
        
    }

    public Termostato save(Termostato entity) {
        Termostato persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    public Termostato findById(long Id) {
        Termostato insertedEntity = null;

        if (repository != null) {
            insertedEntity = repository.findById(Id);
        }

        return insertedEntity;
    }

    public void delete(Termostato entity) {

        if (repository != null) {
            repository.delete(entity);
        }
    }

    public Termostato update(Termostato entity) {

        Termostato persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    public List<Termostato> findAll() {
        List<Termostato> list = null;
       
        if (repository != null) {
            list = new ArrayList<>();
            list = repository.findAll();
            Collections.sort(list,Collections.reverseOrder());
        }
        
        return list;
    }

}
