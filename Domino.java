
public class Domino
{
    private int numeroMayor;
    private int cantidadFichas;
    private Ficha domino[];

    public Domino()
    {
        numeroMayor = 6;
        for(int i = numeroMayor +1; i >= 1; i--){
            cantidadFichas = cantidadFichas + i;
        }
        
        domino = new Ficha[cantidadFichas];
        for(int i = 0; i < cantidadFichas; i++){
        domino[i] = new Ficha();
        } 
    }
    
    public void mostrarFicha(int posicion){
        domino[posicion].setEstadoMostrar();
    }
    
    public void ocultarFicha(int posicion){
        domino[posicion].setEstadoOcultar();
    }
    
    public void eliminarFicha(int posicion){
        domino[posicion].setEstadoEliminar();
    }
    
    public int getNum1Ficha(int posicion){
        return domino[posicion].getNum1();
    }
    
    public int getNum2Ficha(int posicion){
        return domino[posicion].getNum2();
    }
    
    public void generarDomino(){
        int contador = 0;
        for(int i = 0; i <= numeroMayor; i++){
            for (int j = i; j <= numeroMayor; j++){
                domino[contador].setNum2(j);
                domino[contador].setNum1(i);
                contador = contador + 1;
            }
        }
    }
    
    public void revolverFichas(){
        Ficha aux = new Ficha();
        for(int i = 0; i < cantidadFichas; i++){
            int rdm = (int)(Math.random()*cantidadFichas);
            aux = domino[i];
            domino[i] = domino[rdm];
            domino[rdm] = aux;
        }
    }
   
    public void mostrarDomino(){
         int contador = 1;
        
        System.out.print("       1");
        for (int i = 2; i<=numeroMayor;i++){
            System.out.print("            "+i);
        }
        System.out.print("\n\n");
        System.out.print(contador);
        for(int i = 0; i < cantidadFichas; i++){
                String ficha = domino[i].mostrarFicha();
                System.out.print(ficha);
            
            int bandera = (i+1)%numeroMayor;
            if (bandera == 0){
                System.out.println();
                System.out.println();
                contador = contador + 1;
                System.out.print(contador);
            }
        }        
    }
    
    public int encontrarPosibles12(){
        int restante;
        int contador = 0;
        
        for(int i = 0; i < cantidadFichas; i++){
                
            
            if(domino[i].getEstado() != 3){
                restante =12-(domino[i].getNum1() + domino[i].getNum2());
                for(int j = 0; j< cantidadFichas; j++){
                    if(j != i && (domino[j].getNum1()+domino[j].getNum2()) == restante && domino[j].getEstado() != 3){
                        contador = contador + 1;
                    }
                }
            }
        }
        
        return contador/2;
    }
}
