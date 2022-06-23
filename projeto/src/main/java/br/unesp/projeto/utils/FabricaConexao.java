/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FabricaConexao implements IMySQL {
      /**
     * Este método é responsável por retornar uma conexão
     *
     * @return con (java.sql.Connection): null ou uma conexão ativa
     */
    public static Connection getConexao() {
        Connection con = null;

        try {
            /*
             * O comando baixo faz o carregamento do Driver
             * Caso o driver não esteja no PATH do projeto, uma execeção é lançada.           
             */
            Class.forName(DRIVER_NAME);

            /*
             * O comando abaixo permite criar uma conexão com base nos parâmetros informados
             */
            con = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Message: " + ex.getMessage());
        }

        return con;
    }

    public boolean fechar(Connection con) {
        return false;
    }

    public boolean fechar(Connection con, PreparedStatement pstm) {
        return false;
    }

    public boolean fechar(Connection con, PreparedStatement pstm, ResultSet res) {
        return false;
    }
}
