package Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*@author Andrei*/
public class Data implements Serializable {

    public List<Contact> contacteAll = new ArrayList<>();

    public boolean stergeContactAll(Contact c) {
        for (int i = 0; i < contacteAll.size(); i++) {
            Contact cCurrent = contacteAll.get(i);
            if (cCurrent.equals(c)) {
                contacteAll.remove(i);
                return true;
            }
        }
        return false;
    }

    public void adaugaInContacteAll(Contact c) {
        contacteAll.add(c);
    }

    public void populeazaContacteAll() {
        contacteAll.add(new Contact("Olteanu", "Andrei", "21-12-1994", "0729433586"));
        contacteAll.add(new Contact("Costin", "Marin", "13-10-1990", "0729433584"));
        contacteAll.add(new Contact("Vasilica", "Vasile", "04-04-2002", "0729433532"));
        contacteAll.add(new Contact("Bejan", "Adrian", "11-02-1985", "0729433654"));
        contacteAll.add(new Contact("Banica", "Cristian", "22-12-1994", "0729113654"));
        contacteAll.add(new Contact("Albu", "Alexandru", "07-06-1989", "0246433654"));
    }

    public void modificaContactIn_contacteAll(Contact cSelectat, Contact cModificat) {
        for (int i = 0; i < contacteAll.size(); i++) {
            Contact cCurrent = contacteAll.get(i);
            if (cCurrent.equals(cSelectat)) {
                contacteAll.set(i, cModificat);
            }
        }
    }

}
