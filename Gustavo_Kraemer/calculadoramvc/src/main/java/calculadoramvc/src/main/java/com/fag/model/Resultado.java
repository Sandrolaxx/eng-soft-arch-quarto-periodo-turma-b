package calculadoramvc.src.main.java.com.fag.model;

import jakarta.persistence.*;

@Entity
public class Resultado {

    @Id
    @SequenceGenerator(name = "resultadoSeq", sequenceName = "resultado_id_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "resultadoSeq")
    private Long id;
    
    @Column
    private Double resultado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double resultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

}
