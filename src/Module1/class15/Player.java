package Module1.class15;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private String country;
    private String span;
    private int matches;
    private int innings;
    private int notOut;
    private int runs;
    private String highestScore;
    private double average;
    private int ballsFaced;
    private double strikeRate;
    private int centuries;
    private int fifties;
    private int ducks;
    private int fours;
    private int sixes;

    public Player(String data) {
        String[] parts = data.split("~");
        this.name = parts[0];
        this.span = parts[1];
        this.matches = Integer.parseInt(parts[2]);
        this.innings = Integer.parseInt(parts[3]);
        this.notOut = Integer.parseInt(parts[4]);
        this.runs = Integer.parseInt(parts[5]);
        this.highestScore = parts[6];
        this.average = Double.parseDouble(parts[7]);
        this.ballsFaced = Integer.parseInt(parts[8]);
        this.strikeRate = Double.parseDouble(parts[9]);
        this.centuries = Integer.parseInt(parts[10]);
        this.fifties = Integer.parseInt(parts[11]);
        this.ducks = Integer.parseInt(parts[12]);
        this.fours = Integer.parseInt(parts[13]);
        this.sixes = Integer.parseInt(parts[14]);

        String[] nameParts = this.name.split("\\s");
        this.country = nameParts[nameParts.length - 1].replaceAll("[\\(\\)/]", "");
    }


    public String toString1() {
        return "Player: " + name + "\n" +
                "Country: " + country + "\n" +
                "Span: " + span + "\n" +
                "Matches: " + matches + "\n" +
                "Innings: " + innings + "\n" +
                "Not Out: " + notOut + "\n" +
                "Runs: " + runs + "\n" +
                "Highest Score: " + highestScore + "\n" +
                "Average: " + average + "\n" +
                "Balls Faced: " + ballsFaced + "\n" +
                "Strike Rate: " + strikeRate + "\n" +
                "Centuries: " + centuries + "\n" +
                "Fifties: " + fifties + "\n" +
                "Ducks: " + ducks + "\n" +
                "Fours: " + fours + "\n" +
                "Sixes: " + sixes;
    }
    @Override
    public String toString() {
        String lineSeparator = "+----------------+------------------+-------+---------+---------+---------+--------------+--------+--------------+-------------+------------+---------+-------+-------+-------+-------+\n";
        String header = "|      Name      |     Country      | Span  | Matches | Innings | Not Out |     Runs     | Highest |   Average    | Balls Faced | Strike Rate | Centuries | Fifties | Ducks | Fours | Sixes |\n";
        StringBuilder sb = new StringBuilder();

        sb.append(lineSeparator);
        sb.append(header);
        sb.append(lineSeparator);
        sb.append(String.format("| %-15s | %-16s | %-5s | %-7d | %-7d | %-7d | %-12d | %-7s | %-12.2f | %-11d | %-12.2f | %-9d | %-7d | %-5d | %-5d | %-5d |\n",
                name, country, span, matches, innings, notOut, runs, highestScore, average, ballsFaced, strikeRate, centuries, fifties, ducks, fours, sixes));
        sb.append(lineSeparator);

        return sb.toString();
    }

    public static List<Player> getListOfPlayers()
    {


        String data1 = "SR Tendulkar (IND)~1989-2012~463~452~41~18426~200*~44.83~21368~86.23~30~96~20~2016~195";
        String data2 = "V Kohli (IND)~2008-2021~254~245~39~12169~183~59.07~12726~95.89~43~62~13~1140~121";
        String data3 = "RT Ponting (AUS)~1995-2012~375~365~39~13704~164~42.03~17046~80.39~30~82~20~1231~162";

        Player player1 = new Player(data1);
        Player player2 = new Player(data2);
        Player player3 = new Player(data3);

        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        return players;
    }

    public static void printPlayerData(List<Player> players) {
        for (Player player : players) {
            System.out.println(player);
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        List<Player> list =getListOfPlayers();
        printPlayerData(list);

    }
}
