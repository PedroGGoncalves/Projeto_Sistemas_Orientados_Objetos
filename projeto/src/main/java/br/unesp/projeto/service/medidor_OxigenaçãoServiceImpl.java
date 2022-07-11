/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;
import br.unesp.projeto.dao.medidor_OxigenaçãoDAO;
import br.unesp.projeto.dao.DaoFactory;
import br.unesp.projeto.model.Medidor_oxigenacao;

public class medidor_OxigenaçãoServiceImpl  implements medidor_OxigenaçãoService {
    private medidor_OxigenaçãoDAO dao = DaoFactory.getmedidor_OxigenaçãoDAO();

    @Override
    public boolean save(Medidor_oxigenacao entity) {
        boolean b = false;

        if (dao != null) {
            dao.save(entity);
            b = true;
        }

        return b;
    }
}
