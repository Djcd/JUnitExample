import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person cut;

    @BeforeEach
    void setup() {
        cut = new Person();
    }

    @Test
    void getFirstname_test() {
        cut.setFirstname("Sarah");

        var result = cut.getFirstname();

        assertEquals("Sarah", result);
        assertNotEquals("", result);
        assertNotEquals(null, result);
    }

    @Test
    void getLastName_test() {
        cut.setLastname("Smith");

        var result = cut.getLastname();

        assertEquals("Smith", result);
        assertNotEquals("", result);
        assertNotEquals(null, result);
    }

    // ...
    @AfterEach
    void teardown() {
        cut = null;
    }
}