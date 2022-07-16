/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;

import br.unesp.projeto.model.Medidor_oxigenacao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import br.unesp.projeto.repository.Medidor_OxigenaçãoRepository;


public class Medidor_OxigenaçãoServiceImpl implements Medidor_OxigenaçãoService{

    
    private Medidor_OxigenaçãoRepository repository;


    @Override
    public Medidor_oxigenacao save(Medidor_oxigenacao entity) {
        Medidor_oxigenacao persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    @Override
    public Medidor_oxigenacao findById(long Id) {
        Medidor_oxigenacao insertedEntity = null;

        if (repository != null) {
            insertedEntity = repository.findById(Id);
        }

        return insertedEntity;
    }

    @Override
    public void delete(Medidor_oxigenacao entity) {

        if (repository != null) {
            repository.delete(entity);
        }
    }

    @Override
    public Medidor_oxigenacao update(Medidor_oxigenacao entity) {

        Medidor_oxigenacao persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    @Override
    public List<Medidor_oxigenacao> findAll() {
        List<Medidor_oxigenacao> list = null;
       
        if (repository != null) {
            list = new ArrayList<>();
            list = repository.findAll();
            Collections.sort(list,Collections.reverseOrder());
        }
        
        return list;
    }

}
