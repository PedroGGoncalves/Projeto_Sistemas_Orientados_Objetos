/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;

import br.unesp.projeto.model.Medidor_oxigenacao;
import br.unesp.projeto.dao.medidor_OxigenaçãoDAO;
import br.unesp.projeto.dao.DaoFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class medidor_OxigenaçãoServiceImpl implements medidor_OxigenaçãoService {

     private medidor_OxigenaçãoDAO dao = DaoFactory.getmedidor_OxigenaçãoDAO();

    
    
    @Override
    public boolean save(Medidor_oxigenacao entity) {
        boolean b = false;

        if (dao != null) {
            System.out.println("NOT NULL");
            dao.save(entity);
            b = true;
        }

        return b;
    }
    
    
    
    @Override
    public Medidor_oxigenacao findById(Long id) {
        Medidor_oxigenacao entity = null;

        if (dao != null) {
            entity = dao.findById(id);
        }

        return entity;
    }
 
    
    @Override
    public List<Medidor_oxigenacao> findAll() {
        List<Medidor_oxigenacao> lista = null;

        if (dao != null) {
            lista = new ArrayList<>();
            lista = dao.findAll();
        }
        Collections.sort(lista,Collections.reverseOrder());
        return lista;
    }

     
}