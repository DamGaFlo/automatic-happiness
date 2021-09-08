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
public class OpenweatherApi extends HttpClimaService{
    
    String city = "london";
    String URL = "http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=23d06d0aa44bee58ec0a959da9279a2e";

    @Override
    public String getURL() {
        System.out.println(URL);
        return URL;
    }

    @Override
    public void setClima(String stock) {
        city = city.replace("\"", "");
        this.city = city;
        System.out.println(city);
        URL =  "http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=23d06d0aa44bee58ec0a959da9279a2e";
    }


}
