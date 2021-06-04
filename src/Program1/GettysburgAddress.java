package Program1;

import java.util.Scanner;

public class GettysburgAddress {
    public static void main(String[] args) {
        try {
            int x = 0;
                Scanner in = new Scanner(System.in);


            java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Lincoln.txt ");
            Scanner input = new Scanner(url.openStream());
            int count = 0;
            while (input.hasNext()) {
                input.next();
                count++;
            }
            // will print The Gettysburg Address has 277 words
            System.out.println("The Gettysburg Address has " + count + " words");

        } catch (
                java.net.MalformedURLException ex)

        {
            System.out.println("Invalid URL");
        } catch (
                java.io.IOException ex)

        {
            System.out.println("IO ERRORS");
        }
    }
}

