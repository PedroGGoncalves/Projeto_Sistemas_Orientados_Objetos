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
                pstm.setInt(1, tanque.getIndividuos());
                pstm.setFloat(2, tanque.getPh());
                pstm.setFloat(3, tanque.getSalinidade());
                pstm.setFloat(4, tanque.getOxigenacao());
                pstm.setString(5,tanque.getHorario_alimento());
                pstm.setBoolean(6, tanque.isFiltro());
                pstm.setString(7, tanque.getQR_CODE());
          
                pstm.executeUpdate();

                b = true;
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return b;
    }
    
    @Override
    public Tanque findById(Long idTanque) {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        Tanque tanque = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_BY_ID);
                pstm.setLong(1, idTanque);
                res = pstm.executeQuery();

                while (res.next()) {
                    tanque = new Tanque();
                    tanque.setIdTanque(res.getLong(1));
                    tanque.setIndividuos(res.getInt(2));
                    tanque.setPh(res.getFloat(3));
                    tanque.setSalinidade(res.getFloat(4));
                    tanque.setOxigenacao(res.getFloat(5));
                    tanque.setHorarioAlimento(res.getString(6));
                    tanque.setFiltro(res.getBoolean(7));
                    tanque.setQRCODE(res.getString(8));
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return tanque;
    }
    
     
    @Override
    public List<Tanque> findAll() {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        List<Tanque> lista = new ArrayList<>();

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_ALL);                
                res = pstm.executeQuery();
                                
                while (res.next()) {                    
                    Tanque tanque = new Tanque();
                    tanque.setIdTanque(res.getLong(1));
                    tanque.setIndividuos(res.getInt(2));
                    tanque.setPh(res.getFloat(3));
                    tanque.setSalinidade(res.getFloat(4));
                    tanque.setOxigenacao(res.getFloat(5));
                    tanque.setHorarioAlimento(res.getString(6));
                    tanque.setFiltro(res.getBoolean(7));
                    tanque.setQRCODE(res.getString(8));
                    
                    lista.add(tanque);
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return lista;
    } 
     
     
}
