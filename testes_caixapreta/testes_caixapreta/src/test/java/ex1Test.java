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
public class ex1Test {
    
    public ex1Test() {
    }

    ex1 ano = new ex1();
            
    @org.junit.jupiter.api.Test
    public void testDataInvalida() {
        assertEquals("Data Inválida", ano.classAno(1800));
        assertEquals("Data Inválida", ano.classAno(1899));
        assertEquals("Data Inválida", ano.classAno(2023));
        assertEquals("Data Inválida", ano.classAno(2030));
    }
    @org.junit.jupiter.api.Test
    public void testDataValida() {
        assertEquals("Data Válida", ano.classAno(2000));
        assertEquals("Data Válida", ano.classAno(1900));
        assertEquals("Data Válida", ano.classAno(1901));
        assertEquals("Data Válida", ano.classAno(2021));
        assertEquals("Data Válida", ano.classAno(2022));
    }
}
