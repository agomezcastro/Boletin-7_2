

package boletin72;

/**
 *
 * @author agomezcastro
 */
public class Boletin72 {

   
    public static void main(String[] args) {
        short num1, num2;
        Calcular obx= new Calcular();
        num1= obx.pedirNumEnteiro();
        num2= obx.pedirNumEnteiro();
        obx.calcular(num1, num2);
        
    }
    
}
