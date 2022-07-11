/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;

import br.unesp.projeto.model.Medidor_salinidade;

public interface medidor_SalinidadeDAO {
     final String INSERT_Medidor_salinidade = "INSERT INTO medidor_salinidade(salinidade) "
            + "VALUES(?)";

    public boolean save(Medidor_salinidade medidor_salinidade);
}
