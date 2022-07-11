/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;
import br.unesp.projeto.dao.medidor_SalinidadeDAO;
import br.unesp.projeto.dao.DaoFactory;
import br.unesp.projeto.model.Medidor_salinidade;

public class medidor_SalinidadeServiceImpl implements medidor_SalinidadeService {
    private medidor_SalinidadeDAO dao = DaoFactory.getmedidor_salinidadeDAO();

    @Override
    public boolean save(Medidor_salinidade entity) {
        boolean b = false;

        if (dao != null) {
            dao.save(entity);
            b = true;
        }

        return b;
    }
}
