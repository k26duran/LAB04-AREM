package edu.escuelaing.arem.ASE.app.cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Cliente {
    
    private static ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
    
    public static void main(String[] args) throws Exception { 
     URLReader[] readers= new URLReader[201];
     long suma=0;
     int n=10;
     for(int i=0;i<n; i++){
        URLReader u=new URLReader(args);
        executor.execute(u);
        
        //readers[i].join();
          
       }
     /**
     for(int i=0; i<n; i++){
        System.out.println(readers[i].tiempoPromedio);
        suma+=readers[i].tiempoPromedio;
      }
     
      System.out.println("El tiempo promedio en segundos es: "+((double)suma/3000));
**/
      
    
    }
}
