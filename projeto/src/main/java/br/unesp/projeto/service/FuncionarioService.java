/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.projeto.service_r;
import br.unesp.projeto.model.Funcionario;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  FuncionarioService extends JpaRepository< Funcionario, Long> {

     Funcionario findByCpf(String cpf);
     Funcionario getAll(String cpf);
    void delete(int id);
}
