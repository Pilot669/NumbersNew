package com.company;

/*даны два числа, вернуть их сумму.
Но если эти числа равны, то вернуть удвоенную сумму*/
public class SumDouble{
    public int sumDouble(int a, int b){

        int sum = (a + b);
        if (a == b){
            return sum * 2;
        }
        else{
            return sum;
        }
    }
}
