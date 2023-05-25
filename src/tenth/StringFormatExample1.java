package tenth;

import java.util.Date;

public class StringFormatExample1 {
    public static void main(String[] args) {
        String name = "John";
        int age = 25;
        double height = 1.75;
        boolean isMarried = false;
        char gender = 'M';
        Date birthDate = new Date();

        String formattedString = String.format("Name: %s, Age: %d, Height: %.2f, Married: %b, Gender: %c, Birth Date: %tD %%",
                name, age, height, isMarried, gender, birthDate);

        System.out.println(formattedString);
        System.out.println("Name:"+name+","+"Age");
    }
}


