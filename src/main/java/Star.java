 /*
  * To change this license header, choose License Headers in Project Properties.
  * To change this template file, choose Tools | Templates
  * and open the template in the editor.
  */
 package Star;

 import java.util.Scanner;

 /**
  *
  * @author elshad.sharbatov
  */
 public class Star {

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
         // TODO code application logic here
        // Scanner scan=new Scanner(System.in);
        // System.out.println("Ədədi daxil edin :");
        // int a=scan.nextInt();
        // Ters(a);
        // Duz(a);
         String secim = "";
         Scanner scan = new Scanner(System.in);
         System.out.println("Ədədi daxil edin: ");
         int say = scan.nextInt();
         System.out.println("Simvolu daxil edin");
         String simvol = scan.next();
         System.out.println("Ardicil isə Ard  ,AltAlta isə Alt yazın:");
         secim = scan.next();

         if (secim.equals("Ard")) {
             Ardicil(say, simvol);
         } else if (secim.equals("Alt")) {
             Altalta(say, simvol);
         }
     }

     public static void Duz(int a) {
         for (int i = 1; i <= a; i++) {
             for (int j = 0; j < i; j++) {
                 System.out.print("*");
             }
             System.out.println("");
         }

     }

     public static void Ters(int a) {
         for (int i = a; i > 0; i--) {
             for (int j = 0; j <= i - 1; j++) {
                 System.out.print(" ");
             }
             for (int k = 0; k < a + 1 - i; k++) {
                 System.out.print("*");
             }
             System.out.println();
         }

     }
     public static void Ardicil(int a, String b) {
         for (int i = 0; i < a; i++) {
             System.out.print(b);
         }
     }
     public static void Altalta(int a, String b) {
         for (int i = 0; i < a; i++) {
             System.out.println(b);
         }

     }
 }
