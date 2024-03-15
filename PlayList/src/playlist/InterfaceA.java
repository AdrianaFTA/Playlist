/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package playlist;

/**
 *
 * @author adria
 */
public interface InterfaceA {
     
    public boolean isEmpty();
    
    public int size();
    
    public Object fromElement();
    public void engueue(Object newItem);
    public Object degueue();
    public String displayQueue();
    
}
