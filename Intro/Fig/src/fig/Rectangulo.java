package fig;

public class Rectangulo extends Fig{
    private int alto;
    private int ancho;
    
    public Rectangulo(int alto, int ancho, int x, int y){
        super(x, y);
        this.alto = alto;
        this.ancho = ancho;
    }
    public int getAlto(){
        return this.alto;
    }
    public void setAlto(int alto){
        this.alto = alto;
    }
    public int getAncho(){
        return this.ancho;
    }
    public void setAncho(){
        this.ancho = ancho;
    }
    public int calcularArea(){
        return this.alto * this.ancho;
    }
    
}
