import java.util.Scanner;

public class driverClass
{
    public static void main(String[] args) {

        //Asking for name:
        Scanner gets = new Scanner(System.in);
        System.out.println("Enter First and Last Name:");
        String name = gets.nextLine();
        String editedName = name.substring(0, 1).toUpperCase();
        System.out.println("Hello " + editedName + "!");

        BuildCorgi dunderhead = new BuildCorgi();
        outfitChoice getOutfit = new outfitChoice();
        accessChoice getAccess = new accessChoice();
        soundChoice getSound = new soundChoice();
        sizeChoice getSize = new sizeChoice();

        double theTotal = 0.00;

        dunderhead.sizeChoice();
        theTotal += dunderhead.getPriceTotal();
        System.out.println(theTotal);
        getOutfit.outfitChoice();
        theTotal += getOutfit.getPriceTotal();
        System.out.println(theTotal);
            getOutfit.outfitChoice();
            getSound.soundChoice();
            getAccess.accessChoice();
            getSize.sizeChoice();
    }
}
