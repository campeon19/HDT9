/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class SplayTreeTest {
    
   /**
     * Test of contains method, of class SplayTree.
     */
    @Test
    public void testContains() {
        SplayTree<String,String> instance = new SplayTree();
        instance.put("mom", "madre");
        instance.put("Big", "grande");
        instance.put("child", "niño");
        boolean result=instance.contains("mom");
        boolean expResult=true;
        assertEquals(expResult,result);
    }

    /**
     * Test of get method, of class SplayTree.
     */
    @Test
    public void testGet() {
        SplayTree<String,String> instance = new SplayTree();
        instance.put("garden", "jardin");
        instance.put("boy", "niño");
        instance.put("childhood", "niñez");
        instance.put("fan", "ventilador");
        instance.put("trashcan", "basurero");
        instance.put("car", "carro");
        String result=instance.get("car");
        String expResult="carro";
        assertEquals(expResult,result);
    }

    /**
     * Test of put method, of class SplayTree.
     */
    @Test
    public void testPut() {
        SplayTree<String,String> instance = new SplayTree();
        instance.put("the", "el");
        instance.put("lake", "lago");
        instance.put("river", "rio");
        instance.put("father", "padre");
        instance.put("homework", "tarea");
        int result=instance.size();
        int expResult=5;
        assertEquals(expResult,result);
    }
    @Test
    public void testSize() {
        SplayTree instance = new SplayTree();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }
}
