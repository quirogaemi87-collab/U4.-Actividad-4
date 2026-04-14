package cuentas;
/**
 * clase que prueba la clase cuentas.CCuenta
 */
public class Main {

    /**Entrada del programa
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Se crea la cuenta bancaria
         */
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

        operativa_cuenta(cuenta1, 0.0f);
    }

    //llamar al metodo enviando informacion de cuenta1




    /**
     * metodo que engloba las operaciones de la cuenta
     * @param cuenta1
     * @param cantidad
     */
        public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
            /**
             * muestra el saldo inicial
             */
            System.out.println("El saldo actual es"+ cuenta1.estado());

            /**
             * intento de retirar dinero
             */
            try {
                cuenta1.retirar(2300);
            } catch (Exception e) {
                System.out.print("Fallo al retirar " + e.getMessage());
            }

            /**
             * intento de ingresar dinero
             */
            try {
                System.out.println("Ingreso en cuenta");
                cuenta1.ingresar(695);
            } catch (Exception e) {
                System.out.print("Fallo al ingresar " + e.getMessage());
            }
        }
    }

