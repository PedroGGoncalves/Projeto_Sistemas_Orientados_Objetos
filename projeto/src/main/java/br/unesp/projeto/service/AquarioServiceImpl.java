/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;
import br.unesp.projeto.dao.AquarioDAO;
import br.unesp.projeto.dao.DaoFactory;
import br.unesp.projeto.model.Aquario;

public class AquarioServiceImpl implements AquarioService {
    private AquarioDAO dao = DaoFactory.getAquarioDAO();

    @Override
    public boolean save(Aquario entity) {
        boolean b = false;

        if (dao != null) {
            dao.save(entity);
            b = true;
        }

        return b;
    }
}
