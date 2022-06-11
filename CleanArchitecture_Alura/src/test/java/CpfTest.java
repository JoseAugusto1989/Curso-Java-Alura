import org.junit.jupiter.api.Test;
import school.domain.student.CPF;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CpfTest {

    @Test
    void numberCpfInvalid() {
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF("12345678900"));
    }

    @Test
    void numberCpfValided() {
        String number = "123.456.789-00";
        CPF cpf = new CPF(number);
        assertEquals(number, cpf.getNumber());
    }
}
