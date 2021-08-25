/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.clientejava;

/**
 *
 * @author Home
 */
public class HerokuApi extends HttpStockService{

    String stock = "fb";
    String funcion = "TIME_SERIES_INTRADAY";
    String URL = "https://taller1arep.herokuapp.com/facadealpha?st="+stock+"&fn="+funcion;
    @Override
    public String getURL() {
        System.out.println(URL);
        return URL;
        
    }

    @Override
    public void setStock(String stock) {
        stock = stock.replace("\"", "");
        this.stock = stock;
        System.out.println(stock);
        URL =  "https://taller1arep.herokuapp.com/facadealpha?st="+stock+"&fn="+funcion;
    }
    @Override
    public void setFuncion(String funcion){
        funcion = funcion.replace("\"", "");
        this.funcion = funcion;
        URL = "https://taller1arep.herokuapp.com/facadealpha?st="+stock+"&fn="+funcion;
    }
    
}
