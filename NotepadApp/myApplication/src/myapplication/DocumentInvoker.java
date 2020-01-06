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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class DocumentInvoker {
    private ArrayList<Command> commands=new ArrayList<Command>();
    public  int level;
    private Document doc=new Document();


    public void Redo(){
        commands.get(level).Redo();
    }
    public void Undo(){
        if(level>=0){
         System.out.println(level);
        commands.get(level--).Undo();
        commands.remove(level+1);
        }
    }
    
    public void Write(String text,KeyEvent evt)
    {
        if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE && !doc.isNull()){
            String textgelen=doc.Lastchar();
            doc.Erase(textgelen);
            DocumentEditCommand cmd=new DocumentEditCommand(doc,textgelen,evt);
             System.out.println("Silme karakteri Kullanıldı");
               level=commands.size();
                commands.add(cmd);
        }
        else{
             DocumentEditCommand cmd=new DocumentEditCommand(doc,text,evt);
       
        System.out.println(text+" harfi kullanıldı");
       level=commands.size();
       commands.add(cmd);
        }
      

    }
    
    
  


    public String Read(){
        return doc.ReadDocument();
    }

    

  
   






}