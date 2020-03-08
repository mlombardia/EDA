import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TimerTesterTest {

    @BeforeAll
    static void before(){
        System.out.println("Arrancan TODOS los tests");
    }

    @AfterAll
    static void after(){
        System.out.println("Terminan TODOS los tests");
    }

    @BeforeEach
    static void inbet(){
        System.out.println("Arranca UN test");
    }

    @AfterEach
    static void outbet(){
        System.out.println("Termina UN test");
    }

    @Test
    void main() {
        assertEquals(3, 2+1);
    }

    @Test
    void another(){
        assertEquals(3, 3+4);
    }
}