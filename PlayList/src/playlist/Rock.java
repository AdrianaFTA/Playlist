/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist;

/**
 *
 * @author adria
 */
public class Rock implements Interface1{
    private ArrayList<String> rock;
    
    public Rock(){
        rock = new ArrayList<String>();
            
        }
    public boolean isEmpty(){
        return rock.isEmpty();
    }
    public int size(){
        return rock.size();
    }
    public Object fromElement(){
        if(rock.size()> 0 ){
            return rock.get(index:0);
    }else{
        return null;
    }
        public void engueue(Object newItem){
            rock.add(String) newItem);
            
        }
        public Object degueue(){
            if(rock.size()>0){
                return rock.remove(index:0);
            }else{
                return null;
            }
        }
            
        }
    
}
