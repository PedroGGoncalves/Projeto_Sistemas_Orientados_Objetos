/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;
import br.unesp.projeto.model.Login;
import java.util.List;


public interface LoginDAO {
     final String INSERT_LOGIN = "INSERT INTO login(ID,Senha) "
            + "VALUES(?,?)";

    final String FIND_ALL = "SELECT ID, Senha "
            + "FROM login";
     
     
    public boolean save(Login login);
     
    public List<Login> findAll(); 
}
