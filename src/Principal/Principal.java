
package Principal;

import Controlador.TablaHash;
import Vista.Inicio;
import Vista.Panel;
import java.util.ArrayList;

public class Principal {
    
    
    public static void main(String[] args) {
        
        TablaHash tablaResumenes= new TablaHash();
        TablaHash tablaPalabras = new TablaHash();
        ArrayList<String> archivero = new ArrayList<>();
        ArrayList<String> palabrero = new ArrayList<>();
        
        Panel panel = new Panel(tablaResumenes, tablaPalabras, archivero, palabrero);
        
        Inicio inicio = new Inicio(panel);//Crear ventana de inicio
        inicio.setVisible(true);//Hcer visible la ventana de inicio del programa
    }
}
