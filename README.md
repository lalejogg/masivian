# masivian
Prueba técnica Refactor

1. Parte conceptual Realice una descripción breve y puntual de los principales problemas identificados en el siguiente código: 
import java.io.File; import java.io.FileInputStream; import java.io.FileOutputStream; import java.io.IOException; /** * This class is thread safe. */ public class Parser {   private File file;   public synchronized void setFile(File f) {     file = f;   }   public synchronized File getFile() {     return file;   }   public String getContent() throws IOException {     FileInputStream i = new FileInputStream(file);     String output = "";     int data;     while ((data = i.read()) > 0) {       output += (char) data;     }     return output;   }   public String getContentWithoutUnicode() throws IOException {     FileInputStream i = new FileInputStream(file);     String output = "";     int data;     while ((data = i.read()) > 0) {       if (data < 0x80) {         output += (char) data;       }     }     return output;   }   public void saveContent(String content) {     FileOutputStream o = new FileOutputStream(file);     try { 
  Prueba técnica Refactor       
 
      for (int i = 0; i < content.length(); i += 1) {         o.write(content.charAt(i));       }     } catch (IOException e) {       e.printStackTrace();     }   } } 
 
 
 # Problemas:
 
 1 - No hay un Main (si se busca ejecutar el código)
 2 - procedimiento saveContent sin throw que contemple que File puede que no exista
 
