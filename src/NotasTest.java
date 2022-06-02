import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NotasTest {
    Notas notas = new Notas();

    @Test
    void testCalcularC1() throws ExcepcionNumeroInvalido {
        double result = notas.calculaNota(0, 0, 0, 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    void testCalcularC2() throws ExcepcionNumeroInvalido {
        double result = notas.calculaNota(2, 3, 5, 10);
        Assertions.assertEquals(10, result);
    }

    @Test
    void testCalcularC3() throws ExcepcionNumeroInvalido {
        double result = notas.calculaNota(1, 1.5, 2.5, 5);
        Assertions.assertEquals(5, result);
    }

    @Test
    void testCalcularE1() {
        try {
            double result = notas.calculaNota(-1, 0, 0, 0);
        }catch (ExcepcionNumeroInvalido e){
            String juan = e.getMessage();
            Assertions.assertEquals(juan,"las notas no pueden ser negativas");
        }
    }

    @Test
    void testCalcularE2() {
        try {
            double result = notas.calculaNota(3, 0, 0, 0);
        }catch (ExcepcionNumeroInvalido e){
            String juan = e.getMessage();
            Assertions.assertEquals(juan,"la nota de p1 no puede ser superior a 2");
        }
    }

    @Test
    void testCalcularE3() {
        try {
            double result = notas.calculaNota(-1, 0, 0, 0);
        }catch (ExcepcionNumeroInvalido e){
            String juan = e.getMessage();
            Assertions.assertEquals(juan,"las notas no pueden ser negativas");
        }
    }

    @Test
    void testCalcularE4() {
        try {
            double result = notas.calculaNota(0, 4, 0, 0);
        }catch (ExcepcionNumeroInvalido e){
            String juan = e.getMessage();
            Assertions.assertEquals(juan,"la nota de p2 no puede ser superior a 3");
        }
    }

    @Test
    void testCalcularE5() {
        try {
            double result = notas.calculaNota(-1, 0, 0, 0);
        }catch (ExcepcionNumeroInvalido e){
            String juan = e.getMessage();
            Assertions.assertEquals(juan,"las notas no pueden ser negativas");
        }
    }

    @Test
    void testCalcularE6() {
        try {
            double result = notas.calculaNota(0, 0, 6, 0);
        }catch (ExcepcionNumeroInvalido e){
            String juan = e.getMessage();
            Assertions.assertEquals(juan,"la nota de p3 no puede ser superior a 5");
        }
    }

    @Test
    void testCalcularE7() {
        try {
            double result = notas.calculaNota(-1, 0, 0, 0);
        }catch (ExcepcionNumeroInvalido e){
            String juan = e.getMessage();
            Assertions.assertEquals(juan,"las notas no pueden ser negativas");
        }
    }

    @Test
    void testCalcularE8() {
        try {
            double result = notas.calculaNota(0, 0, 0, 11);
        }catch (ExcepcionNumeroInvalido e){
            String juan = e.getMessage();
            Assertions.assertEquals(juan,"la nota del teorico no puede ser superior a 10");
        }
    }

}

