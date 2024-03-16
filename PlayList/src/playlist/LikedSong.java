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
public class LikedSong implements InterfaceB {

    private ArrayList<String> likedSong;

    public LikedSong() {
        likedSong = new ArrayList<String>();

    }

    public int size() {
        return likedSong.size();
    }

    public boolean isEmpty() {
        return likedSong.isEmpty();

    }

    public boolean isFull() {
        return false;
    }

    public Object pop() {
            if (!(likedSong.isEmpty())) {
                return likedSong.remove(0);
            } else {
                return null;
            }
        }
    public Object rock(){
        if(!(likedSong.isEmpty())){
            return likedSong.remove(0);
        }else{
            return null;
            
        }
    }
 
     public void push(Object newItem) {
        likedSong.add(0, (String)newItem);
            
        }
        public void emptyStack() {
        while (!likedSong.isEmpty());{
        pop();
        }
    }

    public String displayStack() {
        int iCount;
        String sMessage = "";
        if (likedSong.isEmpty()) {
            sMessage = sMessage.concat("This stack is Empty!");
            }else{
                sMessage = "This stack contains:";
            for (iCount = 0; iCount < likedSong.size();iCount++){
                sMessage = sMessage.concat(likedSong.get(iCount));
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
