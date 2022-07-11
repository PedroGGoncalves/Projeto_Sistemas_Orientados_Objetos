/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;
import br.unesp.projeto.model.Termostato;

public interface TermostatoDAO {
     final String INSERT_TERMOSTATO = "INSERT INTO termostato(temperatura) "
            + "VALUES(?)";

    public boolean save(Termostato termostato);
}
