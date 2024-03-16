/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package playlist;

/**
 *
 * @author adria
 */
public interface InterfaceB {
    
     public boolean isEmpty();
    public boolean isFull();
    public void push(Object newItem);
    public Object pop();
    public Object rock();
    public int size();
    public void emptyStack();
    public String displayStack();

    public boolean contains(String songNameDelete);

    public void remove(String songNameDelete);
    
    
}
