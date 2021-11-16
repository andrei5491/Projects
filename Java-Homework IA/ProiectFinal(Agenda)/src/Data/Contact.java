package Data;

import java.io.Serializable;
import java.util.Objects;

/* @author Andrei*/
public class Contact implements Serializable {

    private String nume;
    private String prenume;
    private String dataNastere;
    private String nrTel;

    public Contact(String nume, String prenume, String dataNastere, String nrTel) {
        if (nume == null || nume.length() <= 2 || !nume.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Nume invalid");
        }
        if (prenume == null || prenume.length() <= 2 || !prenume.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Prenume invalid");
        }
        if (!dataNastere.matches("\\d\\d.\\d\\d.\\d\\d\\d\\d") || !(Integer.parseInt(dataNastere.substring(0, 2)) <= 31) || !(Integer.parseInt(dataNastere.substring(3, 5)) <= 12) || !(Integer.parseInt(dataNastere.substring(6)) <= 2021)) {
            throw new IllegalArgumentException("Data invalida! Format: ZZ.LL.AAAA\n\nExemplu: 12.03.1998");
        }

        if (!((nrTel.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d")) && (nrTel.substring(0, 2).equals("07") || nrTel.substring(0, 2).equals("02") || nrTel.substring(0, 2).equals("03")))) {
            throw new IllegalArgumentException("Telefon invalid! \n Numarul trebuie sa contina 10 cifre si sa inceapa cu 07 , 02 sau 03");
        }

        this.nume = nume;
        this.prenume = prenume;
        this.dataNastere = dataNastere;
        this.nrTel = nrTel;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contact other = (Contact) obj;
        if (!Objects.equals(this.nume, other.nume)) {
            return false;
        }
        if (!Objects.equals(this.prenume, other.prenume)) {
            return false;
        }
        return true;
    }

    public static Contact getInstance(String nume, String prenume, String dataNastere, String nrTel) {

        if ((nume == null || nume.length() <= 2 || !nume.matches("[a-zA-Z]+"))
                && (prenume == null || prenume.length() <= 2 || !prenume.matches("[a-zA-Z]+"))
                && (!dataNastere.matches("\\d\\d.\\d\\d.\\d\\d\\d\\d") || !(Integer.parseInt(dataNastere.substring(0, 2)) <= 31) || !(Integer.parseInt(dataNastere.substring(3, 5)) <= 12) || !(Integer.parseInt(dataNastere.substring(6)) <= 2021))
                && (!((nrTel.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d")) && (nrTel.substring(0, 2).equals("07") || nrTel.substring(0, 2).equals("02") || nrTel.substring(0, 2).equals("03"))))) {

            return null;
        }
        return new Contact(nume, prenume, dataNastere, nrTel);
    }

    public Contact(Contact contact) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getDataNastere() {
        return dataNastere;
    }

    public String getNrTel() {
        return nrTel;
    }

    @Override
    public String toString() {
        return nume + " " + prenume + " , " + dataNastere + " , " + nrTel;
    }

}
