package Program2;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class BabyNames {
    public static void main(String[] args) {

        int x =0;
        while(x==0) {
            Scanner in = new Scanner(System.in);

            int year = 2010;
            String gender = "m";
            String name = "Samuel";

            File file = new File("src/Program2/Data/Babynamesranking" + year + ".txt");
            if (!file.exists()) {
                System.out.println("No file exists");
            }

            int ranking = 0;
            try {
                Scanner input = new Scanner(file);
                while (input.hasNext()) {

                    String s = input.nextLine();
                    //splits lines by spaces and creates a string value in array to compare with desired string value
                    String[] names = s.split(" ");

                    //temp at 0 is the ranking number
                    //temp at 1 is the  male column of names
                    //temp at 3 is the female column of names
                    if (names[1].contains(name)) {
                        ranking = new Integer(names[0]);
                        break;
                    }
                     if (names[3].contains(name)) {
                        ranking = new Integer(names[0]);
                        break;
                    }
                }
                //second exeception incase first fails to stop a file not being found
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
                // will print Samuel is rank #24 in the year 2010
            if (ranking == 0) {
                System.out.println("The name " + name + " is not in the year " + year);
            } else {
                System.out.println(name + " is rank #" + ranking + " in the year " + year);
            }
            System.out.println("Enter '1' to quit the program. Enter '0' to run the program again");
            x= in.nextInt();
        }

    }
}