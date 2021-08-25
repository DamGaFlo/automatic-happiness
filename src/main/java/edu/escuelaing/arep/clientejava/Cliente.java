/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.clientejava;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Home
 */
public class Cliente {
    
    public static void main(String[] args){
        String stock = "fb";
        String funcion = "TIME_SERIES_INTRADAY";
        HttpStockService stockService = CurrentServiceInstance.getInstance().getService();
        
        
        stockService.setStock(stock);
            
        
        String response = "None"; 
        try{
            response = stockService.TimeSeries();
        }catch(IOException e){
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE,null,e);
        }
        System.out.println(response);
             
    }
    
    
}
