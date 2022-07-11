/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;

import br.unesp.projeto.dao.TanqueDAO;
import br.unesp.projeto.dao.DaoFactory;
import br.unesp.projeto.model.Tanque;


public class TanqueServiceImpl  implements TanqueService{
     private TanqueDAO dao = DaoFactory.getTanqueDAO();

    @Override
    public boolean save(Tanque entity) {
        boolean b = false;

        if (dao != null) {
            dao.save(entity);
            b = true;
        }

        return b;
    }
}
