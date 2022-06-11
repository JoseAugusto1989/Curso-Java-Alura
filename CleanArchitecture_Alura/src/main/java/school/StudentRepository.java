package school;

import school.domain.student.CPF;
import school.domain.student.Student;

import java.util.List;

public interface StudentRepository {

    void enroll(Student student);

    Student searchForCPF(CPF cpf);

    List<Student> listAllEnrolledStudent();


}
