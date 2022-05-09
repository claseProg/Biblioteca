/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccions1.pkg1;

import java.util.Scanner;

/**
 *
 * @author a11iagolp
 */
public class Utilidades {
    public static Scanner sc = new Scanner(System.in, "ISO-8859-1");

   

    public static long lerLong() {
        long valor = 0;
        boolean repetir = true;
        
        do {
            if (sc.hasNextLong()) {
                valor = sc.nextLong();
                repetir = false;
            } else {
                System.err.println("ERRO: O dato ten que ser un long. Volve a introducir o nº: ");
            }
            sc.nextLine();
        } while(repetir);
        return valor;
    }

    public static byte lerByte() {
        byte valor = 0;
        boolean repetir = true;
        
        do {
            if (sc.hasNextByte()) {
                valor = sc.nextByte();
                repetir = false;
            } else {
                System.err.println("ERRO: O dato ten que ser un byte. Volve a introducir o nº: ");
            }
            sc.nextLine();
        } while(repetir);
        return valor;
    }
    
    public static int lerInt() {
        int valor = 0;
        boolean repetir = true;
        
        do {
            if (sc.hasNextInt()) {
                valor = sc.nextInt();
                repetir = false;
            } else {
                System.err.println("ERRO: O dato ten que ser un int. Volve a introducir o nº: ");
            }
            sc.nextLine();
        } while(repetir);
        return valor;
    }
    
    public static short lerShort() {
        short valor = 0;
        boolean repetir = true;
        
        do {
            if (sc.hasNextShort()) {
                valor = sc.nextShort();
                repetir = false;
            } else {
                System.err.println("ERRO: O dato ten que ser un short. Volve a introducir o nº: ");
            }
            sc.nextLine();
        } while(repetir);
        return valor;
    }

    public static float lerFloat() {
        float valor = 0;
        boolean repetir = true;
        
        do {
            if (sc.hasNextFloat()) {
                valor = sc.nextFloat();
                repetir = false;
            } else {
                System.err.println("ERRO: O dato ten que ser un float. Volve a introducir o nº: ");
            }
            sc.nextLine();
        } while(repetir);
        return valor;
    }

    public static double lerDouble() {
        double valor = 0;
        boolean repetir = true;
        
        do {
            if (sc.hasNextDouble()) {
                valor = sc.nextDouble();
                repetir = false;
            } else {
                System.err.println("ERRO: O dato ten que ser un double. Volve a introducir o nº: ");
            }
            sc.nextLine();
        } while(repetir);
        return valor;
    }
    
    public static String lerString() {
        String valor = "";
        
        do {
            valor = sc.nextLine();
        }while(valor.isEmpty());
        return valor;
    }
    
    public static char lerChar() {
        String valor = "";
        
        do {
            valor = sc.nextLine();
        }while(valor.isEmpty());
        return valor.charAt(0);
    }

    public static String lerIBAN() {

        String iban = "";        
        boolean  correct;

        do {
            
            correct = true;
            iban = sc.nextLine();

            if (iban.length() == 24) {

                byte i = 0;

                while (correct && i < 2) {

                    if (!Character.isLetter(iban.charAt(i))) {

                        correct = false;
                        
                        
                    }

                    i++;

                }

                while (correct && i < iban.length()) {

                    if (!Character.isDigit(iban.charAt(i))) {

                        correct = false;
                        

                    }

                    i++;
                    
                }
            
            } else {

                correct = false;
                System.out.println("Introduza un dato correcto");

            }

        } while (iban.isEmpty() || !correct);

        return iban;

    }
}


