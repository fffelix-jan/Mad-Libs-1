
/**
 * Mad Lib Assignment (2020-09-21)
 * 
 * @author Denis (Félix) An 
 * @version 1.0
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("a person's name: ");
        String name = br.readLine();
        
        System.out.println("a city: ");
        String city = br.readLine();
        
        System.out.println("a method of public transportation (train, subway, streetcar, etc.): ");
        String pTransit = br.readLine();
        
        System.out.println("a type of place (restaurant, gas station, etc.): ");
        String typeOfPlace = br.readLine();
        
        System.out.println("a non-binary gender (plural): ");
        String nonBinaryGender = br.readLine();
        
        System.out.println("a gift: ");
        String gift = br.readLine();
        
        System.out.println("a friend's name: ");
        String friend = br.readLine();
        
        System.out.println("a currency: ");
        String currency = br.readLine();
        
        System.out.println("an electronic device: ");
        String elDevice = br.readLine();
        
        System.out.println("a school subject: ");
        String subject = br.readLine();
        
        System.out.println("an animal: ");
        String animal = br.readLine();
        
        System.out.println("OK, here is your story:");
        System.out.println("Once upon a time, there was a person named " + name + " who lived in the city of " + city + ". One day, " + name + " decided to take the " + pTransit + " to go to the " + typeOfPlace + " to buy a " + gift + 
        " for. While " + name + " was waiting in line to buy the gift, they really had to go to the washroom! This store was rather interesting though, as it had washrooms for men, women and " + nonBinaryGender + 
        "! When the cashier called on them, " + name + " realized that they were all out of the local currency, so they had to pay in " + currency + ". " + name + " wanted to check the time and the map to get to school so they wouldn't miss their " +
        subject + " class, so they pulled out their " + elDevice + ". " + name + "waited for the " + pTransit + "to take them there. As the " + pTransit + " came, it unfortunately ran over a(n) " + animal + ", killing it. " );
        
        System.out.println("Press Enter to exit...");
        br.readLine();
    }
}
