/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;
import br.unesp.projeto.model.Medidor_ph;
import br.unesp.projeto.utils.FabricaConexao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class medidor_pHDAOImpl implements medidor_pHDAO {
    medidor_pHDAOImpl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public boolean save(Medidor_ph medidor_ph) {

        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(INSERT_Medidor_ph);
                pstm.setFloat(1,medidor_ph.getPh());

                pstm.executeUpdate();

                b = true;
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return b;
    }
    @Override
    public Medidor_ph findById(Long idMedidor_ph) {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        Medidor_ph medidor_ph = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_BY_ID);
                pstm.setLong(1, idMedidor_ph);
                res = pstm.executeQuery();

                while (res.next()) {
                    medidor_ph = new medidor_ph();
                    medidor_ph.setIdMedidor_ph(res.getLong(1));
                    medidor_ph.setTemperatura(res.getFloat(2));
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return medidor_ph;
    }
    
    
    @Override
    public List<Medidor_ph> findAll() {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        List<Medidor_ph> lista = new ArrayList<>();

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_ALL);                
                res = pstm.executeQuery();
                                
                while (res.next()) {                    
                    Medidor_ph medidor_ph = new medidor_ph();
                    medidor_ph.setIdAquario(res.getLong(1));
                    medidor_ph.setEndereco(res.getString(2));
                    
                    lista.add(medidor_ph);
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return lista;
    }
}
