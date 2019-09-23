package edu.escuelaing.arem.ASE.app.cliente;
import java.io.*; 
import java.net.*; 

public class URLReader extends Thread{ 
  public URL url;
  public long tiempoPromedio;
 
  public URLReader(URL url){ 
      this.url=url;
    } 
  
  @Override
  public void run(){
      long tiempoInicial = System.currentTimeMillis();        
        try (BufferedReader reader = new BufferedReader(
            new InputStreamReader(url.openStream()))) { 
              String inputLine = null; 
              while ((inputLine = reader.readLine()) != null) { 
                    //System.out.println(inputLine);
                   // System.out.println("hola");
               } 
         } catch (IOException x) { 
                 System.err.println(x); 
         } 
        long tiempoFinal = System.currentTimeMillis();
        tiempoPromedio=(tiempoFinal-tiempoInicial);
        System.out.println("Se demora:"+tiempoPromedio);   
  }
  
}