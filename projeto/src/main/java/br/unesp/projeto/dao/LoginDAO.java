/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;
import br.unesp.projeto.model.Login;

public interface LoginDAO {
     final String INSERT_LOGIN = "INSERT INTO aquario(idLogin,ID,Senha) "
            + "VALUES(?,?,?)";

    public boolean save(Login login);
}
