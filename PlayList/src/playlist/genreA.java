/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist;
import java.util.ArrayList;

/**
 * 
 * @author adria
 */
public class genreA implements InterfaceA{
    private ArrayList<String> genreA;
  
    
    
    public genreA(){
        genreA = new ArrayList<String>();
        }
    public boolean isEmpty(){
        return genreA.isEmpty();
    }
    public int size(){
        return genreA.size();
    }
    public Object fromElement(){
        if (genreA.size()> 0){
            return genreA.remove(0);
        }else{
            return null;
        }
    }
    public void engueue(Object newItem){
        genreA.add((String) newItem);
    }
    public Object degueue(){
        if(genreA.size()>0){
            return genreA.remove(0);
        }else{ 
            return null;
        }
        public String displayQueue(){
            int iCount;
            String sMessage = "";
            if(genreA.isEmpty()){
                sMessage = sMessage.concat("The Pop playlist is currently empty");
            }else{
                sMessage = "The pop playlist contains: ";
                for(iCount = 0; iCount < genreA.size(); iCount++){
                    sMessage = sMessage.concat(genreA.get(iCount));
                    sMessage = sMessage.concat(", ");
                }
            }
            return sMessage;
        }
    }
    

