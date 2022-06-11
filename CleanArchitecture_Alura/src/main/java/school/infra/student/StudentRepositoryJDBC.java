package school.infra.student;

import school.StudentRepository;
import school.domain.student.CPF;
import school.domain.student.Email;
import school.domain.student.Phone;
import school.domain.student.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentRepositoryJDBC implements StudentRepository {


    private Connection conn;

    public StudentRepositoryJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void enroll(Student student) {

        try {
            String sql = "INSERT INTO STUDENT VALUES(?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, student.getCpf());
            ps.setString(2, student.getName());
            ps.setString(3, student.getEmail());
            ps.execute();

            sql = "VALUES INTO PHONE VALUES(?, ?)";
            ps = conn.prepareStatement(sql);
            for (Phone phone : student.getPhones()) {
                ps.setString(1, phone.getDdd());
                ps.setString(2, phone.getPhone());
                ps.execute();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }

    @Override
    public Student searchForCPF(CPF cpf) {
        try {
            String sql = "SELECT id, name, email, FROM STUDENT WHERE cpf = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cpf.getNumber());

            ResultSet rs = ps.executeQuery();
            boolean finded = rs.next();
            if (!finded) {
                throw new StudentNotFind(cpf);
            }

            String name = rs.getString("name");
            Email email = new Email(rs.getString("email"));
            Student find = new Student(cpf, name, email);

            Long id = rs.getLong("id");
            sql = "SELECT ddd, phoneNumber FROM PHONE WHERE student_id = ?";
            ps = conn.prepareStatement(sql);
            ps.setLong(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                String number = rs.getString("phoneNumber");
                String ddd = rs.getString("ddd");
            }

        } catch {

        }
        return null;
    }

    @Override
    public List<Student> listAllEnrolledStudent() {
        return null;
    }
}
