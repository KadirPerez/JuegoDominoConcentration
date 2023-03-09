public class JuegoDomino  
{
    private Tablero tableroJuego;
    private Jugador jugadores[];
    private int numeroJugadores;
    
    public JuegoDomino()
    {
        numeroJugadores = 2;
        jugadores = new Jugador[numeroJugadores];
        for (int i = 0; i< numeroJugadores; i++){
            jugadores[i] = new Jugador();
        }
        tableroJuego = new Tablero();
    }
    
    public int getJugadores(){
        return numeroJugadores;
    }
    
    public void preguntarPosiciones(int jugador, int x1, int y1, int x2, int y2){
        int posicion1 = ((6 * y1) - (6 - x1)) - 1;
        int posicion2 = ((6 * y2) - (6 - x2)) - 1;
        jugadores[jugador].setPosiciones(posicion1, posicion2); 
    }
    
    public void mostrarTablero(){
        tableroJuego.mostrarTablero();
    }
    
    public void mostrarPosiciones(int jugador){
        tableroJuego.mostrarFichaDomino(jugadores[jugador].getPosicion1());
        tableroJuego.mostrarFichaDomino(jugadores[jugador].getPosicion2());
    }
    
    public void ocultarPosiciones(int jugador){
        tableroJuego.ocultarFichaDomino(jugadores[jugador].getPosicion1());
        tableroJuego.ocultarFichaDomino(jugadores[jugador].getPosicion2());
    }
    
    public void eliminarPosiciones(int jugador){
        tableroJuego.eliminarFichaDomino(jugadores[jugador].getPosicion1());
        tableroJuego.eliminarFichaDomino(jugadores[jugador].getPosicion2());
    }
    
    public int comprobar(int jugador){
         
        int num = 
        tableroJuego.getNum1Ficha(jugadores[jugador].getPosicion1())+ 
        tableroJuego.getNum2Ficha(jugadores[jugador].getPosicion1()) + 
        tableroJuego.getNum1Ficha(jugadores[jugador].getPosicion2()) + 
        tableroJuego.getNum2Ficha(jugadores[jugador].getPosicion2());
        
        if(num == 12){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    public void aumentarMarcador(int jugador){
        tableroJuego.aumentarMarcador(jugador);
    }
    
    public void disminuirMarcador(int jugador){
        tableroJuego.disminuirMarcador(jugador);
    }
    
    public int encontrarPosibles12(){
        int posibles = tableroJuego.encontrarPosibles12();
        return posibles;
    }
}
