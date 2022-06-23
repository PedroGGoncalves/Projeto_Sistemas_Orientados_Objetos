/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;
import br.unesp.projeto.model.Funcionario;
import br.unesp.projeto.utils.FabricaConexao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FuncionarioDAOImpl implements FuncionarioDAO {
    @Override
    public boolean save(Funcionario funcionario) {

        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(INSERT_FUNCIONARIO);
                pstm.setString(1, funcionario.getNome());
                pstm.setString(2, funcionario.getRG());
                pstm.setString(3, funcionario.getCPF());
                pstm.setFloat(4, funcionario.getsalario());
                pstm.setDate(5, (Date) funcionario.getdata_nascimento());
                pstm.setDate(6, funcionario.getcontratacaoo());
                pstm.setBoolean(7,funcionario.islogin());                
             //   pstm.setList(8, funcionario.getLoginn().getIdLogin());

                pstm.executeUpdate();

                b = true;
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return b;
    }
}
