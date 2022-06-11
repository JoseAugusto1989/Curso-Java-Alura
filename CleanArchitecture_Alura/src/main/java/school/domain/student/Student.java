package school.domain.student;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private CPF cpf;
    private String name;
    private Email email;
    private List<Phone> phones = new ArrayList<>();


    public Student(CPF cpf, String name, Email email) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
    }

    public void addPhone(String ddd, String phone) {
        this.phones.add(new Phone(ddd, phone));

    }

    public String getCpf() {
        return getCpf();
    }
    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email.getAddress();
    }
    public void setEmail(Email email) {
        this.email = email;
    }
    public List<Phone> getPhones() {
        return phones;
    }
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Student " +
                cpf +
                " NAME: " + name +
                email +
                phones;
    }
}
