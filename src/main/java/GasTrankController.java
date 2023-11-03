import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/gas-tanks")
public class GasTankController {
    private final GasTankService gasTankService;

    @Autowired
    public GasTankController(GasTankService gasTankService) {
        this.gasTankService = gasTankService;
    }

    @GetMapping
    public List<GasTank> getAllGasTanks() {
        return gasTankService.getAllGasTanks();
    }

    @PostMapping
    public GasTank createGasTank(@RequestBody GasTank gasTank) {
        return gasTankService.createGasTank(gasTank);
    }
}

