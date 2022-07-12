/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;

import br.unesp.projeto.model.Tanque;
import br.unesp.projeto.utils.FabricaConexao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TanqueDAOImpl implements TanqueDAO{
     TanqueDAOImpl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public boolean save(Tanque tanque) {

        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(INSERT_TANQUE);
                pstm.setLong(1,tanque.getIdTanque());
                pstm.setInt(2, tanque.getIndividuos());
                pstm.setFloat(3, tanque.getPh());
                pstm.setFloat(4, tanque.getSalinidade());
                pstm.setFloat(5, tanque.getOxigenacao());
                pstm.setString(6,tanque.getHorario_alimento());
                pstm.setBoolean(7, tanque.isFiltro());
                pstm.setString(8, tanque.getQR_CODE());
                pstm.setInt(9, tanque.getTermostato().getTemperatura());
                pstm.setInt(10, tanque.getMedidor_ph().getPh());
                pstm.setInt(11,tanque.getMedidor_salinidade().getSalinidade());
                pstm.setInt(12, tanque.getMedidor_oxigenacao().getOxigenacao());

                pstm.executeUpdate();

                b = true;
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return b;
    }
    
    
}
