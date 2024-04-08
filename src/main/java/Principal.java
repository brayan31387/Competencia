
import java.util.ArrayList;
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
        ArrayList<Atleta> listacampeon = new ArrayList<>();
        ArrayList<Atleta> listaAtleta = new ArrayList<>();
        boolean x = true;

        while (x) {

        }
        String menu = JOptionPane.showInputDialog(null, "*****COMPETENCIA***** \n"
                + "1. Registrar Atleta \n"
                + "2. Datos del campeon \n"
                + "3. Atleta por pais \n"
                + "4. Tiempo promedio de todos los Atletas \n"
                + "5. Mostrar el registro"
                + "6.salir");
        int menuStri = Integer.parseInt(menu);
        switch (menuStri) {
            case 1:
                String nombreAtleta = JOptionPane.showInputDialog("ingresar nombre");
                break;
            case 2:
                String nombrecampeon = JOptionPane.showInputDialog("ingresar nombre");
                String nacionalidad = JOptionPane.showInputDialog("ingresar nacionalidad");
                String tiempocampeon = JOptionPane.showInputDialog("ingresar tiempo");
                double tiempocampeon2 = Double.parseDouble(tiempocampeon);

                Atleta objcampeon = new Atleta(menu, nacionalidad, tiempocampeon2);
                listacampeon.add(objcampeon);
                break;
            case 3:
                if (listaAtleta.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "no hay atletas registrado", "Aviso", 1);
                } else {
                    String nombrepais = JOptionPane.showInputDialog("ingresar nombre del pais");
                    for (int i = 0; i < listaAtleta.size(); i++) {
                        if (listaAtleta.get(i).getNacionalidad().equalsIgnoreCase(nombrepais)) {
                            JOptionPane.showMessageDialog(null, "los atletas del pais" + nombrepais + "\n"
                                    + "\n" + "Nombre: " + listaAtleta.get(i).getNombre()
                                    + "\n" + "Nacionalidad: " + listaAtleta.get(i).getNacionalidad()
                                    + "\n" + "Tiempo: " + listaAtleta.get(i).getTiempo()
                            );
                        }
                    }
                }

                break;

            case 4:
                if (listaAtleta.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "no hay atletas registrado", "aviso", 2);
                } else {
                    double suma = 0;
                    double promedio = 0;
                    for (int i = 0; i < listaAtleta.size(); i++) {
                        suma += listaAtleta.get(i).getTiempo();
                    }
                    promedio = suma / listaAtleta.size();
                    JOptionPane.showMessageDialog(null, "el promedio de los atletas en segundo es" + promedio + "segundos", "aviso", 3);

                }
                break;

            case 5:

                if (listaAtleta.isEmpty() && listacampeon.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "no hay atletas registrados", "aviso", 4);
                } else {
                    for (int i = 0; i < listaAtleta.size(); i++) {
                        JOptionPane.showMessageDialog(null, "imformacion de los atletas:, \n"
                                + "nombre: " + listacampeon.get(i).getNombre() + "\n"
                                + "Nacionalidad: " + listacampeon.get(i).getTiempo() + "\n"
                                + " Tiempo: " + listacampeon.get(i).getTiempo() + "\n"
                                + "Imformacion de los Atletas: \n"
                                + "Nombre: " + listacampeon.get(i).getNombre() + "\n"
                                + "Nacionalidad: " + listaAtleta.get(i).getNacionalidad() + "\n"
                                + "Tiempo: " + listaAtleta.get(i).getTiempo() + "\n");

                    }
                }

                break;
           

            case 6:
                break;
        }
    }
}
