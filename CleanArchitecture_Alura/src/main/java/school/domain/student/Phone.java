package school.domain.student;

import java.util.List;

public class Phone {

    private String ddd;
    private String phone;


    public Phone(String ddd, String phone) {
        if (ddd == null || phone == null) {
            throw new IllegalArgumentException("DDD and number phone are required");
        }

        if (!ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("Invalid DDD");
        }

        if (!phone.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.ddd = ddd;
        this.phone = phone;
    }

    public String getDdd() {
        return ddd;
    }
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public List<Phone> getPhones() {
        return getPhones();
    }

    @Override
    public String toString() {
        return "PHONE: " +
                ddd +
                " " + phone;
    }
}
