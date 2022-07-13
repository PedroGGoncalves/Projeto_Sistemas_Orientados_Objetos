/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;

import br.unesp.projeto.model.Armazem;
import br.unesp.projeto.dao.ArmazemDAO;
import br.unesp.projeto.dao.DaoFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArmazemServiceImpl implements ArmazemService {

     private ArmazemDAO dao = DaoFactory.getArmazemDAO();

    
    
    @Override
    public boolean save(Armazem entity) {
        boolean b = false;

        if (dao != null) {
            System.out.println("NOT NULL");
            dao.save(entity);
            b = true;
        }

        return b;
    }
    
    
    
    @Override
    public Armazem findById(Long id) {
        Armazem entity = null;

        if (dao != null) {
            entity = dao.findById(id);
        }

        return entity;
    }
 
    
    @Override
    public List<Armazem> findAll() {
        List<Armazem> lista = null;

        if (dao != null) {
            lista = new ArrayList<>();
            lista = dao.findAll();
        }
        Collections.sort(lista,Collections.reverseOrder());
        return lista;
    }

     
}
