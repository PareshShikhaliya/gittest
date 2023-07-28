package Module1.class27;

import java.util.Scanner;

public class teacher_task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] theater = {
                {"-1", "A2", "A3", "A4"},
                {"B1", "-1", "B3", "B4"},
                {"C1", "C2", "-1", "C4"},
                {"D1", "D2", "D3", "D4"}
        };
        System.out.println("Number of seats remanining :");

        for (int i = 0; i < theater.length; i++) {
            for (int j = 0; j < theater[i].length; j++) {
                if(theater[i][j].equals("-1")){
                    continue;
                }else {
                    System.out.print(theater[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("Which seats do you want ?");

        String seatWanted = sc.nextLine();


        for (int i = 0; i < theater.length; i++) {
            for (int j = 0; j < theater[i].length; j++) {
                if( seatWanted.equalsIgnoreCase(theater[i][j]) ) {
                    theater[i][j] = "-1";
                    System.out.println("Enjoy your movie");
                } else if (seatWanted.equals("-1")) {
                    System.out.println("Error! The seat is not available");
                    break;
                }
            }
        }

    }
}
