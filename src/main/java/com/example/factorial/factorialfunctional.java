package com.example.factorial;

import java.util.ArrayList;

public class factorialfunctional {

    public static long Fact(long n)
    {
        if(n<0)
        {
            throw new IllegalArgumentException("WRONG ARGUMENT");
        }
        long result=1;
        for(int i=1; i<=n; i++)
        {
            result*=i;
        }
        return result;
    }
    public static ArrayList<Long> FactsTillN(long n)
    {
        if(n<=0)
        {
            throw new IllegalArgumentException("WRONG ARGUMENT");
        }
        ArrayList<Long> result=new ArrayList<>();
        long tmp=1;
        for(int i=1; i<=n; i++)
        {
            tmp*=i;
            result.add(tmp);
        }
        return result;
    }
}
