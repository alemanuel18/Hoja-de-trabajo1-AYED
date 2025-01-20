/**
 * Universidad del Valle de Guatemala
 * Autor: Alejandro Manuel Jerez Melgar
 * Fecha: 17 de enero de 2025
 */
public class Licuadora implements Interfaz{

    private boolean estadoLicuadora; /*true=On, false=Off */
    private boolean capacidadLicuadora; /*true=llena, fasle==vacio */
    private int velocidadLicuadora; /*empieza en cero */

    /**
     * 
     * @param estadoLicuadora
     * @param capacidadLicuadora
     * @param velocidadLicuadora
     */
    public Licuadora(boolean estadoLicuadora, boolean capacidadLicuadora, int velocidadLicuadora){
        this.estadoLicuadora=estadoLicuadora;
        this.capacidadLicuadora=capacidadLicuadora;
        this.velocidadLicuadora=velocidadLicuadora;
    }

    @Override
    public void encender(){
        if (capacidadLicuadora==true && estadoLicuadora==false) {
            estadoLicuadora=true;
            velocidadLicuadora=1;
        }
    }

    @Override
    public void llenar(){
        if (capacidadLicuadora==false) {
            capacidadLicuadora=true;
        }
    }

    @Override
    public void aumentarVelocidad(){
        if (velocidadLicuadora<=10) {
            velocidadLicuadora =+1;
        }else{
            velocidadLicuadora=0;
        }
    }

    @Override
    public int consultarVelocidad(){
        return velocidadLicuadora;
    }

    @Override
    public boolean consultarLlenado(){
        return capacidadLicuadora;
    }

    @Override
    public void vaciar(){
        if (capacidadLicuadora==true) {
            capacidadLicuadora=false;
        }
    }

    public void apagar(){
        if (estadoLicuadora==true) {
            estadoLicuadora=false;
        }
    }
    /**
     * 
     * @return
     */
    public int getVelocidadLicuadora() {
        return velocidadLicuadora;
    }
    
}