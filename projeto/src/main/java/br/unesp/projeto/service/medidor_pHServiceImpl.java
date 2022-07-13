/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;

import br.unesp.projeto.model.Medidor_ph;
import br.unesp.projeto.dao.medidor_PhDAO;
import br.unesp.projeto.dao.DaoFactory;

import java.util.ArrayList;
import java.util.List;


public class medidor_pHServiceImpl implements medidor_pHService {

     private medidor_PhDAO dao = DaoFactory.getmedidor_pHDAO();

    
    
    @Override
    public boolean save(Medidor_ph entity) {
        boolean b = false;

        if (dao != null) {
            System.out.println("NOT NULL");
            dao.save(entity);
            b = true;
        }

        return b;
    }
    
    
    
    @Override
    public Medidor_ph findById(Long id) {
        Medidor_ph entity = null;

        if (dao != null) {
            entity = dao.findById(id);
        }

        return entity;
    }
 
    
    @Override
    public List<Medidor_ph> findAll() {
        List<Medidor_ph> lista = null;

        if (dao != null) {
            lista = new ArrayList<>();
            lista = dao.findAll();
        }

        return lista;
    }

     
}
