import javax.swing.JOptionPane;

public class numeroAsteriscos {
    public static void main(String[] args) {
        
       JOptionPane.showMessageDialog(null,"Bienvenido al programa. ");
        
        for (int n = 0; n < 10; n++) {
            
            String input = JOptionPane.showInputDialog("Ingresa un número: " + (n + 1) + ":");
            int numero = Integer.parseInt(input); 
            
            if (numero % 2 == 0) {
                int cociente = numero / 2; 
                
                StringBuilder asteriscos = new StringBuilder();
                for (int j = 0; j < cociente; j++) {
                    asteriscos.append("*");
                }
                JOptionPane.showMessageDialog(null,"el numero es impar. \n " + asteriscos.toString());
            } else {

                JOptionPane.showMessageDialog(null, "El número es impar.");
            }
        }
    }
}
