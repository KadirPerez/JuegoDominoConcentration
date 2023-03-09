
public class Marcador
{
    private int cantidadJugadores;
    private int puntaje[];
    
    public Marcador()
    {
        cantidadJugadores = 2;
        puntaje = new int[cantidadJugadores];
        for(int i = 0; i < cantidadJugadores; i++){
            puntaje[i] = 0;
        }
    }
      
    public void aumentarMarcador(int jugador){
        puntaje[jugador] = puntaje[jugador] + 12;
    }
    
    public void disminuirMarcador(int jugador){
        puntaje[jugador] = puntaje[jugador] - 2;
    }
    
    public void mostrarMarcador(){
        System.out.print("MARCADOR\n\n");
        for(int i = 0; i < cantidadJugadores; i++){
    
            System.out.print("Jugador " + (i+1) + ": "+ puntaje[i] + "        ");
        }
        System.out.print("\n\n");
    }
}
