/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;

import br.unesp.projeto.model.Funcionario;
import br.unesp.projeto.dao.FuncionarioDAO;
import br.unesp.projeto.dao.DaoFactory;

import java.util.ArrayList;
import java.util.List;


public class FuncionarioServiceImpl implements FuncionarioService {

     private FuncionarioDAO dao = DaoFactory.getFuncionarioDAO();

    
    
    @Override
    public boolean save(Funcionario entity) {
        boolean b = false;

        if (dao != null) {
            System.out.println("NOT NULL");
            dao.save(entity);
            b = true;
        }

        return b;
    }
    
    
    
    @Override
    public Funcionario findById(Long id) {
        Funcionario entity = null;

        if (dao != null) {
            entity = dao.findById(id);
        }

        return entity;
    }
 
    
    @Override
    public List<Funcionario> findAll() {
        List<Funcionario> lista = null;

        if (dao != null) {
            lista = new ArrayList<>();
            lista = dao.findAll();
        }

        return lista;
    }

     
}
  
  
