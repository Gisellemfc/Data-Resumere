package Controlador;

import Vista.Panel;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ArchivoTxt {
    
    //Atributos para seleccionar y manejar el archivo txt
    private JFileChooser seleccionado = new JFileChooser();
    private File archivo;

    //Metodo para abrir el archivo contentivo del resumen
    public void abrirArchivo(java.awt.event.ActionEvent evt, Frame frame, TablaHash tabla, boolean bandera){
        
        try { //Intenta hacer esto
            
            //Si se puede abrir el archivo seleccionado
            if(seleccionado.showDialog(frame, "ABRIR ARCHIVO") == JFileChooser.APPROVE_OPTION) {

                //Guarda el archivo seleccionado en una variable
                archivo = seleccionado.getSelectedFile();
                
                //Si se puede leer el archivo seleccionado
                if (archivo.canRead()) {
                    
                    //Si es un archivo txt
                    if (archivo.getName().endsWith("txt")) {

                        try {//Intento leer el archivo

                            //Creación de variables para leer el archivo
                            BufferedReader bf = new BufferedReader(new FileReader(seleccionado.getSelectedFile().toString()));
                            String texto;
                            String bfRead = bf.readLine();
                            texto = bfRead;
                            
                            if(bandera){
                                
                                //Llamada al método para leer el archivo
                                cargarResumen(texto, bf, tabla);
                            
                            }else{
                                
                                cargarArchivoClaves(texto, bf, tabla);
                            }

                        } catch (Exception e) {
                            
                            //Si no se puede leer el archivo seleccionado
                            JOptionPane.showMessageDialog(null, "Error, no se puede leer el archivo seleccionado.", "ERROR DE LECTURA", JOptionPane.ERROR_MESSAGE);
                    
                        }

                    } else {
                        
                        //Si el archivo no es de tipo txt
                        JOptionPane.showMessageDialog(null, "Error, por favor seleccione un archivo de tipo txt", "ERROR TIPO DE ARCHIVO", JOptionPane.ERROR_MESSAGE);
                        
                    }

                }else{
                    
                    //Si no se puede leer el archivo seleccionado
                    JOptionPane.showMessageDialog(null, "Error, no se puede leer el archivo seleccionado.", "ERROR DE LECTURA", JOptionPane.ERROR_MESSAGE);
                    
                }

            }else{
                
                //Si no se puede abrir el archivo seleccionado
                JOptionPane.showMessageDialog(null, "Error, no se puede abrir el archivo seleccionado", "ERROR ARCHIVO", JOptionPane.ERROR_MESSAGE);
                
            }
            
        } catch (Exception e) {
            
            //Si no se puede realizar algo de lo anterior, se lanza mensaje de error
            JOptionPane.showMessageDialog(null, "Error, intente de nuevo", "ERROR DESCONOCIDO", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
    //Metodo para cargar el archivo en la tabla y guardar su respaldo
    public void cargarResumen(String texto, BufferedReader bf, TablaHash tablaResumenes) throws FileNotFoundException, IOException {
        
        //Variable para guardar el titulo del resumen
        String titulo = "";
        //Variable para escribir en el nuevo archivo
        PrintWriter pw;
        
        //Si el archivo no está vacio
        if (texto != null) {
            
            //Mientras no se lea la palabra autores
            do{

                //Se agrega el texto al titulo del archivo
                titulo = (titulo + texto + " ");
                
                //Se lee la siguiente linea
                texto = bf.readLine(); 
                
            
            }while(!(texto.equalsIgnoreCase("Autores")) && texto != null);

            //Se coloca el titulo en mayusculas
            titulo = titulo.toUpperCase();
            
            if(titulo.endsWith(" ")){
                
                titulo = titulo.substring(0, titulo.length()-1);
            
            }
            
            //Si aun queda texto que leer
            if(texto != null){
                    
                //Validar que no exista otro resumen igual
                if(!tablaResumenes.existeInvestigacion(titulo)){

                    //Se crea un nuevo objeto de tipo archivo
                    Resumen txt = new Resumen();
                    
                    txt.setTitulo(titulo);
                    
                    titulo = titulo.replaceAll(":", "");
                    
                    //Se crea un nuevo archivo txt para guardar el respaldo
                    File file = new File("..\\Brito_Ferreira_Gonzalez_Proyecto2\\Archivos\\" + titulo + ".txt");
                    //Se inicializa la variable que escribira sobre el nuevo archivo txt
                    pw = new PrintWriter(file);

                    //Se escribe el titulo del resumen en el txt y se guarda en el objeto archivo el titulo
                    pw.println(titulo);

                    //Si se lee la palabra autores
                    if(texto.equalsIgnoreCase("Autores")){

                            //Se escribe en el txt autores
                            pw.println("Autores");
                            //Se crea la variable que guardará los autores
                            String autores = "";
                            //Se lee la siguiente linea
                            texto =bf.readLine(); 

                            //Mientras no se lea la palabra resumen
                            while(!texto.equalsIgnoreCase("Resumen") && texto != null){

                                //Escribo los autores y los guardo
                                pw.println(texto);
                                autores = autores + texto + ", ";
                                texto = bf.readLine();

                            }

                            autores = autores.substring(0, autores.length()-1);

                            //Se guardan los autores
                            txt.setAutores(autores);
                    }

                    //Si el texto no se ha acabado
                    if(texto != null){
                        
                        //Si se lee la palabra resumen
                        if(texto.equalsIgnoreCase("Resumen")){

                            //Se escribe resumen en el txt
                            pw.println("Resumen");
                            //Variable que va a guardar el resumen
                            String resumen = "";
                            //Leer la siguiente linea
                            texto = bf.readLine();

                            //Mientras no se acabe el texto
                            while(texto!=null){

                                //Se escribe en el txt la linea del resumen y se guarda el resumen
                                pw.println(texto);
                                resumen = resumen + texto + " ";
                                texto=bf.readLine();

                            }

                            //Se agrega el resumen
                            resumen = resumen.substring(0, resumen.length()-1);
                            txt.setResumen(resumen);
                            
                        }
                        
                    }
                    
                    //Agrego el txt al archivo
                    txt.setArchivo(file);
                    //Cierro el archivo que acabo de escribir
                    pw.close(); 
                    
                    if(txt.getTitulo() != null && txt.getAutores() != null && txt.getResumen() != null){
                        
                        //Inserto el resumen el la tabla hash
                        tablaResumenes.insertar(tablaResumenes.crearClave(txt.getTitulo()),txt, false);
                        Panel.archivero.add(txt.getTitulo());
                        txt.llenarTabla();
                        
                        JOptionPane.showMessageDialog(null, "Resumen agregado correctamente.", "RESUMEN AGREGADO", JOptionPane.INFORMATION_MESSAGE);
                        
                    }else{
                     
                        //Mensaje de error
                        JOptionPane.showMessageDialog(null, "Error, formato de archivo incorrecto", "ERROR DE FORMATO", JOptionPane.ERROR_MESSAGE);
                    
                    }
                    
                }else{

                    //Mensaje de error si la investigación ya existe
                    JOptionPane.showMessageDialog(null, "Error, la investigación ya existe", "ERROR INVESTIGACIÓN REPETIDA", JOptionPane.ERROR_MESSAGE);

                }
                
            }else{
                    
                //Mensaje de error si el texto no es un resumen
                JOptionPane.showMessageDialog(null, "Error, formato de archivo incorrecto.", "ERROR DE FORMATO", JOptionPane.ERROR_MESSAGE);
            
            }
        }

    }
    
    //  Metodo para cargar un archivo de palabras claves a la tabla hash 
    public void cargarArchivoClaves(String aux, BufferedReader bf, TablaHash tablaPalabrasClave) throws FileNotFoundException, IOException {
        
        //Si el texto no es nulo y empieza con una comilla simple
        if(aux != null && aux.startsWith("'")){
            
            do{
                
                //Divido la linea en cada palabra segun la aparición de una coma
                String[] arreglo = aux.split(",");

                //Recorro el arreglo de palabras 
                for (int i = 0; i < arreglo.length; i++) {

                    //Si la palabra empieza y termina en comillas tiene el formato correcto
                    if(arreglo[i].startsWith("'") && arreglo[i].endsWith("'")){
                        
                        //Tomo la palabra clave actual
                        String palabraClave = arreglo[i].substring(1, arreglo[i].length() - 1);

                        //Si la palabra no está en la tabla hash
                        if (!tablaPalabrasClave.existePalabraClave(palabraClave)) {

                            //Creo mi palabra clave
                            PalabraClave palabra = new PalabraClave(palabraClave);

                            //La agrego a la tabla hash de palabras clave
                            tablaPalabrasClave.agregarClave(palabra, false, false);
                            Panel.palabrero.add(palabra.getPalabraClave());


                        } else {//si la palabra clave se repite 

                            //Mensaje de error si la palabra ya existe en la tabla
                            JOptionPane.showMessageDialog(null, "La palabra clave '" + palabraClave + "' ya existe", "ERROR PALABRA REPETIDA", JOptionPane.ERROR_MESSAGE);//muestro un menseje al usuario indicandole la palabra clave que se repite y continuo validando 

                        }
                        
                    }else{
                        
                        //Mensaje de error si la palabra tiene un formato incorrecto
                        JOptionPane.showMessageDialog(null, "Error, palabra en formato incorrecto", "ERROR FORMATO PALABRA CLAVE", JOptionPane.ERROR_MESSAGE);
                    }
                    
                }
                
                    //Leo la siguiente linea
                    aux = bf.readLine();

            }while(aux != null); //Mientras queden lineas del archivo por leer
            
        }else{
            
            //Mensaje de error si el archivo fue subido en un formato incorrecto
            JOptionPane.showMessageDialog(null, "Error formato incorrecto", "ERROR DE FORMATO", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
    
    public void recuperarResumenes() {
        
        // Aquí la carpeta donde queremos buscar
        String path = "..\\Brito_Ferreira_Gonzalez_Proyecto2\\Archivos";

        File files;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {

            if (listOfFiles[i].isFile()) {
                
                files = listOfFiles[i];
                BufferedReader bf;
                
                try {
                    
                    bf = new BufferedReader(new FileReader(files));
                    String texto;
                    String bfRead = bf.readLine();
                    texto = bfRead;
                    cargarResumen(texto, bf, Panel.resumenes);
                    
                } catch (FileNotFoundException ex) {
                    
                    Logger.getLogger(ArchivoTxt.class.getName()).log(Level.SEVERE, null, ex);
                    
                } catch (IOException ex) {
                    
                    Logger.getLogger(ArchivoTxt.class.getName()).log(Level.SEVERE, null, ex);
                    
                }

            }
        }
    }
    
        
    
    public void actualizarArchivoPalabrasClaves(TablaHash tabla){
        
        File file = new File("..\\Brito_Ferreira_Gonzalez_Proyecto2\\ArchivosPalabrasClaves\\PalabrasClaves.txt");

        try {
            
            PrintWriter pw = new PrintWriter(file);
            
            for(int i=0;i<tabla.getTabla().length-1;i++){
                
                for (ObjetoHash nodo = tabla.getTabla()[i]; nodo != null; nodo = nodo.getSiguiente()) {

                        PalabraClave palabra = (PalabraClave) tabla.getTabla()[i].getValor();

                            pw.print("'"+palabra.getPalabraClave()+"',");

                }
            }
            
            pw.close();
            
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(ArchivoTxt.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
    }

    public void recuperarPalabrasClaves(){
        
        File file = new File("..\\Brito_Ferreira_Gonzalez_Proyecto2\\ArchivosPalabrasClaves\\PalabrasClaves.txt");
        BufferedReader bf;
        
        try {
            
            bf = new BufferedReader(new FileReader(file));
            String texto;
            String bfRead = bf.readLine();
            texto = bfRead;
            
            cargarArchivoClaves(texto, bf, Panel.palabrasClave);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoTxt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArchivoTxt.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
        
    }


    
}
