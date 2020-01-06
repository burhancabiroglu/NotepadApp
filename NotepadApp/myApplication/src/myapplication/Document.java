/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication;

/**
 *
 * @author burhancabiroglu
 */
import java.util.ArrayList;

public class Document {

    
    

    private ArrayList<String> textArray=new ArrayList<String>();

    public void Write(String text){
        textArray.add(text);

    }
    
    //public void EraseLast(){
        /*System.out.println(textArray.get(textArray.size()-1).toString()+ "siliniyor");
        textArray.remove(textArray.size()-1);}*/


    public void Erase(String text){
        
        
        
        if(this.contains(text)){
            this.Erase(this.harfsay(text)-1);
        }
        else{
            textArray.remove(text);
        }
    }


    public void Erase(int level){
        textArray.remove(level);
       
    }

    public String ReadDocument(){
        StringBuilder sb=new StringBuilder();
        for (String text:textArray )

        {
            sb.append(text);
        }
       
        return sb.toString();
        

    }
    
    public int harfsay(String text){
        
        int i=0;
        int now=0;
        for(String t: textArray){
            i++;
            if(t.equals(text)){
              
              now=i;
                System.out.println(now+" bulundu");
           
            }
            
            
        }
        return now;
    }
    
    public boolean contains(String text){
    int i=0;
        for(String t: textArray){
            
            if(t.equals(text)){
              i++;
             
           
            }
        }
        if(i>1){
            return true;
        }
        else{
            return false;
        }
        
}
    
    
    public int size(){
        return textArray.size();
        
        
        
    }
    
    public String Lastchar(){
        return textArray.get(this.size()-1);
    }
    
    public Boolean isNull(){
        return textArray.isEmpty();
    }
}
