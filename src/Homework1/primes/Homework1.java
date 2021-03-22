package Homework1.primes;


import java.util.ArrayList;

public class Homework1 {

    public static void main(String[] args) {


        ArrayList<Integer> mirrorPrimes = getMirrorPrimes(0,1000);
        ArrayList<Integer> primes = getPrimes(0,1000);
        for (int item : primes){
            System.out.print(item + " ");
        }
        System.out.println("\nPrimes^^^ ");
        for (int item : mirrorPrimes){
            System.out.print(item + " ");
        }
        System.out.println("\nPalindrromic primes^^^");
    }

    private  static ArrayList<Integer> getPrimes(int min, int max) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = min; i <= max; i++) {
            double limit = Math.sqrt(i) + 1;
            boolean isPrime = true;
            for (int j = 2; j < limit; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if(isPrime)
            result.add(i);
        }
        return result;
    }
    private  static ArrayList<Integer> getMirrorPrimes(int min, int max) {
        ArrayList<Integer> result = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for (int i : getPrimes(min,max)) {
            boolean ispalindrome = String.valueOf(i).equals(new StringBuilder(String.valueOf(i)).reverse().toString());

            if(ispalindrome){
                result.add(i);
            }
        }
        return result;
    }
}



