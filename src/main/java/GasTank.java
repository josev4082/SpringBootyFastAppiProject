import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GasTank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int capacidad;
    private int nivelActual;
    private String ubicacion;
    private String tipoGasolina;
    private String tipoPago;

    // Getters y setters
}
