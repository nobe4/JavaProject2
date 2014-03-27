package Controller;

import java.util.HashMap;

/**
 * Created by padawan on 3/26/14.
 */
public class Collection_Controller<Custom_Object> {
    // generic hashmap from example : http://stackoverflow.com/questions/6954509/why-i-cant-create-a-map-of-string-and-generic-object
    private HashMap<Integer,Custom_Object> params = new HashMap<Integer, Custom_Object>();

    public Collection_Controller() {}

    public boolean add(int id, Custom_Object o) throws Custom_Exception {
        if(params.get(id) != null) throw new Custom_Exception("Id already in the map");
        this.params.put(id, o);
        return true;
    }

    public Custom_Object get(int id) throws Custom_Exception {
        Custom_Object ret = params.get(id);
        if(ret == null) throw new Custom_Exception("Id not found in the map");
        return ret;
    }
}
