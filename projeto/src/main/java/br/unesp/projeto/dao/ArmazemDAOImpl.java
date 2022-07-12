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

public class ArmazemDAOImpl implements ArmazemDAO {
     ArmazemDAOImpl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
                pstm.setLong(1,armazem.getIdArmazem());
                pstm.setInt(2, armazem.getQuantidade());

                pstm.executeUpdate();

                b = true;
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return b;
    }
}
