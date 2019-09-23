package edu.escuelaing.arem.ASE.app.cliente;

import java.net.URL;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Cliente {
    
    private static ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(60);
    public static URLReader[] readers= new URLReader[201];
    
    public static void main(String[] args) throws Exception { 
     int n=100;
     URL url= new URL(args[0]);
     for(int i=0;i<n; i++){    
        readers[i]=new URLReader(url);
        executor.execute(readers[i]);
        //readers[i].join();
       }
       executor.shutdown();
       try {
            if (!executor.awaitTermination(80000, TimeUnit.MILLISECONDS)) {
                executor.shutdownNow();        
            } 
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
        calculateProm(n);
    }
    
     public static void calculateProm(int n){
        long suma=0;
        for(int i=0; i<n; i++){
           System.out.println(readers[i].tiempoPromedio);
           suma+=readers[i].tiempoPromedio;
         }
         System.out.println("El tiempo promedio en segundos es: "+((double)suma/(n*1000)));
     }
    
}
