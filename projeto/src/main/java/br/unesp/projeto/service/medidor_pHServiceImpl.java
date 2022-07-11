/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;
import br.unesp.projeto.dao.medidor_pHDAO;
import br.unesp.projeto.dao.DaoFactory;
import br.unesp.projeto.model.Medidor_ph;

public class medidor_pHServiceImpl implements  medidor_pHService {
    private  medidor_pHDAO dao = DaoFactory.getmedidor_pHDAO();

    @Override
    public boolean save(Medidor_ph entity) {
        boolean b = false;

        if (dao != null) {
            dao.save(entity);
            b = true;
        }

        return b;
    }
}

