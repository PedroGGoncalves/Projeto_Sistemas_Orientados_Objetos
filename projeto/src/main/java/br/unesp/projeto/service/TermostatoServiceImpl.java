/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;
import br.unesp.projeto.dao.TermostatoDAO;
import br.unesp.projeto.dao.DaoFactory;
import br.unesp.projeto.model.Termostato;

public class TermostatoServiceImpl  implements TermostatoService{
    private TermostatoDAO dao = DaoFactory.getTermostatoDAO();

    @Override
    public boolean save(Termostato entity) {
        boolean b = false;

        if (dao != null) {
            dao.save(entity);
            b = true;
        }

        return b;
    }
}
