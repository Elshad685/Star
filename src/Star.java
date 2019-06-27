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
         System.out.println("Ədədi daxil edin :");
         Scanner scan=new Scanner(System.in);
         int a=scan.nextInt();
         for (int i = 1; i <=a; i++) {
             for (int j = 0; j < i; j++) {
                 System.out.print("*");

             }
             System.out.println("");
         }


     }

 }
