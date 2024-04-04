
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author brayan sanchez
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean x = true;
        while (x) {            
            
        }
        String menu = JOptionPane.showInputDialog("*****COMPETENCIA***** \n"
                                                + "1. Registrar Atleta \n"
                                                + "2. Datos del campeon \n"
                                                + "3. Atleta por pais \n"
                                                + "4. Tiempo promedio de todos los Atletas \n"
                                                + "5. salir");
        int menuStri=Integer.parseInt(menu);
        switch (menuStri){
            case 1: 
          String nombreAtleta = JOptionPane.showInputDialog("ingresar nombre");   
          break;
           case 2: 
              String nombrecampeon = JOptionPane.showInputDialog("ingresar nombre");   
               String nacionalidad = JOptionPane.showInputDialog("ingresar nacionalidad"); 
                String tiempo = JOptionPane.showInputDialog("ingresar tiempo"); 
              break;
           case 3:
               break;
           case 4:
               break;
           case 5:
               x = false;
               break;
           default:
               System.out.println("Opcion no validad");
               break;
        }
       
                
    }
    
}

