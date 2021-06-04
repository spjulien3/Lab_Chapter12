package Program3;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TopFiveBabyNames  {
    public static void main(String[] args) throws FileNotFoundException{
        String mlist [][] = new String[10][5];
        String flist [][] = new String[10][5];

        int year = 2001;
        for (int i = 0; i < 10; i++) {
            File file1 = new File("src/Program2/Data/Babynamesranking" + year + ".txt");
            try {
                Scanner input = new Scanner(file1);
                for (int j = 0; j <5; j++) {

                    String s = input.nextLine();
                    //splits lines by spaces and creates a string value in array to compare with desired string value
                    String[] names = s.split(" ");


                    if (names.length >=4) {
                        mlist[i][j] = names[1];
                        flist[i][j] = names[2]+names[3];
                    }


                }
            } catch (NoSuchElementException ex) {
                ex.printStackTrace();
            }

            year++;

        }

       /* 2001                    2002                    2003                   2004                    2005                    2006                    2007                    2008                    2009                    2010
        1||	Jacob	32,509        	Jacob	30,541        	Jacob	29,601        	Jacob	27,854        	Jacob	25,794        	Jacob	24,797        	Jacob	24,216        	Jacob	22,507        	Jacob	21,036        	Jacob	21,875
        2||	Michael	29,666      	Michael	28,220      	Michael	27,086      	Michael	25,416      	Michael	23,774      	Michael	22,592      	Michael	21,915      	Michael	20,524      	Ethan	19,783        	Ethan	17,866
        3||	Matthew	26,783      	Joshua	25,965       	Joshua	25,069       	Joshua	24,170       	Joshua	23,208       	Joshua	22,269       	Ethan	20,996        	Ethan	20,174        	Michael	18,822      	Michael	17,133
        4||	Joshua	25,998       	Matthew	25,142      	Matthew	23,979      	Matthew	22,857      	Matthew	21,440      	Ethan	20,485        	Joshua	20,599       	Joshua	19,133       	Alexander	18,175    	Jayden	17,030
        5||	Christopher	23,107  	Ethan	22,099        	Andrew	22,133       	Ethan	22,195        	Ethan	21,293        	Matthew	20,285      	Daniel	20,194       	Daniel	18,935       	William	17,852      	William	16,870
*/
        year = 2001;
        System.out.printf("    %-21s   %-21s   %-21s  %-21s   %-21s   %-21s   %-21s   %-21s   %-21s   %-21s\n","2001","2002","2003","2004","2005"
                ,"2006","2007","2008","2009","2010");

        for (int i = 0; i < 5; i++) {

            year++;
            System.out.print(i+1+"||");
            for (int j = 0; j < 10; j++) {
                System.out.printf("%-21s",mlist[j][i]);

            }

            System.out.println();


        }

       /* 2001                     2002                    2003                   2004                    2005                    2006                    2007                    2008                    2009                    2010
        1||	Emily	25,048        	Emily	24,450        	Emily	25,678        	Emily	25,009        	Emily	23,907        	Emily	21,365        	Emily	19,322        	Emma	18,765         	Isabella	22,222     	Isabella	22,731
        2||	Madison	22,149      	Madison	21,771      	Emma	22,690         	Emma	21,591         	Emma	20,318         	Emma	19,092         	Isabella	19,105     	Isabella	18,564     	Emma	17,830         	Sophia	20,477
        3||	Hannah	20,700       	Hannah	18,802       	Madison	20,190      	Madison	20,607      	Madison	19,549      	Madison	18,599      	Emma	18,338         	Emily	17,397        	Olivia	17,374       	Emma	17,179
        4||	Ashley	16,522       	Emma	16,520         	Hannah	17,621       	Olivia	16,098       	Abigail	15,738      	Isabella	18,200     	Ava	18,031          	Olivia	17,030       	Sophia	16,869       	Olivia	16,860
        5||	Alexis	16,391       	Alexis	15,629       	Olivia	16,138       	Hannah	15,593       	Olivia	15,685       	Ava	16,925          	Madison	17,918      	Ava	17,007          	Ava	15,826          	Ava	15,300
*/
        System.out.println("\n\n");
        year = 2001;
        System.out.printf("    %-21s    %-21s   %-21s  %-21s   %-21s   %-21s   %-21s   %-21s   %-21s   %-21s\n","2001","2002","2003","2004","2005"
                ,"2006","2007","2008","2009","2010");

        for (int i = 0; i < 5; i++) {

            year++;
            System.out.print(i+1+"||");
            for (int j = 0; j < 10; j++) {
                System.out.printf("%-21s",flist[j][i]);

            }

            System.out.println();


        }
    }
}
