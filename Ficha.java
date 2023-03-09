public class Ficha
{
    int num1;
    int num2;
    int estado;
    
    public Ficha()
    {
        num1 = 0;
        num2 = 0; 
        estado = 2;
    }
    
    public void setEstadoMostrar(){
            estado = 1;
    }
    public void setEstadoOcultar(){
            estado = 2;
    }
    public void setEstadoEliminar(){
            estado = 3;
    }
    public int getEstado(){
        return estado;
    }
    
    public String mostrarFicha(){
        if(estado == 1){
        return "   [" + num1 + " | " + num2 + "]   ";
        }
        if(estado == 2){
        return "   [" + "- " + "|" + " -" + "]   ";
        }
        if(estado == 3){
        return "   [" + "x " + "|" + " x" + "]   ";
        }
        else{
        return "error";
        }
    }
    
    
    
    public void setNum1(int num1){
        this.num1 = num1;
    }
    
    public void setNum2(int num2){
        this.num2 = num2;
    }
    
    public int getNum1(){
        return num1;
    }
    
    public int getNum2(){
        return num2;
    }
}
