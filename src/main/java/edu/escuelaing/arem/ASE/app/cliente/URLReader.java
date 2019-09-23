package edu.escuelaing.arem.ASE.app.cliente;
import java.io.*; 
import java.net.*; 
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class URLReader extends Thread{ 
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
              long tiempoFinal = System.currentTimeMillis();
              tiempoPromedio=(tiempoFinal-tiempoInicial);
              while ((inputLine = reader.readLine()) != null) { 
                    //System.out.println(inputLine);
               } 
         } catch (IOException x) { 
                 System.err.println(x); 
         } 
      }catch(Exception e){
          e.getMessage();
      }
  }
  
  
}