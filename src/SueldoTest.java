import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SueldoTest {
    Sueldo sueldo = new Sueldo();

    @Test
    void testBrutoC1() {
        double result = sueldo.calculaBruto('F', 0);
        Assertions.assertEquals(1000, result);
    }

    @Test
    void testBrutoC2() {
        double result = sueldo.calculaBruto('F', 5000);
        Assertions.assertEquals(1250, result);
    }

    @Test
    void testBrutoC3() {
        double result = sueldo.calculaBruto('E', 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    void testBrutoC4() {
        double result = sueldo.calculaBruto('E', 3000);
        Assertions.assertEquals(450, result);
    }

    @Test
    void testBrutoC5() {
        double result = sueldo.calculaBruto('E', 5000);
        Assertions.assertEquals(850, result);
    }

    @Test
    void testBrutoC6() {
        double result = sueldo.calculaBruto('E', 7000);
        Assertions.assertEquals(1350, result);
    }

    @Test
    void testRetC1() {
        double result = sueldo.calculaRet('F', 1200);
        Assertions.assertEquals(120, result);
    }

    @Test
    void testRetC2() {
        double result = sueldo.calculaRet('F', 12000);
        Assertions.assertEquals(1800, result);
    }

    @Test
    void testRetC3() {
        double result = sueldo.calculaRet('E', 12000);
        Assertions.assertEquals(600, result);
    }

}
