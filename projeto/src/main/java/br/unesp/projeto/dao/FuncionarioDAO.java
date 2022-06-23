/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;
import br.unesp.projeto.model.Funcionario;

public interface FuncionarioDAO {
     final String INSERT_FUNCIONARIO = "INSERT INTO funcionario(nome_completo, RG, CPF, salario, "
            + "data_nascimento, contratacao,  login,  loginn) "
            + "VALUES(?,?,?,?,?,?,?,?,)";

    public boolean save(Funcionario funcionario);
}
