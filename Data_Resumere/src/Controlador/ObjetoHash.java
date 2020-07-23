
package Controlador;

public class ObjetoHash{
    
    private final int clave;
    private Object valor;
    private ObjetoHash siguiente;
    private final int codigoHash;

    public ObjetoHash(int clave, Object valor, ObjetoHash siguiente, int codigoHash) {
        this.clave = clave; //Numero que genera la suma de los caracteres de la palabra
        this.valor = valor; // Objeto que está almacenado en la tabla
        this.siguiente = siguiente; //Apuntador al siguiente si hay colision
        this.codigoHash = codigoHash; //Codigo hash generado a partir de la clave
    }
    
    public int getClave() {
        return clave;
    }

    public Object getValor() {
        return valor;
    }

    public ObjetoHash getSiguiente() {
        return siguiente;
    }

    public int getCodigoHash() {
        return codigoHash;
    }

    public void setSiguiente(ObjetoHash siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
