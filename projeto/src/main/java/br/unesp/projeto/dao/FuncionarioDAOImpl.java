/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;
import br.unesp.projeto.model.Funcionario;
import br.unesp.projeto.model.Login;
import br.unesp.projeto.utils.FabricaConexao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAOImpl implements FuncionarioDAO {
    
     public FuncionarioDAOImpl() {
        
     }
    
    
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
                pstm.setString(1, funcionario.getNome_completo());
                pstm.setString(2, funcionario.getRG());
                pstm.setString(3, funcionario.getCPF());
                pstm.setFloat(4, funcionario.getSalario());
                pstm.setDate(5, (Date) funcionario.getData_nascimento());
                pstm.setDate(6, (Date) funcionario.getContratacao());
                pstm.setBoolean(7,funcionario.isLogin());                
             //   pstm.setList(8, funcionario.getLoginn().getIdLogin());

                pstm.executeUpdate();

                b = true;
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return b;
    }
    
    
    @Override
    public Funcionario findById(Long idFuncionario) {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        Funcionario func = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_BY_ID);
                pstm.setLong(1, idFuncionario);
                res = pstm.executeQuery();

                while (res.next()) {
                    func = new Funcionario();
                    func.setIdFuncionario(res.getLong(1));
                    func.setNome_completo(res.getString(2));
                    func.setRG(res.getString(3));
                    func.setCPF(res.getString(4));
                    func.setSalario(res.getFloat(5));
                    func.setData_nascimento(res.getDate(6));
                    func.setContratacao(res.getDate(7));
                    func.setLogin(res.getBoolean(8));
                //    func.setLoginn((List<Login>) res.getArray(9));
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return func;
    }

 @Override
    public List<Funcionario> findAll() {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        List<Funcionario> lista = new ArrayList<>();

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_ALL);                
                res = pstm.executeQuery();
                                
                while (res.next()) {                    
                    Funcionario func = new Funcionario();
                    func.setIdFuncionario(res.getLong(1));
                    func.setNome_completo(res.getString(2));
                    func.setRG(res.getString(3));
                    func.setCPF(res.getString(4));
                    func.setSalario(res.getFloat(5));
                    func.setData_nascimento(res.getDate(6));
                    func.setContratacao(res.getDate(7));
                    func.setLogin(res.getBoolean(8));
             //       func.setLoginn((List<Login>) res.getArray(9));
                    
                    lista.add(func);
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return lista;
    }
}
