/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist;
import java.util.ArrayList;

/**
 *
 * @author adriarrayList;
import java.util.*;

/**
 */
public class genreB implements InterfaceA{
    private ArrayList<String> genreB;
    
    public genreB(){
        genreB = new ArrayList<String>();
            
        }
    public boolean isEmpty(){
        return genreB.isEmpty();
    }
    public int size(){
        return genreB.size();
    }
    public Object fromElement(){
        if(genreB.size()> 0 ){
            return genreB.remove(0);
        }else{
            return null;
        }

    }
        public void engueue(Object newItem){
            genreB.add((String)newItem);
            
        }
        public Object degueue(){
            if(genreB.size()>0){
                return genreB.remove(0);
            }else{
                return null;
            }
        }
         public String displayQueue(){
             int iCount;
             String sMessage = "";
             if(genreB.isEmpty()){
                 sMessage = sMessage.concat("This Rock playlist is currently empty");
             }else{
                 sMessage = "The Rock playlist contains: ";
                for(iCount = 0; iCount < genreB.size(); iCount++){
                    sMessage = sMessage.concat(genreB.get(iCount));
                    sMessage = sMessage.concat(", ");
                }
            }
            return sMessage;
             }

    @Override
    public boolean contains(String songNameDelete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove(String songNameDelete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
         }
               
        
            
        
    

