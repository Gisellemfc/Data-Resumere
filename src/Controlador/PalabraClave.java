
package Controlador;

import java.util.ArrayList;
public class PalabraClave {
    
    private String palabraClave;
    private ArrayList<Resumen> resumenesConLaPalabra;
    private int frecuencia;

    public PalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
        this.resumenesConLaPalabra = new ArrayList();
        this.frecuencia = 1;
    }

    public String getPalabraClave() {
        return palabraClave;
    }

    public void setPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    public ArrayList getResumenesConLaPalabra() {
        return resumenesConLaPalabra;
    }

    public void setResumenesConLaPalabra(ArrayList resumenesConLaPalabra) {
        this.resumenesConLaPalabra = resumenesConLaPalabra;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }
    
    public void aumentarFrecuencia(){
        this.frecuencia++;
    }
}
