package main.java.com.whizpath.prime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Primality {
    public List<Integer> getAllFactors(int n){
        List<Integer> list=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(n%i==0) list.add(i);
        }
        return list;
    }

    public boolean isPrime(int n){
        if(n==1) return false;
        for(int i=2;i*i<=n;i++){
            if( n%i==0){
                return false;
            }
        }
        return  true;
    }

    public boolean checkPrime(int n){
        if(n==1) return false;
        for(int i=2;i<n;i++){
            if( n%i == 0){
                return false;
            }
        }
        return  true;
    }

    public List<Integer> sieveOfEratoshenes(int n){
        List<Integer> listOfPrime=new ArrayList<>();
        int[] arr=new int[n+1];
        for(int i=2;i<=n;i++){
            if(arr[i]==0) {
                listOfPrime.add(i);
                for(int x=i+i;x<=n;x=x+i) arr[x]=i;
            }
        }
        return listOfPrime;
    }

    public static void main(String[] args) {
        Primality primality=new Primality();
        System.out.println(primality.getAllFactors(72));
        System.out.println(primality.sieveOfEratoshenes(3));
        System.out.println(primality.checkPrime(1));
        System.out.println(primality.checkPrime(2));
        System.out.println(primality.checkPrime(12));
        System.out.println(primality.checkPrime(13));
        System.out.println(primality.checkPrime(72));
    }
}
