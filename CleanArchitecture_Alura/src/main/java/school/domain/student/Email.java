package school.domain.student;

public class Email {

    private String address;


    // construtor para fazer uma validação de email
    public Email(String address) {
        if (address == null ||
                !address.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Invalid Email");
        }
        this.address = address;

    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return ", EMAIL: " +
                address +
                ',';
    }
}
