/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service_r;
import br.unesp.projeto.model.Login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginService extends JpaRepository<Login, Long> {

    Login findByCpf(String cpf);
   Login getAll(String cpf);
    void delete(int id);
}
