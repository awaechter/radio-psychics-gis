package imstuff;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomDelimiter {

   public static void main(String[] args ) throws FileNotFoundException {
      Scanner sc = new Scanner(new File(args[0]));
      int g;
      while(sc.hasNextLine()) {
         System.out.print(sc.next() + "\t" + sc.next() + "\t" + sc.next() + "\t" + sc.next() + "\t" + sc.next() + "\t" + sc.next() + "\t" + sc.next() + "\t" + sc.next() + "\t");
         while(!sc.hasNext("US")) {
            System.out.print(sc.next() + " ");
         }
         System.out.print("\t");
         System.out.print(sc.next() + "\t");System.out.print(sc.next() + "\t");System.out.print(sc.next() + "\t");
         if (sc.hasNext("kW")) {
            System.out.print("0\t");
         } else {
            System.out.print(sc.next() + "\t");
         }
         System.out.print(sc.next() + "\t");
         if (!sc.hasNext("DA")) {
            System.out.print("n\t");
         } else {
            sc.next();
            System.out.print("y\t");
         }
         System.out.print(sc.next() + "\t");System.out.print(sc.next() + "\t");System.out.print(sc.next() + "\t");System.out.print(sc.next() + "\t");
         if (sc.hasNext("m")) {
            System.out.print("0\t");
         } else {
            System.out.print(sc.next() + "\t");
         }
         System.out.print(sc.next() + "\t");
         System.out.print(sc.next() + " " + sc.nextInt() + " " + sc.nextInt() + " " + sc.nextDouble() + "\t");
         System.out.print(sc.next() + " " + sc.nextInt() + " " + sc.nextInt() + " " + sc.nextDouble() + "\t");
         System.out.print(sc.next() + "\t");
         System.out.println(sc.next() + sc.nextLine());
      }
   }

}
