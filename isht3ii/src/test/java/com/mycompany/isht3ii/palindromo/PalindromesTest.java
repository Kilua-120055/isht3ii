/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.isht3ii.palindromo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author killua
 */
public class PalindromesTest {
    

    @Test
    public void testEvaluate() {
        System.out.println("cadena vacia");
        String word = "  ";
        Palindromes instance = new Palindromes();
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result);

    }
    
     @Test
    public void testEvaluate2() {
        System.out.println("cadena correcta impar");
        String word = "ana";
        Palindromes instance = new Palindromes();
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result);

    }
    
    
     @Test
    public void testEvaluate3() {
        System.out.println("cadena incorrecta par");
        String word = "rana";
        Palindromes instance = new Palindromes();
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertNotEquals(expResult, result);

    }

    @Test
    public void testEvaluate4() {
        System.out.println("cadena correcta impar con saltos de linea");
        String word = "\n ana \n";
        Palindromes instance = new Palindromes();
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testEvaluate5() {
        System.out.println("cadena correcta impar con tabuladores");
        String word = "\t oro \t";
        Palindromes instance = new Palindromes();
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result);

    }   
    
        @Test
    public void testEvaluate6() {
        System.out.println("cadena correcta impar con espacios para verificacion si los espacios importan");
        String word = "\n Ligar es ser ágil \n";
        Palindromes instance = new Palindromes();
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertNotEquals(expResult, result);

    }
    
        @Test
    public void testEvaluate7() {
        System.out.println("prueba con mayusculas");
        String word = "Reconocer";
        String word1 = "reconocer";
        Palindromes instance = new Palindromes();
        boolean expResult = true;
        boolean expResult1 = false;
        boolean result = instance.evaluate(word);
        assertNotEquals(expResult, result);
        assertEquals(expResult1, result);

    }    
        @Test
    public void testEvaluate8() {
        System.out.println("prueba unica de un solo caracter");
        String word = "$";
        String word1 = "s";
        Palindromes instance = new Palindromes();
        boolean expResult = true;
        boolean expResult1 = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result);
        assertEquals(expResult1, result);

    } 
    
    
}
