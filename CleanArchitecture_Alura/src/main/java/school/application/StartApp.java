package school.application;

import school.domain.student.FactoryStudent;
import school.domain.student.Student;

public class StartApp {

    public static void main(String[] args) {

        FactoryStudent factory = new FactoryStudent();
        Student student = factory.withCpfEmailName("Jose Augusto", "109.878.323-99","guto@gmail.com")
                .withPhoneDdd("35", "988773344")
                .withPhoneDdd("35", "34223488")
                .create();

        System.out.println(student);

    }
}
