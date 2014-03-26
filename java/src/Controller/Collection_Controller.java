package Controller;

import java.util.HashMap;

/**
 * Created by padawan on 3/26/14.
 */
public class Collection_Controller<Custom_Object> {
    // generic hashmap from example : http://stackoverflow.com/questions/6954509/why-i-cant-create-a-map-of-string-and-generic-object
    private HashMap<Integer,Custom_Object> params = new HashMap<Integer, Custom_Object>();

    public Collection_Controller() {}

    public boolean add(int id, Custom_Object o){
        this.params.put(id, o);
        return true;
    }

    public Custom_Object get(int id) throws Custom_Exceptions{
        Custom_Object ret = params.get(id);
        if(ret == null) throw new Custom_Exceptions("Id not found in the map");
        return ret;
    }
}
