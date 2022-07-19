package Controlador;

import Vista.Panel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TablaHash<Clave,Valor> {

    //Atributos de la tabla hash
    private ObjetoHash[] tabla;
    int tamaño;
    float factorDeCarga;

    // Constructor de una nueva tabla hash con un tamaño inicial de 11, con un factor de carga de 0.75.
    public TablaHash(){
        
        tabla = new ObjetoHash[5];
        factorDeCarga = 0.75f;
        this.tamaño = 0;
        
    }

    // Constructor de una nueva tabla hash con un tamaño inicial especificado y el factor de carga de 0.75.
    public TablaHash(int tamaño){

        tabla = new ObjetoHash[tamaño];
        factorDeCarga = 0.75f;
        this.tamaño = 0;
        
    }
    
    //Metodo para crear la clave de la palabra dada
    public int crearClave(String palabra){
        
        //Se crea la variable donde se guardará la clave
        int clave = 0;
        
        //Se recorre la palabra
        for (int i = 0; i < palabra.length(); i++) {
            
            //Se va sumando el valor de cada caracter en ASCII
            clave += palabra.charAt(i);
            
        }
        
        //Se retorna la clave
        return clave;
    }
    
    //Metodo para obtener el codigo hash del objeto a partir de su clave
    public int crearCodigoHash(int clave) {
        
        //Se crea la variable hash que aplica la funcion hash de la operación modulo
        int hash = clave % tabla.length;
        
        //Retornar el codigo hash
        return hash;
        
    }
    
    //Metodo para insertarun valor en la tabla hash
    public void insertar(int clave, Object valor, boolean bandera) {
        
        //Se crea el codigo hash para el objeto
        int hash = crearCodigoHash(clave);

        //Agregar el nuevo nodo al inicio de la lista de nodos de la tabla
        ObjetoHash nodo = new ObjetoHash(clave, valor, tabla[hash], hash);
        tabla[hash] = nodo;
        
        //Aumentar el tamaño
        tamaño++;
        
        //Si el tamaño supera la capacidad de carga, se redimensiona la tabla
        if (((float)tamaño / tabla.length) > factorDeCarga) {
            
            redimensionarTabla(tabla.length * 2, bandera);
            
        }
        
    }
    
    //Metodo para validar si ya existe una investigación a partir de su titulo
    public boolean existeInvestigacion(String titulo){
        
        //Se crea la clave para el titulo de la investigación
        int clave = crearClave(titulo);
        //Se crea su codigo hash
        int codigoHash = crearCodigoHash(clave);
        
        //Si la posición de la tabla esta ocupada por alguna investigación
        if(tabla[codigoHash] != null){
            
            //Se toma la investigacion que se encuentra en la primera posicion de la lista de invastigaciones en esa posición de la tabla
            ObjetoHash investigacionActual = tabla[codigoHash];
            Resumen archivoActual = (Resumen) investigacionActual.getValor();
            
            //Se recorre la lista de archivos en esa posicion 
            while(investigacionActual != null){
                
                //Si el titulo del archivo actual es igual al titulo ingresado
                if(archivoActual.getTitulo().equalsIgnoreCase(titulo)){
                    
                    //Devolver true porque ya existe
                    return true;
                
                }
                
                //Se pasa la investigacion y el archivo al siguiente de la lista
                investigacionActual = investigacionActual.getSiguiente();
                
                if(investigacionActual!= null){
                    
                    archivoActual = (Resumen) investigacionActual.getValor();
                    
                }
                
            }
            
        }
        
        //Si no se encuentra nada entoces devuelve falso porque el archivo no existe
        return false;
    }
    
    //Metodo para redimensionar la tabla hash si esta cerca de su capacidad maxima
    public void redimensionarTabla(int nuevoTamaño, boolean bandera) {
        
        //Creo una nueva tabla hash con el nuevo tamaño
        TablaHash nuevaTabla = new TablaHash(nuevoTamaño);
        
        //Recorro la vieja tabla hash
        for (ObjetoHash nodo : tabla){
            
            for(; nodo != null; nodo = nodo.getSiguiente()){
                
                //Inserto los elementos de la antigua tabla en la nueva tabla
                nuevaTabla.insertar(nodo.getClave(), nodo.getValor(), bandera);
                
                //Eliminar el nodo de la tabla vieja para no desperdiciar memoria
                this.eliminar(nodo.getClave());

            }
        }
        
        //Establezco la nueva tabla
        tabla = nuevaTabla.tabla;
    }
    
    // Metodo para cargar una palabra clave a la tabla hash de palabras claves 
    public void agregarClave(PalabraClave palabra, boolean bandera, boolean flag) {
        
        //Coloco la palabra clave en minuscula
        palabra.setPalabraClave(palabra.getPalabraClave().toLowerCase());
            
        //Creo su clave
        int clave = crearClave(palabra.getPalabraClave());
            
        //Si la palabra no está en la tabla
        if (!existePalabraClave(palabra.getPalabraClave())) { 
            
            
            //Inserto la palabra clave en la tabla
            insertar(clave, palabra, true);

            if(flag){
                
                Panel.palabrero.add(palabra.getPalabraClave());

            }
            
            if(!bandera){
                
                //Mensaje de proceso exitoso
                JOptionPane.showMessageDialog(null, "Palabra clave agregada correctamente.", "PALABRA CLAVE AGREGADA", JOptionPane.INFORMATION_MESSAGE);
            
            }
            
        } else {//si la palabra clave se repite 
            
            if(bandera){
                
                int hash = crearCodigoHash(clave);
                
                //Se recorre la tabla en la posición del codigo hash obtenido
                for (ObjetoHash nodo = tabla[hash]; nodo != null; nodo = nodo.getSiguiente()) {

                    if (clave == (nodo.getClave()) && ((PalabraClave) nodo.getValor()).getPalabraClave().equalsIgnoreCase(palabra.getPalabraClave())) {

                        ((PalabraClave) nodo.getValor()).aumentarFrecuencia();
                        break;

                    }

                }
                
                
            }else{
                
                //Muestro un menseje al usuario indicandole la palabra clave que se repite 
                JOptionPane.showMessageDialog(null, "La palabra clave '" + palabra.getPalabraClave() + "' ya existe", "ERROR PALABRA CLAVE REPETIDA", JOptionPane.ERROR_MESSAGE);
            
            }
            
            
        }
    }
    
    //Metodo para ver si existe una palabra clave
    public boolean existePalabraClave(String palabra){
        
        //Se crea la clave para al palabra clave
        int clave = crearClave(palabra);
        //Se crea su codigo hash
        int codigoHash = crearCodigoHash(clave);
        
        //Si la posición de la tabla esta ocupada por alguna investigación
        if(tabla[codigoHash] != null){
            
            //Se toma la palabra que se encuentra en la primera posicion de la lista de palabras en esa posición de la tabla hash
            ObjetoHash palabraActual = tabla[codigoHash];
            
            //Se recorre la lista de palabras en esa posicion 
            while(palabraActual != null){
                
                //Si la palabra actual es igual a la palabra ingresada
                if(((PalabraClave)palabraActual.getValor()).getPalabraClave().equalsIgnoreCase(palabra)){
                    
                    //Devolver true porque ya existe la palabra
                    return true;
                
                }
                
                //Se pasa la investigacion y el archivo al siguiente de la lista
                palabraActual = palabraActual.getSiguiente();
                
            }
            
        }
        
        //Si no se encuantra nada entoces devuelve falso porque el archivo no existe
        return false;
        
    }
    
    //Metodo para eliminar un elemento de la tabla a partir de su clave
    public void eliminar(int clave) {
        
        //Crear el codigo hash de la clave
        int hash = crearCodigoHash(clave);
        
        //Se crea un objeto hash para guardar el anterior al que se va a eliminar
        ObjetoHash anterior = null;
        
        //Se recorre la lista de elementos
        for (ObjetoHash nodo = tabla[hash]; nodo != null; nodo = nodo.getSiguiente()) {
            
            //Si la el elemento coincide con el que se desea eliminar
            if ((hash == nodo.getCodigoHash()) && clave == nodo.getClave()){
                
                //Si el anterior es null
                if (anterior != null) {
                    
                    //Se salta el apuntador del anterior al siguiente para eliminar el nodo
                    anterior.setSiguiente(nodo.getSiguiente());
                    
                } else {
                    
                    //Si es el primero de la tabla se salta
                    tabla[hash] = nodo.getSiguiente();
                }
                
            }
            
            //Se pone como anterior el actual para seguir el ciclo
            anterior = nodo;
            
        }
        
    }
    
    //Metodo para buscar el valor de una clave en una tabla
    public Object buscarValor(String palabra, boolean bandera){
        
        if(bandera){
            
            palabra = palabra.toUpperCase();
            
        }else{
            
            palabra = palabra.toLowerCase();
        
        }
                
        //Creo la clave para la palabra pasada por parametros        
        int clave = crearClave(palabra);
        
        //Creo el codigo hash para la clave dada
        int hash = crearCodigoHash(clave);

        //Se recorre la tabla en la posición del codigo hash obtenido
        for (ObjetoHash nodo = tabla[hash]; nodo != null; nodo = nodo.getSiguiente()) {
            
            if(bandera){
                
                if (clave == (nodo.getClave()) && palabra.equalsIgnoreCase(((Resumen)nodo.getValor()).getTitulo())) {

                    return nodo.getValor();

                }
                
            }else{
                
                if (clave == (nodo.getClave()) && palabra.equalsIgnoreCase(((PalabraClave)nodo.getValor()).getPalabraClave())) {

                    return nodo.getValor();

                }
                
            }
            
            
            
        }
        
        return null;
    
    }
    
    //Metodo para analizar el resumen
    public String analizarResumen(Resumen resumen){
        
        //String para guardar el resultado
        String resultado = "";
        
        //Se recorre la tabla hash de palabras clave
        for(int i = 0; i< tabla.length; i++){
            
            //Si la posición es distinto de null
            if(tabla[i] != null){
                
                //Se recorre la tabla en la posición del codigo hash obtenido
                for (ObjetoHash nodo = tabla[i]; nodo != null; nodo = nodo.getSiguiente()) {

                    //Se guarda la palabra clave actual
                    String actual = QuitarSignos(((PalabraClave) nodo.getValor()).getPalabraClave());
                    
                    //Se busca en la tabla del resumen la palabra clave
                    PalabraClave analisis = (PalabraClave) resumen.getPalabras().buscarValor(actual, false);
                    
                    //Si la palabra está
                    if(analisis != null){
                          
                        //Se agrega su frecuencia
                        resultado = resultado + "Frecuencia de '" + ((PalabraClave)nodo.getValor()).getPalabraClave() + "': " + analisis.getFrecuencia() + "\n";
                      
                        //Si no está
                    }else{
                         
                        //Su frecuencia es 0
                        resultado = resultado + "Frecuencia de '" + ((PalabraClave)nodo.getValor()).getPalabraClave() + "': 0\n"; 
                     
                    }

                }
                
            }
            
        }
        
        return resultado;
        
    }
    
    public static String QuitarSignos(String palabra){
 
        String nuevaHilera= "";
            
        for(int letras=0; letras<(palabra.length()); letras++){

            char letrasDeHilera1 = palabra.charAt(letras);

            if((letrasDeHilera1 >= 'A' && letrasDeHilera1 <= 'Z')||(letrasDeHilera1 >= 'a' && letrasDeHilera1 <= 'z') || letrasDeHilera1 == ' '|| letrasDeHilera1 == 'í'|| letrasDeHilera1 == 'ó'|| letrasDeHilera1 == 'Ó'|| letrasDeHilera1 == 'Ú'|| letrasDeHilera1 == 'ú'|| letrasDeHilera1 == 'Í'|| letrasDeHilera1 == 'É'|| letrasDeHilera1 == 'Á'|| letrasDeHilera1 == 'é'|| letrasDeHilera1 == 'á'|| letrasDeHilera1 == 'ñ'|| letrasDeHilera1 == 'Ñ'){


                nuevaHilera = nuevaHilera + letrasDeHilera1;

            }
            
        }
        
        return nuevaHilera;
    
    }
    
    public ArrayList<String> buscarInvestigacion(PalabraClave palabraClave){
        
        ArrayList<String> resumenes = new ArrayList<>();
        
        //Se recorre la tabla hash de resumenes
        for(int i = 0; i< tabla.length; i++){
            
            //Si la posición es distinto de null
            if(tabla[i] != null){
                
                //Se recorre la tabla en la posición del codigo hash obtenido
                for (ObjetoHash nodo = tabla[i]; nodo != null; nodo = nodo.getSiguiente()) {

                    //Se guarda el archivo actual
                    Resumen actual = ((Resumen) nodo.getValor());
                    
                    //Se busca en la tabla del resumen la palabra clave
                    PalabraClave analisis = (PalabraClave) actual.getPalabras().buscarValor(palabraClave.getPalabraClave(), false);
                    
                    //Si la palabra está
                    if(analisis != null){
                          
                        resumenes.add(((Resumen) nodo.getValor()).getTitulo());
                        
                    }

                }
                
            }
            
        }
        
        return resumenes;
    }
    
    public ObjetoHash[] getTabla() {
        return tabla;
    }

}
