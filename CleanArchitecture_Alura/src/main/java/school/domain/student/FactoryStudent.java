package school.domain.student;

public class FactoryStudent {

    private Student student;


    public FactoryStudent withCpfEmailName(String name, String cpf, String email) {
        this.student = new Student(new CPF(cpf), name, new Email(email));
        return this;
    }

    public FactoryStudent withPhoneDdd(String ddd, String phone) {
        this.student.addPhone(ddd, phone);
        return this;
    }

    public Student create() {
        return this.student;
    }
}
