/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author Intan Okta
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int umur;
        boolean cantik;
        
        System.out.println("Dian Akhmad Ramadhani");
        System.out.print("Masukkan Umur = ");
        umur = keyboard.nextInt();
        System.out.println("Cantik ? True or False");
        cantik = keyboard.nextBoolean();

        if (umur > 23 && cantik == true) {
            System.out.println("Nikah yuk....");

        } else if (umur > 23) {
            System.out.println("Mikir dulu ya...");

        } else {
            System.out.println("Maaf ya...");
        }
    }
}
