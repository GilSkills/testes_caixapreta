/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ferna
 */
public class ex3Test {
    
    ex3 ida = new ex3();
    public ex3Test() {
    }

    @Test
    public void testCada10anos() {
       assertEquals("renovação a cada 10 anos", ida.classIda(49));
       assertEquals("renovação a cada 10 anos", ida.classIda(40));
    }
    @Test
    public void testCada5anos() {
       assertEquals("renovação a cada 5 anos", ida.classIda(50));
       assertEquals("renovação a cada 5 anos", ida.classIda(51));
       assertEquals("renovação a cada 5 anos", ida.classIda(69));
       assertEquals("renovação a cada 5 anos", ida.classIda(60));
    }
    @Test
    public void testCada3anos() {
       assertEquals("renovação a cada 3 anos", ida.classIda(70));
       assertEquals("renovação a cada 3 anos", ida.classIda(71));
       assertEquals("renovação a cada 3 anos", ida.classIda(80));
    }

}
