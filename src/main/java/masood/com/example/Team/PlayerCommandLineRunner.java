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
        this.repository.save(new Player("Hisham", "Masood", 20, 13, 10, 75, 40, 45, "UNC", "5'7", 1 ));
        this.repository.save(new Player("Abroon", "Tariq", 15, 5, 7, 90, 55, 50, "UNC", "5'10", 11 ));
        this.repository.save(new Player("Ibrahim", "Henson", 12, 4, 13, 70, 32, 45, "UNC", "5'11", 35 ));
        this.repository.save(new Player("Haris", "Ahmad", 25, 5, 14, 85, 34, 55, "NC State", "6'1", 17 ));
        this.repository.save(new Player("Ahmad", "Atieh", 17, 7, 15, 80, 34, 52, "UNC", "5'10", 52 ));
        this.repository.save(new Player("Syed", "Azeem", 19, 4, 20, 80, 37, 58, "NC State", "6'3", 14 ));
        this.repository.save(new Player("Aamir", "Khan", 14, 7, 5, 90, 30, 40, "Waterloo", "5'6", 24 ));
        this.repository.save(new Player("Ezan", "Chaudhury", 5, 2, 3, 40, 15, 20, "UNC", "5'10", 22 ));


        repository.findAll().forEach(System.out::println);
    }
}
