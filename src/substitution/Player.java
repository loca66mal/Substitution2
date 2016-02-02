package substitution;
/**
 *
 * @author jpn
 */
public class Player {

    private String firstName;
    private String surName;
    private int number;

    public Player(String firstName, String surName, int number) {
        this.firstName = firstName;
        this.surName = surName;
        this.number = number;
    }

    public Player() {
        firstName = "Tester";
        surName = "Testson";
        number = 99;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public int getNumber() {
        return number;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
