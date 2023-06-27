/**
 * 
 */
package fr.BakaWord.hwaman.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import fr.BakaWord.hwaman.Bean.User;
import fr.BakaWord.hwaman.Bean.UserLogin;
import fr.BakaWord.hwaman.Repository.UserRepository;

/**
 * @author aly_d
 *
 */
@Service
public class UserLoginDetailsService implements UserDetailsService{
	@Autowired
	private UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found");
		}
		return new UserLogin(user);
		}

}
