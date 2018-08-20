/**
 * 
 */
package za.co.digitalplatoon.invoiceservice.service.exceptions;

/**
 * @author Samukelo Jiyane
 *
 */
@SuppressWarnings("serial")
public class InvoiceException extends RuntimeException {
	
	public InvoiceException(String exception) {
		super(exception);
	}
}
