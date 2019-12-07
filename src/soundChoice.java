import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class soundChoice {
    NumberFormat formatter = new DecimalFormat("##.##");
    Scanner gets = new Scanner(System.in);

    double priceTotal = 0;
    String total = "Total :$";
    boolean right = true;
    String choice;
    String sound;
    double cost;

    String soundArray [] = {"hb", "ily","pm","p"};

    public void soundChoice() {
        right = true;
        do {
            System.out.println(" ");
            System.out.println("Choose a sound for your Corgi!");
            System.out.println("******************************");
            System.out.println(" ");
            System.out.println("Heartbeat: $2.49  (hb)");
            System.out.println("I love you!: $2.99 (ily)");
            System.out.println("Personalized message: $3.49 (pm)");
            System.out.println("Puppy 5-in-1 sounds: $4.99 (p)");
            sound = gets.nextLine();

            switch (sound) {
                case "hb":
                    choice = "Heartbeat";
                    priceTotal += 11.00;
                    System.out.println(total + formatter.format(priceTotal));
                    cost = 11.00;
                    right = false;
                    break;

                case "ily":
                    choice = "I love you";
                    priceTotal += 12.00;
                    cost = 12.00;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "pm":
                    choice = "Personalized message";
                    priceTotal += 12.50;
                    cost = 12.50;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                case "p":
                    choice = "Puppy 5-in-1";
                    priceTotal += 13.50;
                    cost = 13.50;
                    System.out.println(total + formatter.format(priceTotal));
                    right = false;
                    break;

                default:
                    String end = "Ooooops! Not an option! Do it again.";
                    System.out.println("");
                    System.out.println(end);
                    break;
            }

        } while (right);
    }
}
