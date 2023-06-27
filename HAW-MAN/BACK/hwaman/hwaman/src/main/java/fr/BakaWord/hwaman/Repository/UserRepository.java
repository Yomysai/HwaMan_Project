/**
 * 
 */
package fr.BakaWord.hwaman.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.BakaWord.hwaman.Bean.User;

/**
 * @author aly_d
 *
 */
@Repository
public interface UserRepository  extends JpaRepository<User, Integer> {
	User findByEmail(String login);
}
