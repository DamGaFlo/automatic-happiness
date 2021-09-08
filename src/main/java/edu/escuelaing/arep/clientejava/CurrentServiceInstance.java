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
public class CurrentServiceInstance {
    private static CurrentServiceInstance _instance = new CurrentServiceInstance();
    private HttpClimaService service;
    
    private CurrentServiceInstance(){
        service = new OpenweatherApi();
    }
    
    public static CurrentServiceInstance getInstance(){
        return _instance;
    }
    
    public HttpClimaService getService(){
        return service;
    }
    
    public void setService(HttpClimaService service){
        this.service = service;
    }
    
    
    
}