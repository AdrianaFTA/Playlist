/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist;
import java.util.ArrayList;
import java.util.*;

/**
 * 
 * @author adria
 */
public class genreA extends Interface1{
    private ArrayList<String> genreA;
    private Object index;
    
    
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
        genreA.add(String)newItem);
    }
    public Object degueue(){
        if(genreA.size()> 0){
            return genreA.return(index:0);
        }else{
            return null;
        }
    }
    
}
