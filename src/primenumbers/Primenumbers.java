/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumbers;


/**
 * @author Olayinka Akeju
 */
public class Primenumbers extends Thread {
    private final int given_number;

    Primenumbers(int n) {
        given_number = n;
    }

    public void MyPrimeNumbers() {
        for (int i = 0; i <= given_number; i++) {
            if (CheckPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean CheckPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 1000000;

        Primenumbers primenumber1 = new Primenumbers(num);
        primenumber1.start();
        Thread.yield();

        primenumber1.MyPrimeNumbers();
    }

}
