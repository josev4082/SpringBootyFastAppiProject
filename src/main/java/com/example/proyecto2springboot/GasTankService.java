import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GasTankService {
    private final GasTankRepository gasTankRepository;

    @Autowired
    public GasTankService(GasTankRepository gasTankRepository) {
        this.gasTankRepository = gasTankRepository;
    }

    public List<GasTank> getAllGasTanks() {
        return gasTankRepository.findAll();
    }

    public GasTank createGasTank(GasTank gasTank) {
        return gasTankRepository.save(gasTank);
    }
}
