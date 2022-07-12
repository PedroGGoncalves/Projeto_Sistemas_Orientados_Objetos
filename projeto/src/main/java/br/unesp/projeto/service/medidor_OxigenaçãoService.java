
package br.unesp.projeto.service;
import br.unesp.projeto.model.Medidor_oxigenacao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  medidor_OxigenaçãoService extends JpaRepository<Medidor_oxigenacao, Long> {

    Medidor_oxigenacao find(String oxigenacao);
    Medidor_oxigenacao getAll(String oxigenacao);
    void delete(int id);
}