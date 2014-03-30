package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by padawan on 3/27/14.
 */
public class JSObject {
    private HashMap<String, Object> datas = new HashMap<String, Object>();


    public JSObject(String... fields) {
        for(int i  = 0; i < fields.length; i ++){
            datas.put(fields[i], null);
        }
    }

    public JSObject(Object... fields) {
        for (int i = 0; i < fields.length / 2; i++) {
            datas.put(fields[i].toString(), fields[i + 1]);
        }
    }

    public void setValues(Object... values) {
        for (int i = 0; i < datas.size(); i++) {
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

    public ArrayList<Object> getValues(ArrayList<String> askedField) {
        ArrayList<Object> values = new ArrayList<Object>();
        for (String field : askedField) {
            for (Map.Entry<String, Object> entry : datas.entrySet()) {
                if (entry.getKey() == field) {
                    values.add(entry.getValue());
                }
            }
        }
        return values;
    }
}
