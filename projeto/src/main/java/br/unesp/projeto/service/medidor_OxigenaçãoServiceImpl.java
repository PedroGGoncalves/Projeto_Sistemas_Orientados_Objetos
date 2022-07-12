/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;

import br.unesp.projeto.model.Medidor_oxigenacao;
import br.unesp.projeto.service.medidor_OxigenaçãoService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class medidor_OxigenaçãoServiceImpl {

    @Autowired
    private medidor_OxigenaçãoService repository;

    public medidor_OxigenaçãoServiceImpl() {
        
    }

    public Medidor_oxigenacao save(Medidor_oxigenacao entity) {
        Medidor_oxigenacao persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    public Medidor_oxigenacao findByCpf(String cpf) {
        Medidor_oxigenacao insertedEntity = null;

        if (repository != null) {
            insertedEntity = repository.findByCpf(cpf);
        }

        return insertedEntity;
    }

    public void delete(Medidor_oxigenacao entity) {

        if (repository != null) {
            repository.delete(entity);
        }
    }

    public Medidor_oxigenacao update(Medidor_oxigenacao entity) {

        Medidor_oxigenacao persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

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
