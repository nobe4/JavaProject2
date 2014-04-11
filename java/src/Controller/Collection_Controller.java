
package Controller;

import Model.JSObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Collection_Controller {
    //generic hashmap from example : http://stackoverflow.com/questions/6954509/why-i-cant-create-a-map-of-string-and-generic-object
    private HashMap<Integer, JSObject> params = new HashMap<Integer, JSObject>();
    private Class type;
    static private int nextId = 0;

    static public int getNextId() {
        return nextId;
    }

    public Collection_Controller(Class t) {
        this.type = t;
    }

    public boolean add(int id, JSObject o) throws Custom_Exception {
        if (o.getClass() != type) throw new Custom_Exception("Object not the right type");
        if (params.get(id) != null) throw new Custom_Exception("Id already in the map");

        if (id == -1) {
            id = nextId++;
        } else {
            if (id > nextId) nextId = id + 1;
        }

        this.params.put(id, o);
        System.out.println("Successfully added new item in map");
        return true;
    }

    public JSObject remove(int id) throws Custom_Exception {
        JSObject e = params.get(id);
        if (params.get(id) == null) throw new Custom_Exception("Object not in the map");
        this.params.remove(id);
        return e;
    }

    public JSObject get(int id) throws Custom_Exception {
        JSObject o = params.get(id);
        if (o == null) throw new Custom_Exception("Id not found in the map");
        return o;
    }

    // multiple set definition
    public <Custom_Type> JSObject set(int id, String key, Custom_Type value) throws Custom_Exception {
        JSObject o = this.get(id);
        o.set(key, value);
        return o;
    }

    public String[] exportFields() {
        if (!params.entrySet().iterator().hasNext()) return new String[]{"Empty", "Set"};
        return params.entrySet().iterator().next().getValue().getFieldsName().toArray(new String[]{});
    }

    public Object[][] exportDatas() {
        ArrayList<Object[]> datas = new ArrayList<Object[]>();

        for (Map.Entry<Integer, JSObject> entry : params.entrySet()) {
            datas.add(entry.getValue().getValues(entry.getKey()).toArray());
        }
        return datas.toArray(new Object[][]{});
    }

    public Object[][] exportDatas(ArrayList<String> askedField) {
        ArrayList<Object[]> datas = new ArrayList<Object[]>();

        for (Map.Entry<Integer, JSObject> entry : params.entrySet()) {
            datas.add(entry.getValue().getValues(askedField, entry.getKey()).toArray());
        }

        if (0 == datas.size()) {
            Object[] a = new Object[askedField.size()];
            for (int i = 0; i < askedField.size(); i++) {
                a[i] = "Sample ";
            }
            datas.add(a);
        }


        return datas.toArray(new Object[][]{});
    }

    public Object[][] exportDatas(String[] askedField) {
        return this.exportDatas(new ArrayList<String>(Arrays.asList(askedField)));
    }
}
