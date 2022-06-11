package school.domain.student;

public class CPF {

    private String number;


    public CPF(String number) {
        if (number == null ||
                !number.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("Invalid CPF");
        }
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "CPF: " +
                number +
                ',';
    }
}
