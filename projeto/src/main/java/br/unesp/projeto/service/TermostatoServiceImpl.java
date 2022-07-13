/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;

import br.unesp.projeto.model.Termostato;
import br.unesp.projeto.dao.TermostatoDAO;
import br.unesp.projeto.dao.DaoFactory;

import java.util.ArrayList;
import java.util.List;


public class TermostatoServiceImpl implements TermostatoService {

     private TermostatoDAO dao = DaoFactory.getTermostatoDAO();

    
    
    @Override
    public boolean save(Termostato entity) {
        boolean b = false;

        if (dao != null) {
            System.out.println("NOT NULL");
            dao.save(entity);
            b = true;
        }

        return b;
    }
    
    
    
    @Override
    public Termostato findById(Long id) {
        Termostato entity = null;

        if (dao != null) {
            entity = dao.findById(id);
        }

        return entity;
    }
 
    
    @Override
    public List<Termostato> findAll() {
        List<Termostato> lista = null;

        if (dao != null) {
            lista = new ArrayList<>();
            lista = dao.findAll();
        }

        return lista;
    }

     
}
