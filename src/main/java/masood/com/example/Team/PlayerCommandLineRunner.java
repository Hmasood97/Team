package masood.com.example.Team;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.stream.Stream;

@Component
public class PlayerCommandLineRunner  implements CommandLineRunner {

    private final PlayerRepository repository;
    public PlayerCommandLineRunner(PlayerRepository  repository) {
        this.repository = repository;
    }
    @Override
    public void run(String... strings) throws Exception {
        //Stream.of("Monk", "Rozier", "Zeller", "Masood").forEach(lastName ->
                //repository.save(new Player(lastName)));
        this.repository.save(new Player("Hisham", "Masood", 20, 10, 10, 75, 35, 45, "UNC", "5'7", 1 ));
        this.repository.save(new Player("Abroon", "Tariq", 15, 5, 7, 90, 55, 50, "UNC", "5,10", 0 ));

        repository.findAll().forEach(System.out::println);
    }
}
