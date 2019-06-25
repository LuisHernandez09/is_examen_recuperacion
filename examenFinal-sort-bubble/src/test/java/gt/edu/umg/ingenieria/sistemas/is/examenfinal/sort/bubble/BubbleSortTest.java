/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.is.examenfinal.sort.bubble;

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
public class BubbleSortTest {
    
    public BubbleSortTest() {
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
     * Test of sortBasic method, of class BubbleSort.
     */
    @Test
    public void Prueba1() {
        System.out.println("envio null y recibo null");
        int[] numbers = null;
        int[] expectResult = null;
        int[] Resulta = BubbleSort.sortBasic(numbers);
        assertArrayEquals(expectResult, Resulta);
        
    }
     
      @Test
    public void Prueba2() {
         System.out.println("envio 5 y recibo 5");
        int[] input = new int[]{5};
        int[] expectResult = new int[]{5};
        int[] Resulta = BubbleSort.sortBasic(input);
        assertArrayEquals(expectResult, Resulta);
    }
    
 
      @Test
    public void Prueba3() {
        System.out.println("envio numeros iguales y recibo los mismos");
        int[] numbers = {5,5,5};
        int[] expectResult = {5,5,5};
        int[] Resulta = BubbleSort.sortBasic(numbers);
        assertArrayEquals(expectResult, Resulta);
}
        @Test
     public void Prueba4() {
          System.out.println("envio 0 y recibo 0");
         int[] numbers = new int[0];
         int[] expectResult = new int[0];
         int[] Resulta = BubbleSort.sortBasic(numbers);
         assertArrayEquals(expectResult, Resulta);
 }
     @Test
    public void Prueba5() {
         System.out.println("Envio Vacio");
        int[] numbers = new int[]{};
        int[] expectResult = new int[]{};
        int[] Resulta = BubbleSort.sortBasic(numbers);
        assertArrayEquals(expectResult, Resulta);
}
}
