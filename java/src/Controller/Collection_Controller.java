package Controller;

import Model.Editable;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by padawan on 3/26/14.
 */
public class Collection_Controller {
    // generic hashmap from example : http://stackoverflow.com/questions/6954509/why-i-cant-create-a-map-of-string-and-generic-object
    private HashMap<Integer, Model.Editable> params = new HashMap<Integer, Editable>();
    private Class type;
    static private int nextId = 0;

    static public int getNextId(){return nextId;}

    public Collection_Controller(Class t) {
        this.type = t;
    }

    public boolean add(int id, Editable o) throws Custom_Exception {
        if(o.getClass() != type) throw new Custom_Exception("Object not the right type");
        if(params.get(id) != null) throw new Custom_Exception("Id already in the map");

        if(id == -1){
            id = nextId ++;
        }else{
            if(id > nextId) nextId = id + 1;
        }

        this.params.put(id, o);
        System.out.println("Successfully added new item in map");
        return true;
    }

    public Editable remove(int id) throws Custom_Exception {
        Editable e = params.get(id);
        if(params.get(id) == null) throw new Custom_Exception("Object not in the map");
        this.params.remove(id);
        return e;
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

    public String[] exportFields(){
        ArrayList<String> fields = new ArrayList<String>();

        Field[] declaredFields =  type.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            fields.add(declaredFields[i].getName());
        }

        return fields.toArray(new String[fields.size()]);
    }

}
