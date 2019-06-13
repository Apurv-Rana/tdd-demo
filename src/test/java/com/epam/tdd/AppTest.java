package com.epam.tdd;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;
import org.junit.Test;

/**
     * 1.Empty String 
     * 2.SINGLE CHARACTER
     * 3.DOUBLE CHARACTER 
     * 4. N CHARACTER 
     */
public class AppTest 
{
    
    
    @Test
    public void removeEmpty()
    {
        RemoveA first =new RemoveA();
        
        String test = first.removeA("");
        assertEquals( "",test);
    }
    @Test
    public void removeSingle()
    {
        RemoveA first =new RemoveA();
        
        String test = first.removeA("A");
        assertEquals( "",test);
    }
  
    @Test
    public void removeSingleB()
    {
        RemoveA first =new RemoveA();
        
        String test = first.removeA("B");
        assertEquals( "B",test);
    }
    
      @Test
    public void removeDual()
    {
        RemoveA first =new RemoveA();
        
        String test = first.removeA("BA");
        assertEquals( "B",test);
    }
    
      @Test
    public void removeN()
    {
        RemoveA first =new RemoveA();
        
        String test = first.removeA("AABAA");
        assertEquals( "BAA",test);
    }
}
