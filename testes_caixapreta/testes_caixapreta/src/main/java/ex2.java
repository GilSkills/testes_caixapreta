/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferna
 */
public class ex2 {
    public String classNota(float nota){
        String classi;
        if (nota<0 || nota>10)
            classi = "Nota Inválida";
        else
            classi= "Nota Válida";
        return classi;
    }
}
