
package br.unesp.projeto.service;
import br.unesp.projeto.model.Medidor_oxigenacao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface medidor_OxigenaçãoService {

     List<Medidor_oxigenacao> findAll();
    Medidor_oxigenacao findById(Long id);
    boolean save(Medidor_oxigenacao entity);
}