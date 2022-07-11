/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.dao;
import br.unesp.projeto.model.Aquario;

public interface AquarioDAO {
     final String INSERT_AQUARIO = "INSERT INTO aquario(nome,endereco,horario_func,contato,precoIngresso) "
            + "VALUES(?,?,?,?,?)";

    public boolean save(Aquario aquario);
}
