/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;

import br.unesp.projeto.model.Login;
import br.unesp.projeto.repository.LoginDAO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class loginServiceImpl {

    @Autowired
    private LoginDAO repository;

    public loginServiceImpl() {
        
    }

    public Login save(Login entity) {
        Login persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    public Login find(Long Id) {
        Login insertedEntity = null;

        if (repository != null) {
            insertedEntity = repository.find(Id);
        }

        return insertedEntity;
    }

    public void delete(Login entity) {

        if (repository != null) {
            repository.delete(entity);
        }
    }

    public Login update(Login entity) {

        Login persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }
    public List<Login> findAll() {
        List<Login> list = null;
       
        if (repository != null) {
            list = new ArrayList<>();
            list = repository.findAll();
            Collections.sort(list,Collections.reverseOrder());
        }
        
        return list;
    }

}