package Lab1;

import java.util.Map;
import java.util.UUID;

public interface Repository<ID ,T>  {
    // Task :Implement a Repository<T, ID> interface with methods:
    // void save(ID id, T item), T findById(ID id), and boolean deleteById(ID id)
    //. Implement this interface using a HashMap<ID, T>.

    void save(ID id , T item) ;
    T findById(ID id);
    boolean deleteById(ID id) ;





}
