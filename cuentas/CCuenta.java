package cuentas;

/**
 * La clase CCuenta representa una cuenta bancaria.
 * Proporciona métodos para ingresar, retirar y consultar el saldo.
 */
public class CCuenta {

    /** Nombre del titular de la cuenta */
    private String nombre;
    /** Número de cuenta */
    private String cuenta;
    /** Saldo de la cuenta */
    private double saldo;
    /** Tipo de interés */
    private double tipoInterés;

    /**
     * Constructor por defecto.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros.
     * @param nom nombre del titular
     * @param cue número de cuenta
     * @param sal saldo inicial
     * @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * @return saldo actual
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Ingresa una cantidad en la cuenta.
     * @param cantidad cantidad a ingresar (debe ser positiva)
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de la cuenta.
     * @param cantidad cantidad a retirar (debe ser positiva y no superior al saldo)
     * @throws Exception si la cantidad es negativa o supera el saldo disponible
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * Devuelve el nombre del titular.
     * @return nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular.
     * @param nombre nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el número de cuenta.
     * @return número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     * @param cuenta número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo.
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo.
     * @param saldo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interés.
     * @return tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés.
     * @param tipoInterés tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
