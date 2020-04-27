/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class RBTTest {
    
    
    @Test
    public void testSize() {
        RBT instance = new RBT();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class RBT.
     */
    @Test
    public void testIsEmpty() {
        RBT instance = new RBT();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class RBT.
     */
    @Test
    public void testGet() {
        RBT<String,String> instance = new RBT();
        instance.put("garden", "jardin");
        instance.put("boy", "niño");
        instance.put("childhood", "niñez");
        String result=instance.get("boy");
        String expResult="niño";
        assertEquals(expResult,result);
    }

    /**
     * Test of contains method, of class RBT.
     */
    @Test
    public void testContains() {
        RBT<String,String> instance = new RBT();
        instance.put("mom", "madre");
        instance.put("Big", "grande");
        instance.put("child", "niño");
        boolean result=instance.contains("young");
        boolean expResult=false;
        assertEquals(expResult,result);
    }

    /**
     * Test of put method, of class RBT.
     */
    @Test
    public void testPut() {
        RBT<String,String> instance = new RBT();
        instance.put("the", "el");
        instance.put("lake", "lago");
        instance.put("river", "rio");
        int result=instance.size();
        int expResult=3;
        assertEquals(expResult,result);
    }
  
}
