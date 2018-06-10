package fig;

public class Fig {
    protected int x;
    protected int y;
    public Fig(){
    }
    public Fig(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        if (0 <= x && x <= 1023){
            this.x = x;}
        else{
        System.out.println("El valor de x debe ser mayor o igual a 0 y menor o igual a 1024");}}
    public int getY(){
        return this.y;}
    public void setY(int y){
        if (0 <= y && y <= 768){
            this.y = y;}
        else{
        System.out.println("El valor de y debe ser mayor o igual a 0 y menor o igual a 767");
        }}
    
    }