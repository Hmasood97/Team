package masood.com.example.Team;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.CrossOrigin;
@RestController
public class PlayerController {
    private PlayerRepository repository;

    public PlayerController(PlayerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/players")
    @CrossOrigin(origins = "http://localhost:3000")
    public Collection<Player> goodBeers() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }


}
