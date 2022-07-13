/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;
import br.unesp.projeto.model.Funcionario;
import java.util.List;

public interface FuncionarioDAO {
     final String INSERT_FUNCIONARIO = "INSERT INTO funcionario(nome_completo, RG, CPF, salario, data_nascimento, contratacao, login) "
            + "VALUES(?,?,?,?,?,?,?)";

    final String FIND_BY_ID = "SELECT idFuncionario, nome_completo, RG, CPF, salario, data_nascimento, contratacao, login "
           + "FROM funcionario WHERE idFuncionario = ?";

    final String FIND_ALL = "SELECT idFuncionario, nome_completo,RG, CPG, salario, data_nascimento, contratacao, login "
            + "FROM funcionario";
     
     
    public boolean save(Funcionario funcionario);
    
    public Funcionario findById(Long idFuncionario);

    public List<Funcionario> findAll();

}
