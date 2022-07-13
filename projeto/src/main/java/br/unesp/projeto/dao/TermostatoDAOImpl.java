/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;

import br.unesp.projeto.model.Termostato;
import br.unesp.projeto.utils.FabricaConexao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TermostatoDAOImpl implements TermostatoDAO {
    TermostatoDAOImpl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public boolean save(Termostato termostato) {

        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(INSERT_TERMOSTATO);
                pstm.setFloat(1,termostato.getTemperatura());

                pstm.executeUpdate();

                b = true;
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return b;
    }
    @Override
    public Termostato findById(Long idTermostato) {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        Termostato termostato = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_BY_ID);
                pstm.setLong(1, idTermostato);
                res = pstm.executeQuery();

                while (res.next()) {
                    termostato = new Termostato();
                    termostato.setIdTermostato(res.getLong(1));
                    termostato.setTemperatura(res.getFloat(2));
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return termostato;
    }
    
    
    @Override
    public List<Termostato> findAll() {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        List<Termostato> lista = new ArrayList<>();

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_ALL);                
                res = pstm.executeQuery();
                                
                while (res.next()) {                    
                    Termostato termostato = new Termostato();
                    termostato.setIdAquario(res.getLong(1));
                    termostato.setEndereco(res.getString(2))
                    
                    lista.add(termostato);
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return lista;
    } 
}
