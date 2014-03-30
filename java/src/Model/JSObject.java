package Model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by padawan on 3/27/14.
 */
public class JSObject {
    private HashMap<String, Object> datas = new HashMap<String, Object>();

    /**
     * Constructe a default datas hashmap with fields name given in parameters
     * @param fields the names of the fields
     */
    public JSObject(ArrayList<String> fields) {
        for(int i  = 0; i < fields.size(); i ++){
            datas.put(fields.get(i), null);
        }
    }

    public Object get(String field){
        return datas.get(field);
    }

    public void set(String field, Object value){
        datas.remove(field);
        datas.put(field,value);
    }

    public ArrayList<String> getFieldsName(){
        ArrayList<String> fieldsNames = new ArrayList<String>();
        for(String key : datas.keySet()){
            fieldsNames.add(key);
        }
        return fieldsNames;
    }

    public ArrayList<Object> getValues(){
        ArrayList<Object> values = new ArrayList<Object>();
        for(Object value : datas.values()){
            values.add(value);
        }
        return values;
    }
}
