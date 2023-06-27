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
//	public boolean create(User user, String role) {
//	    // Logique de création de l'utilisateur avec le rôle
//	    Role userRole = roleRepository.findByName(role);
//	    if (userRole == null) {
//	        // Le rôle spécifié n'existe pas, vous pouvez gérer cette situation comme vous le souhaitez
//	        return false;
//	    }
//
//	    user.getRoles().add(userRole);
//	    userRepository.save(user);
//	    return true;
//	}

	// FIN CRUD - C

	//CRUD - R
		public List<User>read(){
			return userRepository.findAll();
		}
		//FIN CRUD - R

		//CRUD - U
		public boolean update(User user) {
			BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
			user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
			
			if (userRepository.save(user) != null) {
				return true;
			} else {
				return false;
			}
		}
		//FIN CRUD - U

		//CRUD - D
		public boolean delete(int id) {
			userRepository.deleteById(id);
			
			if (userRepository.findById(id).isEmpty()) {
				return true;
			} else {
				return false;
			}
		}
		//FIN CRUD - D

}
