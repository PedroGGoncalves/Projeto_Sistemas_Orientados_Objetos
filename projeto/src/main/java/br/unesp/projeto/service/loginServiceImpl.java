/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;
import br.unesp.projeto.dao.LoginDAO;
import br.unesp.projeto.dao.DaoFactory;
import br.unesp.projeto.model.Login;


public class loginServiceImpl implements loginService {
    private LoginDAO dao = DaoFactory.getLoginDAO();

    @Override
    public boolean save(Login entity) {
        boolean b = false;

        if (dao != null) {
            dao.save(entity);
            b = true;
        }

        return b;
    }
}
