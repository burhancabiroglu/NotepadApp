/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication;

import java.util.ArrayList;

/**
 *
 * @author burhancabiroglu
 */
public class Context {
    
    private Strategy strategy;
    public Context(Strategy st){
        this.strategy=st;
    }
    
    public ArrayList<Integer> executeStrategy(String prgh, String callen){
      return strategy.doSearchStrategy(prgh, callen);
   } 
}
