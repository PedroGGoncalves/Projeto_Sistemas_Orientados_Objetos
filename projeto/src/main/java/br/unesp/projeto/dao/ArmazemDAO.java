/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;
import br.unesp.projeto.model.Armazem;
import java.util.List;

public interface ArmazemDAO {
    final String INSERT_ARMAZEM = "INSERT INTO armazem(quantidade) "
            + "VALUES(?,?)";
    
    final String FIND_BY_ID = "SELECT idArmazem,quantidade"
            + "FROM aquario WHERE id_Aquario = ?";
    
    final String FIND_ALL = "SELECT  idArmazem,quantidade "
            + "FROM aquario";

    

    public boolean save(Armazem armazem);
    
    public Armazem findById(Long idArmazem);

    public List<Armazem> findAll(); 
}
