/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;
import br.unesp.projeto.model.Tanque;
import java.util.List;

public interface TanqueDAO {
    final String INSERT_TANQUE = "INSERT INTO tanque(individuos,ph,salinidade,oxigenacao,horario_alimento,filtro,QR_CODE,termostato,medidor_ph,medidor_salinidade,medidor_oxigenacao) "
            + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
    
     final String FIND_BY_ID = "SELECT idTanque,individuos,ph,salinidade,oxigenacao,horario_alimento,filtro,QR_CODE,termostato,medidor_ph,medidor_salinidade,medidor_oxigenacao"
            + "FROM tanque WHERE idTanque = ?";

    final String FIND_ALL = "SELECT idTanque, individuos,ph,salinidade,oxigenacao,horario_alimento,filtro,QR_CODE,termostato,medidor_ph,medidor_salinidade,medidor_oxigenacao "
            + "FROM tanque";
     

    public boolean save(Tanque tanque);
    
    public Tanque findById(Long idTanque);

    public List<Tanque> findAll(); 
    
}
