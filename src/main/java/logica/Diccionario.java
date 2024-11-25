package logica;
import igu.Pantalla;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Melqui Erazo
 * 
 */
public class Diccionario extends javax.swing.JFrame {

    public static void main(String[] args) {
        //String[][] matrizTraducciones = leerArchivoAMatriz("src/main/resources/traducciones.txt");
        Pantalla pantalla = new Pantalla();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        pantalla.ocultarLabel();
        // Solo para verificar la carga de la matriz
        //for (String[] fila : matrizTraducciones) {
         //   System.out.println(fila[0] + " -> " + fila[1]);
        //}
    }
    /* public static String[][] leerArchivoAMatriz(String rutaArchivo) {
        ArrayList<String[]> listaTemporal = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir cada línea por la coma
                String[] traduccion = linea.split(",");
                listaTemporal.add(traduccion);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convertir la lista en una matriz
        String[][] matriz = new String[listaTemporal.size()][3];
        return listaTemporal.toArray(matriz);
    } */
}
