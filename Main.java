/**
 * Universidad del Valle de Guatemala
 * Autor: Joel Nerio
 * Fecha: 20 de enero de 2025
 */
import java.util.Scanner; //importar la clase Scanner para recibir datos del usuario

public class Main{
    public   static void main(String []args){   /*se  declara como tal el main */

        Licuadora licuadora = new Licuadora(false, false, 0); /*se crea un objeto de tipo licuadora  caracteristicas por defecto*/
        Scanner scanner = new Scanner(System.in); /*se crea un objeto de tipo scanner para recibir datos del usuario*/
        boolean a= true;
        
        while (a!=false) {
            System.out.println("-------Bienvenido a Licuadora Virtual-------"); //menu
            System.out.println("1. Encender la licuadora");  
            System.out.println("2. Llenar licuadora para Licuar");
            System.out.println("3. Aumentar Velocidad");
            System.out.println("4. Consultar Velocidad de  licuado");
            System.out.println("5. Consultar Llenado");
            System.out.println("6. Vaciar");
            System.out.println("7. Apagar");
            System.out.println("8. Salir");
            System.out.println("Ingrese una opcion: ");
            int opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    if (licuadora.consultarLlenado()==true && licuadora.getEncendido()==false) {
                        licuadora.encender();
                        System.out.println("se ha encendido la licuadora");
                    }else{
                        System.out.println("La licuadora ya esta encendida o no esta llena");
                    }
                    break;
                case 2:
                    System.out.println("por favor ingrese de que quiere que se llena la licuadora");
                    String llenado = scanner.next();
                    if (licuadora.consultarLlenado()==false) {
                        licuadora.llenar();
                        System.out.println("se ha llenado la licuadora con "+llenado);
                    }else{
                        System.out.println("La licuadora ya esta llena");
                    }
                    break;
                case 3:
                    if(licuadora.getEncendido() == true && licuadora.consultarLlenado()==true){
                        licuadora.aumentarVelocidad();
                        System.out.println("Se ha aumentado la velocidad");
                    } else {
                        System.out.println("La licuadora no esta encendida o no esta llena");
                    }
                    System.out.println("Se ha aumentado la velocidad");
                    break;
                case 4:
                    System.out.println("La velocidad actual es: "+licuadora.consultarVelocidad());
                    break;
                case 5:
                    if (licuadora.consultarLlenado()==true) {
                        System.out.println("La licuadora esta llena");
                    }else{
                        System.out.println("La licuadora esta vacia");
                    }
                    break;
                case 6:
                    if (licuadora.consultarLlenado()==true) {
                        licuadora.vaciar();
                        System.out.println("Se ha vaciado la licuadora");
                    }else{
                        System.out.println("La licuadora ya esta vacia");
                    }
                    break;
                case 7:
                    if(licuadora.getEncendido()==true && licuadora.consultarLlenado()==false){
                        licuadora.apagar();
                        System.out.println("Se ha apagado la licuadora");
                    }else{
                        System.out.println("La licuadora ya esta apagada o tienes algo aun adentor de la licuadora");
                    }
                    break;
                case 8:
                    a=false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }//switch
        }//while
   }
   //main
}
//clase

