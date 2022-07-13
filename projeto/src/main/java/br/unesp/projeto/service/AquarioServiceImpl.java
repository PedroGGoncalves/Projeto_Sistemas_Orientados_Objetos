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
import java.util.List;


public class AquarioServiceImpl implements AquarioService {

     private AquarioDAO dao = DaoFactory.getAquarioDAO();

    
    
    @Override
    public boolean save(Aquario entity) {
        boolean b = false;

        if (dao != null) {
            System.out.println("NOT NULL");
            dao.save(entity);
            b = true;
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

        return lista;
    }

     
}
