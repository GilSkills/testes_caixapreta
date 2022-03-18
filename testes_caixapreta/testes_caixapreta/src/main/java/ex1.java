/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferna
 */
public class ex1 {
    public String classAno(int ano){
        
        String cano;
        if (ano<1900 || ano>2022)
            cano = "Data Inválida";
        else
            cano = "Data Válida";
        return cano;
        
    }
}
