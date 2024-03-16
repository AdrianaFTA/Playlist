/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist;

import java.util.*;
import javax.swing.JOptionPane;

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
     //removes all elements from stack
        public void emptyStack() {
        while (!likedSong.isEmpty());{
        pop();
        }
    }
//returns string object// for loop used
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
    public String search(){
        String response = "";
        if(likedSong.isEmpty()){
            response = response.concat("There is nothing to search for ");
        }else{
            String searchTerm  = JOptionPane.showInputDialog(null, "Enter a song to search");
                
            ArrayList<String> searchMatch = new ArrayList();
            for(String songName : likedSong){
                if(songName.equalsIgnoreCase(searchTerm)){
                    searchMatch.add(songName);
                    response = response.concat("Title of song is");
                    for(String song: searchMatch){
                        response = response.concat(song).concat("");
                    }
                }else{
                    response = response.concat("Song entered could bot be found");
                    
                }
            }
        }
        return response;
    }
     
    public String repeat(){
        String response = "";
        ArrayList<String> repeat = new ArrayList();
        int rep;
        rep = 1;
        for (int i = 0; i<rep; i++){
            repeat.addAll(likedSong);//add all elements from first/origional playlist
            response = response.concat("Playlist repeated with the songs");
            for(String song: repeat){
                response = response.concat(song).concat(" ");
                
            }
            
        }
         return response;       
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
