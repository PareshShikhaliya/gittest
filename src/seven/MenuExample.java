package seven;

import javax.swing.*;
import java.awt.*;

public class MenuExample extends JFrame {
    private final String[][][] menu = {
            {
                    {"Hamburger", "4.99"},
                    {"Cheeseburger", "5.99"},
                    {"Veggie Burger", "4.99"}
            },
            {
                    {"French Fries", "2.49"},
                    {"Onion Rings", "3.49"},
                    {"Curly Fries", "2.99"}
            },
            {
                    {"Soda", "1.49"},
                    {"Lemonade", "2.49"},
                    {"Iced Tea", "1.99"}
            }
    };

    public MenuExample() {
        setTitle("Menu Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        for (int i = 0; i < menu.length; i++) {
            JPanel panel = new JPanel(new GridLayout(menu[i].length + 1, 2));
            panel.setBorder(BorderFactory.createTitledBorder("Menu " + (i + 1)));

            JLabel itemLabel = new JLabel("Item");
            JLabel priceLabel = new JLabel("Price");
            itemLabel.setHorizontalAlignment(JLabel.CENTER);
            priceLabel.setHorizontalAlignment(JLabel.CENTER);
            panel.add(itemLabel);
            panel.add(priceLabel);

            for (int j = 0; j < menu[i].length; j++) {
                JLabel item = new JLabel(menu[i][j][0]);
                JLabel price = new JLabel("$" + menu[i][j][1]);
                item.setHorizontalAlignment(JLabel.CENTER);
                price.setHorizontalAlignment(JLabel.CENTER);
                panel.add(item);
                panel.add(price);
            }

            add(panel);
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}
