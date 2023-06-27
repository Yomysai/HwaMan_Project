/**
 * 
 */
package fr.BakaWord.hwaman.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.BakaWord.hwaman.Bean.Role;

/**
 * @author aly_d
 *
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	 Role findByName(String role);
}
