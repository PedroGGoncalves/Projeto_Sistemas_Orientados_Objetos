/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;
import br.unesp.projeto.model.Armazem;
import br.unesp.projeto.utils.FabricaConexao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArmazemDAOImpl implements ArmazemDAO {
    public  ArmazemDAOImpl() {
        
          
    }
    @Override
    public boolean save(Armazem armazem) {

        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(INSERT_ARMAZEM);
                pstm.setInt(1, armazem.getQuantidade());

                pstm.executeUpdate();

                b = true;
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return b;
    }
     
     
     
    @Override
    public Armazem findById(Long IdArmazem) {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        Armazem armazem = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_BY_ID);
                pstm.setLong(1, IdArmazem);
                res = pstm.executeQuery();

                while (res.next()) {
                    armazem = new Armazem();
                    armazem.setIdArmazem(res.getLong(1));
                    armazem.setQuantidade(res.getInt(2));
                
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return armazem;
    } 
     
    @Override
    public List<Armazem> findAll() {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        List<Armazem> lista = new ArrayList<>();

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_ALL);                
                res = pstm.executeQuery();
                                
                while (res.next()) {                    
                    Armazem armazem = new Armazem();
                    armazem.setIdArmazem(res.getLong(1));
                    armazem.setQuantidade(res.getInt(2));
                    
                    lista.add(armazem);
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }
        Collections.sort(lista,Collections.reverseOrder());
        return lista;
    } 
     
}
