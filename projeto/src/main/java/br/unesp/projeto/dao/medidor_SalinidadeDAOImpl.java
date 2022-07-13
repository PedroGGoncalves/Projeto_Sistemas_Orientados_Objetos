/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;
import br.unesp.projeto.model.Medidor_salinidade;
import br.unesp.projeto.utils.FabricaConexao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class medidor_SalinidadeDAOImpl implements medidor_SalinidadeDAO  {
     public medidor_SalinidadeDAOImpl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public boolean save(Medidor_salinidade medidor_Salinidade) {

        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(INSERT_Medidor_salinidade);
                pstm.setFloat(1,medidor_Salinidade.getSalinidade());

                pstm.executeUpdate();

                b = true;
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return b;
    }
     @Override
    public Medidor_salinidade findById(Long idMedidor_salinidade) {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
       Medidor_salinidade medidor_salinidade = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_BY_ID);
                pstm.setLong(1, idMedidor_salinidade);
                res = pstm.executeQuery();

                while (res.next()) {
                    medidor_salinidade= new Medidor_salinidade();
                    medidor_salinidade.setIdMedidor_Salinidade(res.getLong(1));
                    medidor_salinidade.setSalinidade(res.getFloat(2));
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return medidor_salinidade;
    }
    
    
    @Override
    public List<Medidor_salinidade> findAll() {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        List<Medidor_salinidade> lista = new ArrayList<>();

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_ALL);                
                res = pstm.executeQuery();
                                
                while (res.next()) {                    
                    Medidor_salinidade medidor_salinidade = new Medidor_salinidade();
                    medidor_salinidade.setIdMedidor_Salinidade(res.getLong(1));
                    medidor_salinidade.setSalinidade(res.getFloat(2));
                    
                    lista.add(medidor_salinidade);
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }
        Collections.sort(lista,Collections.reverseOrder());
        return lista;
    } 
}
