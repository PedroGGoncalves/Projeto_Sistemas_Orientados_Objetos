/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;

import br.unesp.projeto.model.Medidor_salinidade;
import br.unesp.projeto.dao.medidor_SalinidadeDAO;
import br.unesp.projeto.dao.DaoFactory;

import java.util.ArrayList;
import java.util.List;


public class medidor_SalinidadeServiceImpl implements medidor_SalinidadeService {

     private medidor_SalinidadeDAO dao = DaoFactory.getmedidor_salinidadeDAO();

    
    
    @Override
    public boolean save(Medidor_salinidade entity) {
        boolean b = false;

        if (dao != null) {
            System.out.println("NOT NULL");
            dao.save(entity);
            b = true;
        }

        return b;
    }
    
    
    
    @Override
    public Medidor_salinidade findById(Long id) {
        Medidor_salinidade entity = null;

        if (dao != null) {
            entity = dao.findById(id);
        }

        return entity;
    }
 
    
    @Override
    public List<Medidor_salinidade> findAll() {
        List<Medidor_salinidade> lista = null;

        if (dao != null) {
            lista = new ArrayList<>();
            lista = dao.findAll();
        }

        return lista;
    }

     
}