package pruebafraccion;

public class TDAFraccion 
{
    private float numerador;
    private float denominador;

    public TDAFraccion(float numerador, float denominador) {
        this.numerador   = numerador;
        this.denominador = denominador;
    }

    public float getNumerador() {
        return numerador;
    }
    
    public float getDenominador() {
        return denominador;
    }

    public void setNumerador(float numerador) {
        this.numerador = numerador;
    }
    
    public void setDenominador(float denominador) {
        this.denominador = denominador;
    }
    
    public TDAFraccion SumarFraccion(TDAFraccion obj)
    {
        TDAFraccion aux = new TDAFraccion((this.numerador   * obj.getDenominador()) + (this.denominador * obj.getNumerador()),
                                           this.denominador * obj.getDenominador());
        return (aux);
    }
    
    public TDAFraccion RestarFraccion(TDAFraccion obj)
    {
        TDAFraccion aux = new TDAFraccion((this.numerador   * obj.getDenominador()) - (this.denominador * obj.getNumerador()),
                                           this.denominador * obj.getDenominador());
        return (aux);
    }
    
    public TDAFraccion ProductoFraccion(TDAFraccion obj)
    {
        TDAFraccion aux = new TDAFraccion(this.numerador   * obj.getNumerador(), 
                                          this.denominador * obj.getDenominador());
        return (aux);
    }
    
    public TDAFraccion DivirFraccion(TDAFraccion obj)
    {
        TDAFraccion aux = new TDAFraccion(this.numerador   * obj.getDenominador(), 
                                          this.denominador * obj.getNumerador());
        return (aux);
    }
    
    public float DivisionReal()
    {
        return (this.numerador / this.denominador);
    }
    
    public void mostrarFraccion(String msj)
    {
        System.out.println(msj);
        System.out.println(this.numerador);
        System.out.println("---");
        System.out.println(this.denominador);
        System.out.println("");
    }
}
