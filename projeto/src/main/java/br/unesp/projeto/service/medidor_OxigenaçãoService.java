
package br.unesp.projeto.service_r;
import br.unesp.projeto.model.Medidor_oxigenacao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  medidor_OxigenaçãoService extends JpaRepository<Medidor_oxigenacao, Long> {

    Medidor_oxigenacao findByCpf(String cpf);
    Medidor_oxigenacao getAll(String cpf);
    void delete(int id);
}