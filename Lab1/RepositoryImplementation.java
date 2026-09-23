package Lab1;

import java.util.ArrayList;
import java.util.HashMap;

public class RepositoryImplementation<ID , T> implements Repository<ID ,T>{

  private final HashMap<ID ,T> pairs = new HashMap<>();
    //we work as if repeating is allowed
    @Override
    public void save(ID id, T item) {
        pairs.put(id , item) ;
        System.out.println("Item Saved successfully");
    }

    @Override
    public T findById(ID id) {
        // <Key , Value>
         return pairs.get(id) ;

    }

    @Override
    public boolean deleteById(ID id) {
        if(pairs.containsKey(id)){
            pairs.remove(id);
            return true ;
        }
        return false ;
    }
    // Task :Implement a Repository<T, ID> interface with methods:
    // void save(ID id, T item), T findById(ID id), and boolean deleteById(ID id)
    //. Implement this interface using a HashMap<ID, T>.



}
