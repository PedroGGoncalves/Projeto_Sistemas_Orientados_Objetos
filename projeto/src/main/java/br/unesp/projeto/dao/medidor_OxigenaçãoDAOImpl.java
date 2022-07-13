/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;
import br.unesp.projeto.model.Medidor_Oxigenacao;
import br.unesp.projeto.utils.FabricaConexao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class medidor_OxigenacaoDAOImpl implements medidor_OxigenacaoDAO  {
    
     
     public medidor_OxigenacaoDAOImpl() {
        
     }
     
     
    @Override
    public boolean save(Medidor_oxigenacao medidor_Oxigenacao) {

        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(INSERT_Medidor_oxigenacao);
                pstm.setFloat(1,medidor_Salinidade.getOxigenacao());

                pstm.executeUpdate();

                b = true;
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return b;
    }
     @Override
    public Medidor_oxigenacao findById(Long idMedidor_oxigenacao) {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        Aquario aquario = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_BY_ID);
                pstm.setLong(1, idMedidor_oxigenacao);
                res = pstm.executeQuery();

                while (res.next()) {
                    medidor_oxigenacao= new Medidor_oxigenacao();
                    medidor_oxigenacao.setIdMedidor_oxigenacao(res.getLong(1));
                    medidor_oxigenacao.setOxigenacao(res.getFloat(2));
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return aquario;
    }
    
    
    @Override
    public List<Medidor_oxigenacao> findAll() {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        List<Medidor_oxigenacao> lista = new ArrayList<>();

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_ALL);                
                res = pstm.executeQuery();
                                
                while (res.next()) {                    
                    Medidor_oxigenacao medidor_oxigenacao = new Medidor_oxigenacao();
                    medidor_oxigenacao.setIdMedidor_oxigenacao(res.getLong(1));
                    medidor_oxigenacao.setOxigenacao(res.getFloat(2));
                    
                    lista.add(medidor_oxigenacao);
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return lista;
    } 
}
