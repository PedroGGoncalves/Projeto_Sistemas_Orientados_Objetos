/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;
import br.unesp.projeto.model.Termostato;
import java.util.List;

public interface TermostatoDAO {
     final String INSERT_TERMOSTATO = "INSERT INTO termostato(temperatura) "
            + "VALUES(?)";
     final String FIND_BY_ID = "SELECT idTermostato, temperatura"
            + "FROM termostato WHERE id_Termostato = ?";

    final String FIND_ALL = "SELECT idTermostato, temperatura "
            + "FROM termostato";

    public boolean save(Termostato termostato);
     
     public Termostato findById(Long idTermostato);

    public List<Termostato> findAll(); 
}
