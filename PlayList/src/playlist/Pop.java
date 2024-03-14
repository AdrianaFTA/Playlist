/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist;

/**
 *
 * @author adria
 */
public class Pop implements Interface1{
    private ArrayList<String> pop;
    
    
    public Pop(){
        pop = new ArrayList<String>();
        }
    public boolean isEmpty(){
        return pop.isEmpty();
    }
    public int size(){
        return pop.size();
    }
    public Object fromElement(){
        if (pop.size()> 0){
            return pop.get(index:0);
        }else{
            return null;
        }
    }
    public void engueue(Object newItem){
        pop.add(String) newItem);
    }
    public Object degueue(){
        if(pop.size()> 0){
            return pop.remove(index:0);
        }else{
            return null;
        }
    }
    
}
