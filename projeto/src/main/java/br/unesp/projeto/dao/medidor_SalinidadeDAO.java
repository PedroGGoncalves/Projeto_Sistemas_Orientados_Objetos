/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;
import java.util.List;
import br.unesp.projeto.model.Medidor_salinidade;

public interface medidor_SalinidadeDAO {
     final String INSERT_Medidor_salinidade = "INSERT INTO medidor_salinidade(salinidade) "
            + "VALUES(?)";
     
     final String FIND_BY_ID = "SELECT idMedidor_salinidade,salinidade"
            + "FROM medidor_salinidade WHERE idMedidor_salinidade = ?";

    final String FIND_ALL = "SELECT idMedidor_salinidade,salinidade "
            + "FROM medidor_salinidade";

    public boolean save(Medidor_salinidade medidor_salinidade);
     public Medidor_salinidade findById(Long idMedidor_salinidade);

    public List<Medidor_salinidade> findAll(); 
}
