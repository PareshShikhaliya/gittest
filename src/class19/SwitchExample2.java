package class19;

public class SwitchExample2 {
    public static void main(String[] args) {
        int month = 4;
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
                System.out.println("case 3 is executed");
            case 4:
                System.out.println("case 4 is executed");
            case 5:
                System.out.println("case 5 is executed");
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Unknown";
        }

        System.out.println("The current season is " + season);
    }
}
