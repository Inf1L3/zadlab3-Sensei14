/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Asia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
        Scanner sc = new Scanner(System.in);
        
        //Zadanie 1.4
        
//        int a=5;
//        System.out.println("Wartość początkowa: "+a);
//        a = a>>1;
//        System.out.println("Przesunięcie w prawo o 1: "+a); a=5;
//        a = a<<1;
//        System.out.println("Przesunięcie w lewo o 1: "+a); a=5;
//        a = a>>>1;
//        System.out.println("Przesunięcie w prawo bez znaku o 1: "+a); a=5;

        //Zadanie 1.7
        
//        boolean x,y,z;
//        x=false;
//        y=true;
//        z = x^y;
//        System.out.println(x+" XOR "+y+" = "+ z);
//        System.out.println("NOT "+z+" = "+!z);


        //Zadanie 2.2
        
        String s1 = "Example";
        String s2 = "       Ala  ma   kota      ";

        // Konwersja String do tablicy znaków typu char
//    char[] c1;
//    c1 = s1.toCharArray();
//         for (int i = 0; i < 7; i++) {
//            System.out.println(c1[i]);
//           
//        }
        //Koduje String w sekwencje bitów, przechowując rezultaty w tablicy
//        byte[] b1;
//        b1 = s1.getBytes();
//        
//        for (int i = 0; i < b1.length; i++) {
//            System.out.println(b1[i]);
//           
//        }
        // Porównuje dwa teksty
//        boolean e = s1.equals(s2);
//        if(e)
//        {
//            System.out.println("Teksty są takie same");
//        }
//        else
//            System.out.println("Teksty są różne");
        //Porównuje dwa teksty ignorując wielkość znaków
//        boolean e2 = s1.equalsIgnoreCase(s2);
//       if(e2)
//        {
//            System.out.println("Teksty są takie same");
//        }
//        else
//            System.out.println("Teksty są różne");
//        //porównuje leksykograficznie dwa stringi
//        int ct = s1.compareTo(s2);
//        //porównuje leksykograficznie dwa stringi ignorując wielkość znaków
//        int ct2 = s1.compareToIgnoreCase(s2);
        // Sprawdza w którym miejscu znajduje się podany znak i podaje pierwszy napotkany index
//        int in = s1.indexOf('x');
//        System.out.println(in);
        // Sprawdza w którym miejscu znajduje się podany tekst i podaje pierwszy napotkany index
//        int iof = s2.indexOf("kota");
//        System.out.println(iof);
        // Sprawdza w którym miejscu znajduje się podany znak i podaje ostatni napotkany index
        //        int in1 = s1.lastIndexOf('x');
        //        System.out.println(in);
        // Sprawdza w którym miejscu znajduje się podany tekst i podaje ostatni napotkany index
        //        int iof1 = s2.lastIndexOf("kota");
        //        System.out.println(iof);
        //Zwraca podciąg, zaczynający się od indexu który podamy w metodzie
//        String sub1 = s1.substring(3);
//        System.out.println(sub1);
        //Zwraca podciąg, zaczynający się od indexu i kończący na indexie który podamy w metodzie
//        String sub2 = s1.substring(2,5);
//        System.out.println(sub2);
        //Zmienia oryginalny znak tekstu, który podamy na inny znak, który również podajemy
//        String rep = s1.replace('x', 't');
//        System.out.println(rep);
        //Zwraca tekst bez biaych znaków na końcu i początku
//        String tr = s2.trim();
//        System.out.println(tr);
//        String lc = s1.toLowerCase(); //Zmienia wszystkie znaki na małe
//        String uc = s1.toUpperCase(); //Zmienia wszystkie znaki na duże
//        System.out.println(lc + uc);
        //Rozdziela tekst po wyrażeniu jakie wpiszemy do metody
//        String[] sp = s2.split("ma");
//        System.out.println(Arrays.toString(sp));
//        
//        //Rozdziela tekst po wyrażeniu jakie wpiszemy do metody, można ustawić limit ilości rozdzieleń
//        String[] sp2 = s2.split("ma", 1);
//        System.out.println(Arrays.toString(sp2));


        //Zadanie 3.3
        
//        int n,p;
//        System.out.println("Jaką liczbę podnieść do potęgi: ");
//        n=sc.nextInt();
//        System.out.println("Do jakiej potęgi: ");
//        p=sc.nextInt();
        //rekurencja
//        System.out.println(n+"^"+p+" = " + potegar(n, p));
        //iteracja
//        System.out.println(n+"^"+p+" = " + potegai(n, p));


        //Zadanie 3.4
        
//        System.out.println("Podaj wyraz ciągu Fibonacciego: ");
//        int k; k= sc.nextInt();
//        System.out.println(fib(k));




 // Część laboratoryjna
// String s1 = new String( "Happy " );
//      String s2 = new String( "Birthday" );
//
//      System.out.printf( "s1 = %s\ns2 = %s\n\n",s1, s2 );
//      System.out.printf( 
//         "Result of s1.concat( s2 ) = %s\n", s1.concat( s2 ) );
//      System.out.printf( "s1 after concatenation = %s\n", s1 );
//System.out.print("Podaj liczbę: " ); 
//// pobieramy od użytkownika liczbę
//int liczba = sc.nextInt(); 
//// wyświetlamy na ekranie obliczoną silnię
//System.out.println(liczba + "! = " + silnia(liczba));
//            int n;
//            System.out.println("Podaj jaka silnie chcesz obliczyc: ");
//            n = sc.nextInt();
//           
//
//            System.out.println(n+"! = "+ silniaiter(n));
    }

    public static int potegar(int n, int p) {
        if (p == 0) {
            return 1;
        } else if (p == 1) {
            return n;
        } else {
            return n * potegar(n, p - 1);
        }

    }

    public static int potegai(int n, int p) {
        if (p == 0) {
            return 1;
        }
        int w = 1;
        for (int i = 1; i <= p; i++) {
            w *= n;
        }
        return w;
    }

    public static int fib(int k) {
        if (k == 0) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }

        return fib(k - 1) + fib(k - 2);

    }

}
