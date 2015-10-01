package com.clouway.task2;

public class MyMath {
    int gcd(int x, int y){
        if(y == 0) return x;
        else return gcd(y, x % y);
        }


    // NOK begin

    int nok(int a, int b) {
        int lcm=1;
        for(int i=a;i<=a*b;i++)
        {
            if(i%a==0 && i%b==0)
            {
                lcm=i;
                break;
            }
        }
        return lcm;
    }
}