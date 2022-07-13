/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;

import br.unesp.projeto.model.Aquario;
import br.unesp.projeto.utils.FabricaConexao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AquarioDAOImpl implements AquarioDAO {

    public AquarioDAOImpl() {
        
    }
    
    
    @Override
    public boolean save(Aquario aquario) {

        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(INSERT_AQUARIO);
                pstm.setString(1,aquario.getNome());
                pstm.setString(2, aquario.getEndereco());
                pstm.setString(3, aquario.getHorario_func());
                pstm.setString(4, aquario.getContato());
                pstm.setFloat(5, aquario.getPrecoIngresso());

                pstm.executeUpdate();

                b = true;
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return b;
    }
    
   
    @Override
    public Aquario findById(Long idAquario) {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        Aquario aquario = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_BY_ID);
                pstm.setLong(1, idAquario);
                res = pstm.executeQuery();

                while (res.next()) {
                    aquario = new Aquario();
                    aquario.setIdAquario(res.getLong(1));
                    aquario.setNome(res.getString(2));
                    aquario.setEndereco(res.getString(3));
                    aquario.setHorarioFunc(res.getString(4));
                    aquario.setContato(res.getString(5));
                    aquario.setPrecoIngresso(res.getFloat(6));
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return aquario;
    }
    
    
    @Override
    public List<Aquario> findAll() {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        List<Aquario> lista = new ArrayList<>();

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_ALL);                
                res = pstm.executeQuery();
                                
                while (res.next()) {                    
                    Aquario aquario = new Categoria();
                    aquario.setIdAquario(res.getLong(1));
                    aquario.setNome(res.getString(2));
                    aquario.setEndereco(res.getString(3));
                    aquario.setHorarioFunc(res.getString(4));
                    aquario.setContato(res.getString(5));
                    aquario.setPrecoIngresso(res.getFloat(6));
                    
                    lista.add(aquario);
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return lista;
    } 
}
