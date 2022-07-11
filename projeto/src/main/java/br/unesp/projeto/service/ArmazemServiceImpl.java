/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;
import br.unesp.projeto.dao.ArmazemDAO;
import br.unesp.projeto.dao.DaoFactory;
import br.unesp.projeto.model.Armazem;

public class ArmazemServiceImpl implements ArmazemService  {
    private ArmazemDAO dao = DaoFactory.getArmazemDAO();

    @Override
    public boolean save(Armazem entity) {
        boolean b = false;

        if (dao != null) {
            dao.save(entity);
            b = true;
        }

        return b;
    }
}
