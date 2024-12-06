package exceptiondemo;

/**
* Auhtor : Satyam.3.Singh
* Date   : 6 Nov 2024
* Time   : 4:35:39 pm
* Email  : satyam.3.singh@coforge.com
*/

//Define custom exception class to handle insufficient funds in bank

public class InsufficientFunds extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientFunds(String message) {
		super(message);

	}
	
	
}
