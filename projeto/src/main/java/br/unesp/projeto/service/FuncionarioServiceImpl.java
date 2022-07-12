/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service_r;

import br.unesp.projeto.model.Funcionario;
import br.unesp.projeto.service_r.FuncionarioService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class FuncionarioServiceImpl {

    @Autowired
    private FuncionarioService repository;

    public FuncionarioServiceImpl() {
        
    }

    public Funcionario save(Funcionario entity) {
        Funcionario persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    public Funcionario findByCpf(String cpf) {
        Funcionario insertedEntity = null;

        if (repository != null) {
            insertedEntity = repository.findByCpf(cpf);
        }

        return insertedEntity;
    }

    public void delete(Funcionario entity) {

        if (repository != null) {
            repository.delete(entity);
        }
    }

    public Funcionario update(Funcionario entity) {

        Funcionario persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    public List<Funcionario> findAll() {
        List<Funcionario> list = null;
       
        if (repository != null) {
            list = new ArrayList<>();
            list = repository.findAll();
            Collections.sort(list,Collections.reverseOrder());
        }
        
        return list;
    }

}
  
  
