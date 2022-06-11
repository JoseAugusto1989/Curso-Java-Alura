import org.junit.jupiter.api.Test;
import school.domain.student.Email;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

public class EmailTest {

    @Test
    void addressWithInvalidEmails() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("Invalid Email"));
    }

}
