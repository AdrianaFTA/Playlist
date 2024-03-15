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
public class genreB extends Interface1{
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
            return genreB.get(index:0);
    }else{
        return null;
    }
        public void engueue(Object newItem){
            genreB.add(displayStack);
            
        }
        public Object degueue(){
            if(genreB.size()>0){
                return genreB.remove(index:0);
            }else{
                return null;
            }
        }
            
        }
    

