/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;

import br.unesp.projeto.model.Login;
import br.unesp.projeto.dao.LoginDAO;
import br.unesp.projeto.dao.DaoFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class loginServiceImpl implements LoginService {

     private LoginDAO dao = DaoFactory.getLoginDAO();

    
    
    @Override
    public boolean save(Login entity) {
        boolean b = false;

        if (dao != null) {
            System.out.println("NOT NULL");
            dao.save(entity);
            b = true;
        }

        return b;
    }
 
    
    @Override
    public List<Login> findAll() {
        List<Login> lista = null;

        if (dao != null) {
            lista = new ArrayList<>();
            lista = dao.findAll();
        }
        Collections.sort(lista,Collections.reverseOrder());
        return lista;
    }

     
}
