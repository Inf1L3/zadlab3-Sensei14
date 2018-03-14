/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

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
        
// String s1 = new String( "Happy " );
//      String s2 = new String( "Birthday" );
//
//      System.out.printf( "s1 = %s\ns2 = %s\n\n",s1, s2 );
//      System.out.printf( 
//         "Result of s1.concat( s2 ) = %s\n", s1.concat( s2 ) );
//      System.out.printf( "s1 after concatenation = %s\n", s1 );
        
Scanner sc = new Scanner(System.in);
//System.out.print("Podaj liczbę: " ); 
//// pobieramy od użytkownika liczbę
//int liczba = sc.nextInt(); 
//// wyświetlamy na ekranie obliczoną silnię
//System.out.println(liczba + "! = " + silnia(liczba));


            int n;
            System.out.println("Podaj jaka silnie chcesz obliczyc: ");
            n = sc.nextInt();
           

            System.out.println(n+"! = "+ silniaiter(n));


    }
    
  
    public static int silnia(int wartosc) {
// jeśli przekazany parametr jest równy zero to zwróć 1
// a w przeciwnym wypadku zwróć wartość parametru * wywołanie metody silnia
// z parametrem o jeden mniejszym
if(wartosc == 0) return 1;
else return wartosc * silnia(wartosc - 1);
}
    
    public static int silniaiter(int n)
    {
        int silnia = 1;
            for(int i=1; i<=n; i++)
            {
                silnia*=i;
            }
            
            return silnia;
    }
    
}
