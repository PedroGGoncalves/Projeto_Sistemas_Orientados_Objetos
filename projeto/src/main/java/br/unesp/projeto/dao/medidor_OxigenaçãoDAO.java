/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;
import br.unesp.projeto.model.Medidor_oxigenacao;

public interface medidor_OxigenaçãoDAO {
     final String INSERT_Medidor_oxigenacao = "INSERT INTO medidor_oxigenacao(oxigenacao) "
            + "VALUES(?)";

    public boolean save(Medidor_oxigenacao medidor_oxigenacao);
}
