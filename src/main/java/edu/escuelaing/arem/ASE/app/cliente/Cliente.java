package edu.escuelaing.arem.ASE.app.cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Cliente {
    public static ExecutorService pool;
    
    public static void main(String[] args) throws Exception { 
     URLReader[] readers= new URLReader[101];
     try{
      pool=Executors.newFixedThreadPool(3); 
      for(int i=0; i<10; i++){
          readers[i]=new URLReader(args);
          pool.execute(readers[i]);
      }
      
      while(!pool.isTerminated()){
          
      }
     }catch(Exception e){
         e.getMessage();
     }finally{
      long suma=0;
      for(int i=0; i<10; i++){
          System.out.println(readers[i].tiempoPromedio);
          suma+=readers[i].tiempoPromedio;
      }
     
      System.out.println("El tiempo promedio es: "+(suma/10));
     } 
    } 
    
}
