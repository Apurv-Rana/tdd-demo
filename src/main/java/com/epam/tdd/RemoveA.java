/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.tdd;

/**
 *
 * @author apurv
 */
public class RemoveA {
    public String removeA(String s )
    {
     int len =s.length();
     
     
     if(s.equals(""))
         return "";
     String pilot="";
     for(int i=0; i<len ;i++)
     {
         if(!(s.charAt(i) == 'A' && i<=1))
         {
             pilot = pilot + s.charAt(i);
         }
      }
     
     return pilot ;
    }
}
