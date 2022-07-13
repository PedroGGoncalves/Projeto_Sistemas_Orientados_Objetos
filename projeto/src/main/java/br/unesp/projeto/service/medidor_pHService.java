/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;
import br.unesp.projeto.model.Medidor_ph;
import br.unesp.projeto.dao.medidor_PhDAO;
import br.unesp.projeto.dao.DaoFactory;
import java.util.List;
import java.util.ArrayList;


public interface medidor_pHService {

    List<Medidor_ph> findAll();
    Medidor_ph findById(Long id);
    boolean save(Medidor_ph entity);
}
