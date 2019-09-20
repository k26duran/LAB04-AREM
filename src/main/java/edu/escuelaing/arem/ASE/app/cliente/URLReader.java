package edu.escuelaing.arem.ASE.app.cliente;
import java.io.*; 
import java.net.*; 
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class URLReader implements Runnable{ 
  public String[] args;
  public long tiempoPromedio;
 
  public URLReader(String[] p){ 
      this.args=p;
    } 
  
  @Override
  public void run(){
      long tiempoInicial = System.currentTimeMillis();
      try{
        URL url = new URL(args[0]); 
        try (BufferedReader reader = new BufferedReader(
            new InputStreamReader(url.openStream()))) { 
              String inputLine = null; 
              long tiempoFinal = System.currentTimeMillis();
              tiempoPromedio=(tiempoFinal-tiempoInicial);
              System.out.println(tiempoPromedio);
              while ((inputLine = reader.readLine()) != null) { 
                    //System.out.println(inputLine);
                    //System.out.println("Funciona");
               } 
         } catch (IOException x) { 
                 System.err.println(x); 
         } 
      }catch(Exception e){
          e.getMessage();
      }
  }
  
  
}