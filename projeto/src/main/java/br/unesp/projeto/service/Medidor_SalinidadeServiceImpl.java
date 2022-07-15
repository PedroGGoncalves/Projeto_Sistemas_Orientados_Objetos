/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;

import br.unesp.projeto.model.Medidor_salinidade;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import br.unesp.projeto.repository.Medidor_SalinidadeRepository;

@Component
public class Medidor_SalinidadeServiceImpl {

    @Autowired
    private Medidor_SalinidadeRepository repository;

    public Medidor_SalinidadeServiceImpl() {
        
    }

    public Medidor_salinidade save(Medidor_salinidade entity) {
        Medidor_salinidade persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    public Medidor_salinidade findById(long Id) {
        Medidor_salinidade insertedEntity = null;

        if (repository != null) {
            insertedEntity = repository.findById(Id);
        }

        return insertedEntity;
    }

    public void delete(Medidor_salinidade entity) {

        if (repository != null) {
            repository.delete(entity);
        }
    }

    public Medidor_salinidade update(Medidor_salinidade entity) {

        Medidor_salinidade persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    public List<Medidor_salinidade> findAll() {
        List<Medidor_salinidade> list = null;
       
        if (repository != null) {
            list = new ArrayList<>();
            list = repository.findAll();
            Collections.sort(list,Collections.reverseOrder());
        }
        
        return list;
    }

}
