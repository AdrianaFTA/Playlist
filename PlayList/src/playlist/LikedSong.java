/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist;

/**
 *
 * @author adria
 */
public class LikedSong implements Interface2{
    private Arraylist<String> likedSong;
    
    public LikedSong(){
        likedSong = new ArrayList<String>();
        
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
        if(|(likedSong.isEmpty())){
            
        }
    }
    
    
}
