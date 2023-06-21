/**
 * 
 */
package fr.BakaWord.hwaman.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import fr.BakaWord.hwaman.Bean.User;
import fr.BakaWord.hwaman.Repository.UserRepository;

/**
 * @author aly_d
 *
 */
@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	// CRUD - C
	public boolean create(User user) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

		if (userRepository.save(user) != null) {
			return true;
		} else {
			return false;
		}
	}
	// FIN CRUD - C

	//CRUD - R
		public List<User>read(){
			return userRepository.findAll();
		}
		//FIN CRUD - R

}
