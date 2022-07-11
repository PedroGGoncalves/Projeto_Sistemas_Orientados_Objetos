/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;
import br.unesp.projeto.dao.FuncionarioDAO;
import br.unesp.projeto.dao.DaoFactory;
import br.unesp.projeto.model.Funcionario;

public class FuncionarioServiceImpl implements FuncionarioService {
    private FuncionarioDAO dao = DaoFactory.getFuncionarioDAO();

    @Override
    public boolean save(Funcionario entity) {
        boolean b = false;

        if (dao != null) {
            dao.save(entity);
            b = true;
        }

        return b;
    }
}
