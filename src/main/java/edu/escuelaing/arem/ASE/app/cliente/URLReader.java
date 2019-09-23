package edu.escuelaing.arem.ASE.app.cliente;
import java.io.*; 
import java.net.*; 
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class URLReader implements Runnable{ 
  public String[] args;
  public long tiempoPromedio;
 
  public URLReader(String[] args){ 
      this.args=args;
    } 
  
  @Override
  public void run(){
      long tiempoInicial = System.currentTimeMillis();
      try{
        URL url = new URL(args[0]); 
        try (BufferedReader reader = new BufferedReader(
            new InputStreamReader(url.openStream()))) { 
              String inputLine = null; 
              while ((inputLine = reader.readLine()) != null) { 
                    //System.out.println(inputLine);
                    System.out.println("hola");
               } 
         } catch (IOException x) { 
                 System.err.println(x); 
         } 
        long tiempoFinal = System.currentTimeMillis();
        tiempoPromedio=(tiempoFinal-tiempoInicial);
          System.out.println(tiempoPromedio);
      }catch(Exception e){
          e.getMessage();
      }
  }
  
  
}