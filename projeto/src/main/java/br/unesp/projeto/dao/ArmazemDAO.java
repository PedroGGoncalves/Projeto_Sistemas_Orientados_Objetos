/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;
import br.unesp.projeto.model.Armazem;

public interface ArmazemDAO {
    final String INSERT_ARMAZEM = "INSERT INTO armazem(idArmazem,quantidade) "
            + "VALUES(?,?)";

    public boolean save(Armazem armazem);
}
