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
                    licuadora.encender();
                    break;
                case 2:
                    licuadora.llenar();
                    break;
                case 3:
                    licuadora.aumentarVelocidad();
                    break;
                case 4:
                    licuadora.consultarVelocidad();
                    break;
                case 5:
                    licuadora.consultarLlenado();
                    break;
                case 6:
                    licuadora.vaciar();
                    break;
                case 7:
                    licuadora.apagar();
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

