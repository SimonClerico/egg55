/*
5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejercicio5guiapoo;

import java.util.Scanner;

public class cuentaBancaria {

    public void Scanner() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

    }

    public Integer numeroCuenta;
    public Double dni, ingreso, retiro, extraccionrapida, consultarsaldo, consultardatos;
    public Double saldoactual = 0.0, intereses, cuenta;

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(Double dni) {
        this.dni = dni;
    }

    public void setIngreso(Double ingreso) {
        this.ingreso = ingreso;
    }

    public void setRetiro(Double retiro) {
        this.retiro = retiro;
    }

    public void setExtraccionrapida(Double extraccionrapida) {
        this.extraccionrapida = extraccionrapida;
    }

    public void setConsultarsaldo(Double consultarsaldo) {
        this.consultarsaldo = consultarsaldo;
    }

    public void setConsultardatos(Double consultardatos) {
        this.consultardatos = consultardatos;
    }

    public void setSaldoactual(Double saldoactual) {
        this.saldoactual = saldoactual;
    }

    public void setIntereses(Double intereses) {
        this.intereses = intereses;
    }

    public void setCuenta(Double cuenta) {
        this.cuenta = cuenta;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public Double getDni() {
        return dni;
    }

    public Double getIngreso() {
        return ingreso;
    }

    public Double getRetiro() {
        return retiro;
    }

    public Double getExtraccionrapida() {
        return extraccionrapida;
    }

    public Double getConsultarsaldo() {
        return consultarsaldo;
    }

    public Double getConsultardatos() {
        return consultardatos;
    }

    public Double getSaldoactual() {
        return saldoactual;
    }

    public Double getIntereses() {
        return intereses;
    }

    public Double getCuenta() {
        return cuenta;
    }

    public cuentaBancaria(Integer numeroCuenta, Double dni, Double ingreso, Double retiro, Double extraccionrapida, Double consultarsaldo, Double consultardatos, Double saldoactual, Double intereses, Double cuenta) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.ingreso = ingreso;
        this.retiro = retiro;
        this.extraccionrapida = extraccionrapida;
        this.consultarsaldo = consultarsaldo;
        this.consultardatos = consultardatos;
        this.saldoactual = saldoactual;
        this.intereses = intereses;
        this.cuenta = cuenta;
    }

    public cuentaBancaria() {
    }

    public void datoCuenta() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese su numero de cuenta ");
        numeroCuenta = leer.nextInt();

        System.out.println("Ingrese su DNI ");
        dni = leer.nextDouble();

        System.out.println("Ingrese la cantidad de dinero a depositar");
        ingreso = leer.nextDouble();

        System.out.println("Ingrese la cantidad de dinero a retirar");
        retiro = leer.nextDouble();

        System.out.println("Ingrese la cantidad a retirar no puede superar el %20");
        extraccionrapida = leer.nextDouble();

    }

    public Double ingresoDinero() {

       
        return saldoactual = saldoactual + ingreso;
        
        
    }

    public Double retiroDinero() {

        if (saldoactual < retiro) {
            System.out.println("Dinero en 0");
        } else {
            System.out.println("Su dinero quedo en ");
        }
        saldoactual = saldoactual - retiro;
        
        return saldoactual;

    }

    public Double extraccionRapida() {

        //poner para que muestre cuanto es la extraccion
        do {
            if (extraccionrapida < (20 * saldoactual) / 100) {
                System.out.println("Puede retirar el dinero");
            } else {
                System.out.println("El porcentaje es muy alto no tiene tanto dinero");
            }
        } while (extraccionrapida > (20 * saldoactual) / 100);
        
        System.out.println("La cantidad de dinero de la extraccion rapida es : ");
        return extraccionrapida = (20 * retiro) / 100;

    }

    public Double consultarSaldo() {
        System.out.println("Su saldo actual: ");
        return consultarsaldo = saldoactual;
        

    }

    public void consultarDatos() {
        System.out.println("Sus datos personales " + dni + saldoactual + numeroCuenta);
    }

    public void mostrarDatos() {
        System.out.println("Sus datos de cuenta" );
        System.out.println("");
        System.out.println("numero de cuenta: " + numeroCuenta);
        System.out.println("");
        System.out.println("Dni: " + dni);
        System.out.println("");
        System.out.println("Su saldo actual  " + saldoactual);

    }
}
