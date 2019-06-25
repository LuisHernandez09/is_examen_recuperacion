/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.is.examenfinal.pascal.triangle;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luis
 */
public class PascalTriangleTest {
    
    public PascalTriangleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of build method, of class PascalTriangle.
     */
   @Test
    public void Prueba1() {
        System.out.println("letras no admitidas");
        PascalTriangle ejecucion = new PascalTriangle();
        

        String numbers = "luis";
        String expectResult = "letras no admitidas";
        String Resulta = ejecucion.build(numbers);
        assertEquals(expectResult, Resulta);
    }
    
    @Test
    public void Prueba2() {
        System.out.println("numero menor a 0");
        PascalTriangle instance = new PascalTriangle();
        
        int numbers = -5;
        String expectResult= Arrays.toString(new long[0]);
        String Resulta = instance.build(numbers);
        assertEquals(expectResult, Resulta);
    }
    
    
    @Test
    public void Prueba3() {
        System.out.println("numero minimo");
        PascalTriangle instance = new PascalTriangle();
        
        int numbers = Integer.MIN_VALUE;
        String expectResult= "[]";
        String Resulta = instance.build(numbers);
        assertEquals(expectResult, Resulta);
    }
 @Test
    public void Prueba4() {
        System.out.println("numero maximo");
        PascalTriangle instance = new PascalTriangle();
        
        int numbers = Integer.MAX_VALUE+1;
        String expectResult= "[]";
        String Resulta = instance.build(numbers);
        assertEquals(expectResult, Resulta);
}
     @Test
    public void Prueba5() {
        System.out.println("numero 0");
        PascalTriangle instance = new PascalTriangle();
        
        int numbers= 0;
        String expectResult = "[]";
        String Resulta = instance.build(numbers);
        assertEquals(expectResult, Resulta);

}
}
