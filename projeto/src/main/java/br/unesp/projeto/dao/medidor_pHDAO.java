/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;
import br.unesp.projeto.model.Medidor_ph;

public interface medidor_pHDAO {
     final String INSERT_Medidor_ph = "INSERT INTO medidor_ph(ph) "
            + "VALUES(?)";

    public boolean save(Medidor_ph medidor_ph);
}
