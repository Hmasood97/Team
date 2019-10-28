package masood.com.example.Team;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Player {

    //ID WILL BE THERE PLAYER NUMBER
    @Id
    @GeneratedValue
    private  Long Id;
    private String firstName;
    private String lastName;
    private int points;
    private int assists;
    private int rebounds;
    private int freeThrows;
    private int threePoint;
    private int fieldGoal;
    private String collegePlayed;
    private int weight;
    private String height;
    private int jerseyNumber;

    private Player() {

    }
    public Player (String firstName, String lastName, int points, int assists, int rebounds, int freeThrows, int threePoint, int fieldGoal, String collegePlayed, String height, int jerseyNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this. points = points;
        this.assists = assists;
        this.rebounds = rebounds;
        this.freeThrows = freeThrows;
        this.threePoint = threePoint;
        this.fieldGoal = fieldGoal;
        this.collegePlayed = collegePlayed;
        this.height = height;
        this.jerseyNumber = jerseyNumber;
    }

    public Player(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {

        return Objects.hash(Id, jerseyNumber, lastName );
    }

    public void setId(Long id) {
        Id = id;
    }
    public Long getID() {
        return Id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getAssists() {
        return assists;
    }

    public void setRebounds(int rebounds) {
        this.rebounds = rebounds;
    }

    public int getRebounds() {
        return rebounds;
    }

    public void setFieldGoal(int fieldGoal) {
        this.fieldGoal = fieldGoal;
    }

    public int getFieldGoal() {
        return fieldGoal;
    }

    public void setFreeThrows(int freeThrows) {
        this.freeThrows = freeThrows;
    }

    public int getFreeThrows() {
        return freeThrows;
    }

    public void setThreePoint(int threePoint) {
        this.threePoint = threePoint;
    }

    public int getThreePoint() {
        return threePoint;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setCollegePlayed(String collegePlayed) {
        this.collegePlayed = collegePlayed;
    }

    public String getCollegePlayed() {
        return collegePlayed;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + Id +
                ", name='" + firstName + '\'' +
                '}';
    }
}
