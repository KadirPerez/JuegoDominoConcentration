import java.util.Scanner;

public class Run
{
    
    public static void main (String [] args){
        Run juego = new Run();
        juego.run();
        
    }
    
    public void run(){
        Scanner leer = new Scanner(System.in);
        JuegoDomino juego = new JuegoDomino();
        int x1,y1,x2,y2,comprobacion;
        String stop;

        while(juego.encontrarPosibles12() != 0)
        {
            for(int i = 0; i < juego.getJugadores();i++){
                juego.mostrarTablero();
                System.out.print("Jugador " + (i+1) + "\nPrimera coordenada\nCoordenada en x: ");
                x1 = leer.nextInt();
                System.out.print("Coordenada en y: ");
                y1 = leer.nextInt();
                System.out.print("Segunda coordenada\nCoordenada en x: ");
                x2 = leer.nextInt();
                System.out.print("Coordenada en y: ");
                y2 = leer.nextInt();
                juego.preguntarPosiciones(i,x1,y1,x2,y2);
                
                juego.mostrarPosiciones(i);
                juego.mostrarTablero();
                
                comprobacion = juego.comprobar(i);
                
                if(comprobacion == 1){
                    juego.aumentarMarcador(i);
                    System.out.print("Acertaste, pulsa enter para continuar");
                    stop = leer.nextLine();
                    stop = leer.nextLine();
                    juego.eliminarPosiciones(i);
                }
                else{
                    juego.disminuirMarcador(i);
                    System.out.print("Error, pulsa enter para continuar");
                    stop = leer.nextLine();
                    stop = leer.nextLine();
                    juego.ocultarPosiciones(i);
                }
            }
        }
        

    }
}
