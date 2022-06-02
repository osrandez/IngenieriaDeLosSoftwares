public class Notas {
    public double calculaNota(double p1, double p2, double p3, double teoria) throws ExcepcionNumeroInvalido{
        if(p1 < 0  ||  p2 < 0  ||  p2 < 0  ||  teoria < 0){
            throw new ExcepcionNumeroInvalido("las notas no pueden ser negativas");
        }
        if(p1 > 2){
            throw new ExcepcionNumeroInvalido("la nota de p1 no puede ser superior a 2");
        }
        if(p2 > 3){
            throw new ExcepcionNumeroInvalido("la nota de p2 no puede ser superior a 3");
        }
        if(p3 > 5){
            throw new ExcepcionNumeroInvalido("la nota de p3 no puede ser superior a 5");
        }
        if(teoria > 10){
            throw new ExcepcionNumeroInvalido("la nota del teorico no puede ser superior a 10");
        }
        //quiero manejar errores adecuadamente, pero solo los rangos, no caracteres no esperados

        return (p1+p2+p3+teoria)/2;
    }
}

class ExcepcionNumeroInvalido extends Exception{
    private String msg;

    ExcepcionNumeroInvalido(String msg){
        super();
        this.msg = msg;
    }

    public String getMessage(){
        return this.msg;
    }
}
