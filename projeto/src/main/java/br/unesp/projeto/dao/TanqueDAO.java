/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;
import br.unesp.projeto.model.Tanque;

public interface TanqueDAO {
    final String INSERT_TANQUE = "INSERT INTO aquario(idTanque,individuos,ph,salinidade,oxigenacao,horario_alimento,filtro,QR_CODE,termostato,medidor_ph,medidor_salinidade,medidor_oxigenacao) "
            + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

    public boolean save(Tanque tanque);
}
