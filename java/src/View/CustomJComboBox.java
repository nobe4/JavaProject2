package View;

import javax.swing.*;

/**
 * Created by padawan on 4/4/14.
 */
public class CustomJComboBox extends JComboBox {

    private Object[][] fields;

    public void populate(Object[][] fields, int id) {
        this.removeAllItems();
        this.fields = fields;
        for (int i = 0; i < this.fields.length; i++) {
            this.addItem(this.fields[i][1]);
        }
        if (-1 == this.findIdIndex(id)) this.setSelectedIndex(0);
        else this.setSelectedIndex(this.findIdIndex(id));
    }

    public int findIdIndex(int id) {
        for (int i = 0; i < this.fields.length; i++) {
            if (id == this.fields[i][0]) return i;
        }
        return -1;
    }

    public int getSelectedId() {
        return (Integer) fields[this.getSelectedIndex()][0];
    }


}
