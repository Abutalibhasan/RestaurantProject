
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dmacc.beans.Menu;

/**
 * @author Jeremy Brannen - jrbrannen CIS175 Apr 5, 2021
 */
@Repository
public interface MenuRepoitory extends JpaRepository<Menu, Long> {

}