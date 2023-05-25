package class12;

public class CricketProgram {
    public static void main(String[] args)
    {
        // Create CricketPlayer objects using different constructors
        CricketPlayer2 player1 = new CricketPlayer2("Virat Kohli", 32, "India");
        CricketPlayer2 player2 = new CricketPlayer2("Rohit Sharma", 34);
        CricketPlayer2 player3 = new CricketPlayer2("AB de Villiers");

        // Accessing object properties using getters
        System.out.println("Player 1: " + player1.getName() + ", " + player1.getAge() + ", " + player1.getTeam());

    }
}
