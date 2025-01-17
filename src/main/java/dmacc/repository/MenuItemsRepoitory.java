
package dmacc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dmacc.beans.MenuItems;

/**
 * @author Jeremy Brannen - jrbrannen CIS175 Apr 5, 2021
 */
@Repository
public interface MenuItemsRepoitory extends JpaRepository<MenuItems, Long> {
	
	List<MenuItems> findTop1ByOrderByIdDesc();
	List<MenuItems> findTop10ByOrderByIdDesc();
}
