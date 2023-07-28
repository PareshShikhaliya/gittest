package Module1.class12;

public class CricketPlayer {
    private String name;
    private int age;
    private String team;

    // Constructor
    public CricketPlayer(String name, int age, String team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }

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

    public static void main(String[] args) {
        // Create a CricketPlayer object
        CricketPlayer player = new CricketPlayer("Sachin Tendulkar", 45, "India");
        CricketPlayer player2 = new CricketPlayer("Virat Kohli", 35, "India");



        // Accessing object properties using getters
        System.out.println("Name: " + player2.getName());
        System.out.println("Age: " + player2.getAge());
        System.out.println("Team: " + player2.getTeam());

        // Modifying object properties using setters
        player2.setAge(36);

        player2.setTeam("Banglore");

        // Accessing modified object properties again
        System.out.println("Modified Age: " + player2.getAge());
        System.out.println("Modified Team: " + player2.getTeam());
    }
}
