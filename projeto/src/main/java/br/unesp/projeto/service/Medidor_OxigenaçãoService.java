
package br.unesp.projeto.service;
import br.unesp.projeto.model.Medidor_oxigenacao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Medidor_OxigenaçãoService {

     List<Medidor_oxigenacao> findAll();
    Medidor_oxigenacao findById(long id);
   Medidor_oxigenacao save(Medidor_oxigenacao entity);

    public void delete(Medidor_oxigenacao medidor_oxigenacaoDelete);

    public Medidor_oxigenacao update(Medidor_oxigenacao medidor_oxigenacaoUpdate);
}
