package Controller;

import Model.Editable;

import java.util.HashMap;

/**
 * Created by padawan on 3/26/14.
 */
public class Collection_Controller {
    // generic hashmap from example : http://stackoverflow.com/questions/6954509/why-i-cant-create-a-map-of-string-and-generic-object
    private HashMap<Integer, Model.Editable> params = new HashMap<Integer, Editable>();
    private Class type;

    public Collection_Controller(Class t) {
        this.type = t;
    }

    public boolean add(int id, Editable o) throws Custom_Exception {
        if(o.getClass() != type) throw new Custom_Exception("Object not the rigth type");
        if(params.get(id) != null) throw new Custom_Exception("Id already in the map");
        this.params.put(id, o);
        return true;
    }

    public Editable get(int id) throws Custom_Exception {
        Editable o = params.get(id);
        if(o == null) throw new Custom_Exception("Id not found in the map");
        return o;
    }

    // multiple set definition

    public <Custom_Type> Editable set(int id, String key, Custom_Type value) throws Custom_Exception {
        Editable o = this.get(id);
        o.set(key, value);
        return o;
    }
}
