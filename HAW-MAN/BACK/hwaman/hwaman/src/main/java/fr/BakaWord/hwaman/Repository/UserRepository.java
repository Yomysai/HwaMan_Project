/**
 * 
 */
package fr.BakaWord.hwaman.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.BakaWord.hwaman.Bean.User;

/**
 * @author aly_d
 *
 */
public interface UserRepository  extends JpaRepository<User, Integer> {
	User findByEmail(String login);
}
