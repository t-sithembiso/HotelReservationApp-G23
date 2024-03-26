package za.ac.mycput.repository;
import java.util.List;
/* generic repository
 Author Thalitha Sithembiso-221123598 (Team lead)
 * Date: 21 march 2024  */

public interface IRepository <T,ID>{

    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
    List<T>getallstuff();
}
