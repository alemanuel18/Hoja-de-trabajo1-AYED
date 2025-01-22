/**
 * Universidad del Valle de Guatemala
 * Autor: Alejandro Manuel Jerez Melgar
 * Fecha: 17 de enero de 2025
 */
public class Licuadora implements Interfaz{

    private boolean encendido; /*true=On, false=Off */
    private boolean lleno; /*true=llena, fasle==vacio */
    private int velocidad; /*empieza en cero */

    /**
     * 
     * @param encendido
     * @param lleno
     * @param velocidad
     */
    public Licuadora(boolean encendido, boolean lleno, int velocidad){
        this.encendido=encendido;
        this.lleno=lleno;
        this.velocidad=velocidad;
    }

    @Override
    public void encender(){
        if (lleno==true && encendido==false) {
            encendido=true;
            velocidad=1;
        }
    }

    @Override
    public void llenar(){
        if (lleno==false) {
            lleno=true;
        }
    }

    @Override
    public void aumentarVelocidad(){
        if (velocidad<=10) {
            velocidad =+1;
        }else{
            velocidad=0;
        }
    }

    @Override
    public int consultarVelocidad(){
        return velocidad;
    }

    @Override
    public boolean consultarLlenado(){
        return lleno;
    }

    @Override
    public void vaciar(){
        if (lleno==true) {
            lleno=false;
        }
    }

    public void apagar(){
        if (encendido==true) {
            encendido=false;
        }
    }
    /**
     * 
     * @return
     */
    public int getVelocidad() {
        return velocidad;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    public void setLleno(boolean lleno) {
        this.lleno = lleno;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
}