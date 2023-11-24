package calculadoramvc.src.main.java.com.fag.service;

import calculadoramvc.src.main.java.com.fag.model.Resultado;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import jakarta.persistence.EntityManager;

@ApplicationScoped
public class ResultadoService {

    @Inject
    EntityManager em;

    @Transactional
    public void salvar(Resultado resultado) {
        em.persist(resultado);
    }

}
