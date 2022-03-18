/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferna
 */
public class ex3 {
      public String classIda(int idad){
        String classi;
        if (idad<50)
            classi = "renovação a cada 10 anos";
        else if(idad>=50 && idad<70){
            classi= "renovação a cada 5 anos";
        }
        else
            classi = "renovação a cada 3 anos";

        return classi;
            
    }
}
