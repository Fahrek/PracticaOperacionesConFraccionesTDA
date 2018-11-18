
package pruebafraccion;

public class PruebaFraccion 
{
    public static void main(String[] args) 
    {
        PruebaFraccion obj = new PruebaFraccion();
        obj.run();
    }    
    
    public void run()
    {
        // TODAS LAS PRUEBAS VAN AQUÍ
        
        TDAFraccion f1 = new TDAFraccion(1, 2);
        TDAFraccion f2 = new TDAFraccion(1, 2);
        
        TDAFraccion ejemploProducto;
        TDAFraccion ejemploSuma;
        TDAFraccion ejemploResta;
        TDAFraccion ejemploDivision;
        
        ejemploSuma     = f1.SumarFraccion(f2);
        ejemploResta    = f1.RestarFraccion(f2);
        ejemploProducto = f1.ProductoFraccion(f2);
        ejemploDivision = f1.DivirFraccion(f2);
        
        ejemploSuma.mostrarFraccion("Suma de fracciones: ");
        ejemploResta.mostrarFraccion("Resta de fracciones: ");
        ejemploProducto.mostrarFraccion("Producto de fracciones: ");
        ejemploDivision.mostrarFraccion("Division de fracciones: ");
    }
}
