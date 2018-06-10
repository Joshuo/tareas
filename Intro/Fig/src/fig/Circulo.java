package fig;

public class Circulo extends Fig{
    private int r;
    
    public Circulo(int r, int x, int y){
        super(x, y);
        this.r = r;
    }
    public int getRadio(){
        return this.r;
    }
    public void setRadio(int r){
        this.r = r;
    }
    public double calcularArea(){
        return 3.14 * (this.r*this.r);
    }
}
