/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin72;

import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class Calcular {
    public short pedirNumEnteiro(){
        short num;
        String res= JOptionPane.showInputDialog("teclea un num:");
        num= Short.parseShort(res);
        return num;
    }
    
    public void calcular(short num1, short num2){
        if (num1>=num2)
            System.out.println("num1-num2= "+ (num1-num2));
        else if(num1<num2)
            System.out.println("num1+num2= "+ (num1+num2));
    }
}
