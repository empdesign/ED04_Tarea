package cuentas;

/**
 * @author esther
 * @version 2.0
 */

/**
 * Clase CCuenta
 * 
 * @since 1.0
 */
public class CCuenta {

	private String nombre; // nombre titular de la cuenta
	private String cuenta; // el num de cuenta
	private double saldo; // saldo de la cuenta
	private double tipoInteres; // tipo de interés

	/**
	 * Constructor vacío
	 * 
	 * @since 1.0
	 */

	public CCuenta() {
	}

	/**
	 * @param nom
	 * @param cue
	 * @param sal
	 * @param tipo
	 * @since 2.0
	 */

	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
	}

	/**
	 * @return saldo actual
	 * @see ingresar(double)
	 * @see retirar(double)
	 * @since 2.0
	 */

	public double estado() {
		return getSaldo();
	}

	/**
	 * @param cantidad
	 * @throws Exception si la cantidad es negativa
	 * @see estado()
	 * @since 2.0
	 */

	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}

	/**
	 * @param cantidad
	 * @throws Exception si la cantidad es negativa
	 * @see estado()
	 * @since 2.0
	 */

	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		setSaldo(getSaldo() - cantidad);
	}

	/**
	 * @return nombre
	 * @since 2.0
	 * @see setNombre(String)
	 */

	private String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 * @since 2.0
	 * @see getNombre()
	 */

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return cuenta
	 * @since 2.0
	 * @see setCuenta(String)
	 */

	private String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta
	 * @since 2.0
	 * @see getCuenta()
	 */

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return saldo
	 * @since 2.0
	 * @see setSaldo(double)
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo
	 * @since 2.0
	 * @see getSaldo()
	 */

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return tipo de interes
	 * @since 2.0
	 * @see setTipoInterés(double)
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * @param tipo de interes
	 * @since 2.0
	 * @see getTipoInterés()
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
