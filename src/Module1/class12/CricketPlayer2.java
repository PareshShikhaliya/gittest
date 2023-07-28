package Module1.class12;

public class CricketPlayer2 {
    private String name;//1kb
    private int age;
    private String team;

    // Constructor with all parameters
    public CricketPlayer2(String name, int age, String team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }

    // Constructor with name and age parameters
    public CricketPlayer2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with only name parameter
    public CricketPlayer2(String name) {
        this.name = name;
    }

    public CricketPlayer2() {

    }

    // Getter and setter methods...

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for team
    public String getTeam() {
        return team;
    }

    // Setter for team
    public void setTeam(String team) {
        this.team = team;
    }


}
