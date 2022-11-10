import java.util.Scanner;
import java.io.*;

public class LabTester {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int maxCapacity, intComputers, yearMade, yearOfPurchase, ramGB, warrantyExpYear;
        String serialNumber, manufacturer, manufacturerSearch;
        Double processorSpeed;
        boolean installed = false;
        Computer[] computersAboutToExpire;

        System.out.print("Input the maximum capacity of the lab: ");
        maxCapacity = Integer.parseInt(keyboard.nextLine());

        Lab lab = new Lab(maxCapacity);

        //Install computers
        try {
            BufferedReader buffer = new BufferedReader(new FileReader("computers.txt"));
            intComputers = Integer.parseInt(buffer.readLine());

            for (int i = 0; i < intComputers; i++) {
                serialNumber = buffer.readLine();
                manufacturer = buffer.readLine();
                yearMade = Integer.parseInt(buffer.readLine());
                yearOfPurchase = Integer.parseInt(buffer.readLine());
                processorSpeed = Double.parseDouble(buffer.readLine());
                ramGB = Integer.parseInt(buffer.readLine());
                warrantyExpYear = Integer.parseInt(buffer.readLine());
                lab.installComputer(serialNumber, manufacturer, yearMade, yearOfPurchase, processorSpeed, ramGB, warrantyExpYear, i);
            }

            buffer.close();
            installed = true;
        } catch (Exception e) {
            System.out.println("Something went wrong with installing the computers");
        }

        if (installed) {
            System.out.println();

            System.out.println("Average age of the lab computers: " + lab.averageAge());

            System.out.println();

            System.out.println("Newest computer:");
            System.out.println(lab.newestComputer());

            System.out.println();

            System.out.println("Fastest computer:");
            Computer fastest = lab.fastestComputer();
            System.out.println(fastest);

            if (lab.mostMemory() == fastest) {
                System.out.println("It is also the computer with the largest RAM");
            } else {
                System.out.println("It is not the computer with the largest RAM");
            }

            System.out.println();

            System.out.print("Input a manufacturer: ");
            manufacturerSearch = keyboard.nextLine();
            System.out.println("That particular manufacturer has " + 
                lab.manufacturerCount(manufacturerSearch) + " machine(s) in the lab");
            
            System.out.println();

            System.out.println("Computers with warranties that are about to expire: ");
            computersAboutToExpire = lab.warrantyAboutToExpire();
            for (int i = 0; i < computersAboutToExpire.length; i++) {
                System.out.println(computersAboutToExpire[i].getSerialNumber());
            }

        }
        keyboard.close();
    }
}
