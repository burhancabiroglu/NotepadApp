/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication;

import java.awt.event.KeyEvent;

/**
 *
 * @author burhancabiroglu
 */
public class DocumentEditCommand implements Command{

    

    private Document editableDoc;
    private String text;
    private KeyEvent evt;
   


    public  DocumentEditCommand(Document doc,String text,KeyEvent evt){
        this.editableDoc=doc;
        this.text=text;
        if(evt.getKeyCode()!=KeyEvent.VK_BACK_SPACE){
             editableDoc.Write(text);
        }
       
        this.evt=evt;

    }
    @Override
    public void Redo() {
        editableDoc.Write(text);
    }

    @Override
    public void Undo() {
       
        if(KeyEvent.VK_BACK_SPACE==evt.getKeyCode()){
            editableDoc.Write(text);
        }
        else{
            editableDoc.Erase(text);
        }
        
        
       
        
        
       
    }

}