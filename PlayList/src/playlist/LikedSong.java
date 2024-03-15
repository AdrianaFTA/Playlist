/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist;
import java.util.*;


/**
 *
 * @author adria
 */
public class LikedSong extends Interface2{
    private Arraylist<String> likedSong;
    
    public LikedSong(){
        likedSong = new Arraylist<String>();
        
    }
    
     public int size(){
     return likedSong.size();
     }
     
    public boolean IsEmpty(){
        return likedSong.isEmpty();
        
    }
    public boolean isFull(){
        return false;
    }
    public Object pop(){
        if(!(likedSong.isEmpty())){
            return likedSong.remove(index:0, (String) newItem);
            
            
        }
        public void push(Object newItem){
            likedSong..add(index:0, (String)newItem);
            
        }
        public void emptyStack(){
            while(!likedSong.isEmpty());
            pop();
        }
        public String displayStack(){
            int icount;
            String sMessage = "";
            if (likedSong.isEmpty()){
                sMessage = sMessage.concat(:"This stack is Empty!");
            }else{
                sMessage = "This stack contains:";
                for(iCouunt = 0;iCount<likedSong.size());iCount++){
                sMessage = sMessage.concat(str:likedSong.get(index:iCount));
                sMessage = sMessage.concat(:";");
                
                
            }
            }
            rerturn sMessage;
        }

    private static class Arraylist<T> {

        public Arraylist() {
        }
    }
        
    }
    
    
}
