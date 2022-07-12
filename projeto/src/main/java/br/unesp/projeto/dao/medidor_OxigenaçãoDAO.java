/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;
import br.unesp.projeto.model.Medidor_oxigenacao;
import java.util.List;

public interface medidor_OxigenaçãoDAO {
     final String INSERT_Medidor_oxigenacao = "INSERT INTO medidor_oxigenacao(oxigenacao) "
            + "VALUES(?)";
     final String FIND_BY_ID = "SELECT idMedidor_oxigenacao, oxigenacao"
            + "FROM medidor_oxigenacao WHERE id_Medidor_oxigenacao = ?";

    final String FIND_ALL = "SELECT idMedidor_oxigenacao, oxigenacao"
            + "FROM medidor_oxigenacao";

    public boolean save(Medidor_oxigenacao medidor_oxigenacao);
      public Medidor_oxigenacao findById(Long idMedidor_oxigenacao);

    public List<Medidor_oxigenacao> findAll(); 
}
