/**
 * 
 */
package za.co.digitalplatoon.invoiceservice.service.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Samukelo Jiyane
 *
 */
@Repository
public interface InvoiceRepo extends JpaRepository<Invoice, Long>{

}
