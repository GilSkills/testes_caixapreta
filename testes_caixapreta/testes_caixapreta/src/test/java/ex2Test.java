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
public class ex2Test {
    
   ex2 objnota = new ex2();
    public ex2Test() {
    }

    @Test
    public void testNotaValida() {
       assertEquals("Nota Válida", objnota.classNota(5));
       assertEquals("Nota Válida", objnota.classNota(0));
       assertEquals("Nota Válida", objnota.classNota(1));
       assertEquals("Nota Válida", objnota.classNota(9));
       assertEquals("Nota Válida", objnota.classNota(10));
    }
    @Test
    public void testNotaInvalida() {
       assertEquals("Nota Inválida", objnota.classNota(-3));
       assertEquals("Nota Inválida", objnota.classNota(-1));
       assertEquals("Nota Inválida", objnota.classNota(11));
       assertEquals("Nota Inválida", objnota.classNota(20));
    }
    
}
