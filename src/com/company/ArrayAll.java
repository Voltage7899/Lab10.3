package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAll<T>    {
private ArrayList<T>list=new ArrayList<T>();


   ArrayAll(T[] array)
   {
        list =new ArrayList<>(Arrays.asList(array));
        print(list);


   }
   void print (Object  o)
   {
       for(int i=0;i<list.size();i++)
       {
           System.out.println(list.get(i));
       }
   }


}
