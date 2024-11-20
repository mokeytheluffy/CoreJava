package Oct.ex_18102024_switch_condition;

import java.util.Locale;
import java.util.Scanner;

public class Lab084 {
    public static void main(String[] args) {
        //Web automation
        // I will ask user which browser you want me to run the code.
        //chrome--> Execute chrome
        // firefox--> execute of firefox
        // edge--> edge cases
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Browser");
        String browser = sc.next();
        browser = browser.toLowerCase();// use to handle capital letter
        switch (browser){
            case "Chrome":
                System.out.println("Starting the Chrome");
                System.out.println("........");
                System.out.println("TC");
                break;
            case"Firefox":
                System.out.println("Starting the Firefox");
                System.out.println("........");
                System.out.println("TC");
                break;
            case"Edge":
                System.out.println("Starting the Edge");
                System.out.println("........");
                System.out.println("TC");
                break;
            default:
                System.out.println("Invalid entery");
                break;
        // IF default is not used than condition other than mentioned will not match
       // Note:- Web automation through Opera is not possible
        }
    }
}
