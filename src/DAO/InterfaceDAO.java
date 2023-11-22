
package DAO;

import java.util.ArrayList;

/**
 *
 * @author @VHSkirik
 */
public interface InterfaceDAO<T> {
    public int insert(T t);
    public int delete(String id);
    public int update(T t);
    public ArrayList<T> getAll();
    public T getByID(String id);
}
