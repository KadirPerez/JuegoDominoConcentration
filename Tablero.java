
public class Tablero 
{
    private Domino dominoJuego;
    private Marcador marcadorJuego;
    
    public Tablero()
    {
        marcadorJuego = new Marcador();
        dominoJuego = new Domino();
        dominoJuego.generarDomino();
        dominoJuego.revolverFichas();
    } 
    
    public void mostrarFichaDomino(int posicion){
        dominoJuego.mostrarFicha(posicion);
    }
    
    public void ocultarFichaDomino(int posicion){
        dominoJuego.ocultarFicha(posicion);
    }
    
    public void eliminarFichaDomino(int posicion){
        dominoJuego.eliminarFicha(posicion);
    }
    
    public void mostrarTablero(){
        for(int i = 0; i < 30; i++){
            System.out.println();
        }
        dominoJuego.mostrarDomino();
        System.out.print("\n\n");
        marcadorJuego.mostrarMarcador();
    } 
    
    public int getNum1Ficha(int posicion){
        return dominoJuego.getNum1Ficha(posicion);
    }
    
    public int getNum2Ficha(int posicion){
        return dominoJuego.getNum2Ficha(posicion);
    }
    
    public void aumentarMarcador(int jugador){
        marcadorJuego.aumentarMarcador(jugador);
    }
    
    public void disminuirMarcador(int jugador){
        marcadorJuego.disminuirMarcador(jugador);
    }
    
    public int encontrarPosibles12(){
        int posibles = dominoJuego.encontrarPosibles12();
        return posibles;
    }
}
