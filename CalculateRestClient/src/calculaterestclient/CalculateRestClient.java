/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculaterestclient;

import util.CalculateJerseyClient;

/**
 *
 * @author bismuth
 */
public class CalculateRestClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CalculateJerseyClient obj = new CalculateJerseyClient();
       
       System.out.println("Using Restful Service for calculate circle area");
       System.out.println("Area is "+obj.getAreaXml("7"));
       System.out.println("Using Restful Service for calculate circle perimeter");
       System.out.println("Perimeter is "+obj.getPeriXml("14"));
    }
    
}
