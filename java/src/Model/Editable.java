package Model;

/**
 * Created by padawan on 3/27/14.
 */
public interface Editable {
    public <Custom_Type> boolean set(String key, Custom_Type value);
}
