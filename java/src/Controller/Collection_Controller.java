package Controller;

/**
 * Created by padawan on 3/26/14.
 */
public class Collection_Controller {
   /* // generic hashmap from example : http://stackoverflow.com/questions/6954509/why-i-cant-create-a-map-of-string-and-generic-object
    private HashMap<Integer, Model.JSObject> params = new HashMap<Integer, JSObject>();
    private Class type;
    static private int nextId = 0;

    static public int getNextId(){return nextId;}

    public Collection_Controller(Class t) {
        this.type = t;
    }

    public boolean add(int id, JSObject o) throws Custom_Exception {
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

    public JSObject remove(int id) throws Custom_Exception {
        JSObject e = params.get(id);
        if(params.get(id) == null) throw new Custom_Exception("Object not in the map");
        this.params.remove(id);
        return e;
    }

    public JSObject get(int id) throws Custom_Exception {
        JSObject o = params.get(id);
        if(o == null) throw new Custom_Exception("Id not found in the map");
        return o;
    }

    // multiple set definition
    public <Custom_Type> JSObject set(int id, String key, Custom_Type value) throws Custom_Exception {
        JSObject o = this.get(id);
        o.set(key, value);
        return o;
    }

    public String[] exportFields(){
        return params.entrySet().iterator().next().getValue().getAttributes();
    }

    public Object[][] exportDatas(ArrayList<String> askedField) {
        ArrayList<ArrayList<String>> datas = new ArrayList<ArrayList<String>>();


        Iterator itDatas = params.entrySet().iterator();
        while (itDatas.hasNext()) {
         //   String[] values = params.get(((Map.Entry) itDatas.next()).getKey()).getValues();
       //     datas.add((ArrayList<String>) Arrays.asList(values));
            itDatas.next();
        }

        return new Object[][]{datas.toArray()};
    }*/
}
