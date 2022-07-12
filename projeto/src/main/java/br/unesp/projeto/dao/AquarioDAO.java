/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;
import br.unesp.projeto.model.Aquario;
import java.util.List;

public interface AquarioDAO {
     final String INSERT_AQUARIO = "INSERT INTO aquario(nome,endereco,horario_func,contato,precoIngresso) "
            + "VALUES(?,?,?,?,?)";

     final String FIND_BY_ID = "SELECT idAquario, nome, endereco, horario_func, contato, precoIngresso"
            + "FROM aquario WHERE id_Aquario = ?";

    final String FIND_ALL = "SELECT idAquario, nome, endereco, horario_func, contato, precoIngresso "
            + "FROM aquario";
     
     
    public boolean save(Aquario aquario);
     
    public Aquario findById(Long idAquario);

    public List<Aquario> findAll(); 
     
    
}
