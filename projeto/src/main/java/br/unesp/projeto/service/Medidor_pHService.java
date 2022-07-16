/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;
import br.unesp.projeto.model.Medidor_ph;
import java.util.List;


public interface Medidor_pHService {

    List<Medidor_ph> findAll();
    Medidor_ph findById(long id);
     Medidor_ph save(Medidor_ph entity);

    public void delete(Medidor_ph medidor_phDelete);

    public Medidor_ph update(Medidor_ph medidor_phUpdate);
}
