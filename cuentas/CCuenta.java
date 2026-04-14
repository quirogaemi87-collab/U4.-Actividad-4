package cuentas;
/**
     * Clase que simula el funcionamiento de una cuenta bancaria
     * Permite la gestion con numero de cuenta y nombre de la persona
     * Muestra saldo disponible y tipo de interés.
     */
public class CCuenta {

    /**
     * nombre del titular de la cuenta
     */
    private String nombre;

    /**
     * numero de la cuenta bancaria
     */
    private String cuenta;

    /**
     * saldo de la cuenta
     */
    private double saldo;

    /**
     * interes
     */
    private double tipoInteres;

    /**
     * constructor vacio
     */
    public CCuenta(){
    }

    /**
     * Constructor con parámetros
     *
     * @param nombre
     * @param cuenta
     * @param saldo
     * @param tipoInteres
     */
    public CCuenta(String nombre, String cuenta, double saldo, double tipoInteres)
    {
        this.nombre =nombre;
        this.cuenta =cuenta;
        this.saldo =saldo;
        this.tipoInteres = tipoInteres;
    }

        /**
         * Devuelve el saldo
         * @return
         */
    public double estado() {
        return saldo;
    }

        /**
         * Ingresa dinero en la cuenta
         * @param cantidad es el importe para ingresar
         * @throws Exception tiene que ser positivo
         */
    public void ingresar(double cantidad){
        if (cantidad <= 0) {
            throw new IllegalArgumentException("No se puede ingresar una cantidad negativa");
        }
            saldo += cantidad;
    }

        /**
         * Retirar el dinero de la cuenta
         * @param cantidad la cantidad que se va a retirar
         * @throws Exception tiene que ser positivo y menor igual al saldo
         */
    public void retirar(double cantidad){
            if (cantidad <= 0){
                throw new IllegalArgumentException("No se puede retirar una cantidad negativa");
            }
            if (estado()< cantidad) {
                throw new IllegalArgumentException("No se hay suficiente saldo");
            }
            saldo -= cantidad;
    }
}
