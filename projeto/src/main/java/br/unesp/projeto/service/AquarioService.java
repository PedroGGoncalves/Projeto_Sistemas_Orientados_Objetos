/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service;
import br.unesp.projeto.model.Aquario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AquarioService extends JpaRepository<Aquario, Long> {

    Aquario findByCpf(String cpf);
    Aquario getAll(String cpf);
    void delete(int id);
}
