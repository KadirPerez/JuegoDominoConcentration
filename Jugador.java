
public class Jugador
{   
    private int posicion1;
    private int posicion2;
    
    public Jugador()
    {
        posicion1 = 0;
        posicion2 = 0;
    }
    
    public void setPosiciones(int posicion1, int posicion2){
        this.posicion1 = posicion1;
        this.posicion2 = posicion2;
    }
    
    public int  getPosicion1(){
        return posicion1;
    }
    
    public int  getPosicion2(){
        return posicion2;
    }
}
