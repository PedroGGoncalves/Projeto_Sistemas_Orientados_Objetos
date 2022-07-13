/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;

import br.unesp.projeto.model.Aquario;
import br.unesp.projeto.dao.AquarioDAO;
import br.unesp.projeto.dao.DaoFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class AquarioServiceImpl implements AquarioService {

     private AquarioDAO dao = DaoFactory.getAquarioDAO();

    
    
    @Override
    public Aquario save(Aquario entity) {
        Aquario b = null;

        if (dao != null) {
            System.out.println("NOT NULL");
            b =  dao.save(entity);
           
        }

        return b;
    }
    
    
    
    @Override
    public Aquario findById(Long id) {
        Aquario entity = null;

        if (dao != null) {
            entity = dao.findById(id);
        }

        return entity;
    }
 
    
    @Override
    public List<Aquario> findAll() {
        List<Aquario> lista = null;

        if (dao != null) {
            lista = new ArrayList<>();
            lista = dao.findAll();
        }
        Collections.sort(lista,Collections.reverseOrder());
        return lista;
    }

     
}