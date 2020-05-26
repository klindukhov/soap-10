package Models;

import java.util.Date;

public class Filter {
    private String surname;
    private Date birthdate;

    public Filter() {
    }

    public Filter(String surname, Date birthdate) {
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
