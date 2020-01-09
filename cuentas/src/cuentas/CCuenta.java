

package cuentas;

/**
 * Representa la cuenta de un determinado usuario.
 * 
 * @author 		Cidead
 * @version 	1.5
 * 
 */
public class CCuenta {
	
	/**
	 * Nombre del usuario
	 */
    private String nombre;
    /**
     * Codigo identificador de la cuenta
     */
    private String cuenta;
    /**
     * Saldo existente en la cuenta
     */
    private double saldo;
    /**
     * Tipo de interes aplicable a la cuenta
     */
    private double tipoInterés;

    /**
     * Constructor de la clase CCuenta (por defecto)
     */
    public CCuenta()
    {
    }
    /**
     * Constructor de la clase CCuenta (con 4 parámetros)
     * @param	nom		Nombre del usuario
     * @param	cue		Codigo de cuenta
     * @param	sal		Saldo actual en cuenta
     * @param	tipo	Tipo de interes aplicable
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    /**
     * Devuelve el saldo actual de la cuenta.
     * @return	Saldo actual de la cuenta.
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Realiza un ingreso, es decir, agrega una cantidad al valor actual del saldo.
     * @param cantidad		Cantidad a ingresar en la cuenta.
     * @throws Exception	Si se intenta ingresar una cantidad negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Realiza una retirada de la cuenta, es decir, resta una cantidad al valor actual del saldo. 
     * @param cantidad		Cantidad a retirar de la cuenta.
     * @throws Exception	Si se intenta retirar una cantidad negativa.
     * @throws Exception	Si se intenta retirar una cantidad superior al saldo existente.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    /**
     * Devuelve el nombre del usuario
     * @return	El nombre del usuario
     */
	private String getNombre() {
		return nombre;
	}
	/**
	 * Establece el nombre del usuario de la cuenta
	 * @param nombre	Nombre del usuario
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
     * Devuelve el codigo de la cuenta
     * @return	El codigo de la cuenta
     */
	private String getCuenta() {
		return cuenta;
	}
	/**
	 * Establece el codigo de la cuenta
	 * @param cuenta	Codigo de la cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
     * Devuelve el saldo de la cuenta
     * @return	El saldo de la cuenta
     */
	private double getSaldo() {
		return saldo;
	}
	/**
	 * Establece el saldo de la cuenta
	 * @param saldo	Saldo de la cuenta
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
