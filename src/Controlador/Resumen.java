
package Controlador;

import java.io.File;

public class Resumen {
    
    private String titulo;
    private String autores;
    private String resumen;
    private File archivo;
    private TablaHash palabras;
    private int size;

    public Resumen() {
        this.palabras = new TablaHash();
        size = 0;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutores() {
        return autores;
    }

    public String getResumen() {
        return resumen;
    }

    public File getArchivo() {
        return archivo;
    }

    public TablaHash getPalabras() {
        return palabras;
    }

    public int getSize() {
        return size;
    }
    
    //Metodo para llenar mi tabla hash que tiene todas las palabras de mi archivo txt
    public void llenarTabla(){
        
        //Quito los signos del titulo
        String tituloSinSignos = TablaHash.QuitarSignos(this.titulo);
        
        //Hago split en los espacios al titulos
        String[] tit = tituloSinSignos.split(" ");
        
        size += tit.length + 2;
        
        //Recorro el titulo
        for (int i = 0; i < tit.length; i++) {
            
            //Agrego las palabras a mi tabla de palabras
            palabras.agregarClave(new PalabraClave(tit[i]), true, false);
            
        }
        
        //Agrego la palabra autores
        palabras.agregarClave(new PalabraClave("autores"), true, false);
        
        //Quito los signos de los autores
        String autoresSinSignos = TablaHash.QuitarSignos(this.autores);
        
        //Hago split en los espacios a los autores
        String[] aut = autoresSinSignos.split(" ");
        
        size += aut.length;
        
        //Recorro los autores
        for (int i = 0; i < aut.length; i++) {
            
            //Agrego las palabras a mi tabla de palabras
            palabras.agregarClave(new PalabraClave(aut[i]), true, false);
            
        }
        
        //Agrego la palabra resumen
        palabras.agregarClave(new PalabraClave("resumen"), true, false);
        
        //Quito los signos del resumen
        String resumenSinSignos = TablaHash.QuitarSignos(this.resumen);
        
        //Hago split en los espacios al resumen
        String[] res = resumenSinSignos.split(" ");
        
        size += res.length;
        
        //Recorro el resumen
        for (int i = 0; i < res.length; i++) {
            
            //Agrego las palabras a mi tabla de palabras
            palabras.agregarClave(new PalabraClave(res[i]), true, false);
            
        }
        
    }
    
}
