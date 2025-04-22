import org.junit.jupiter.api.*;

public class JUnitExamples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll()");
    }


    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach()");
    }
    @Test
    void firstTest() {
        System.out.println("Here is the firstTest()");
    }
    @Test
    void secondTest() {
        System.out.println("Here is the secondTest()");
    }


    @AfterAll
    static void afterAll() {
        System.out.println("afterAll()");
    }


    @AfterEach
    void afterEach() {
        System.out.println("afterEach()");
    }
}
