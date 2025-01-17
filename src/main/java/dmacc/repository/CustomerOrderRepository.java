
package dmacc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dmacc.beans.CustomerOrder;

/**
 * @author Jeremy Brannen - jrbrannen CIS175 Apr 5, 2021
 */
@Repository
public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Long> {
	List<CustomerOrder> findTop1ByOrderByIdDesc();
	List<CustomerOrder> findTop10ByOrderByIdDesc();
	

}
