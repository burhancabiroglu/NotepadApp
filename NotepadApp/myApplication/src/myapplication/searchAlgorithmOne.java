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
public class searchAlgorithmOne implements Strategy {

    @Override
    public ArrayList<Integer> doSearchStrategy(String prgh, String callen) {
         ArrayList<Integer> arl=new ArrayList<Integer>();
        int findsay=0;
        
        int say=0;

        for(int i=0; i<prgh.length();i++){
            say=0;


            for (int j=0;j<callen.length();j++){
                if((i+j)<prgh.length() && prgh.charAt(i+j)==callen.charAt(j)){
                    say++;
                }

            }
            if(say==callen.length()){
                findsay++;
                arl.add(i);
                
            }


        }
        
        return arl;
    }
    
    
    
}
