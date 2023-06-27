/**
 * 
 */
package fr.BakaWord.hwaman.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.BakaWord.hwaman.Bean.User;
import fr.BakaWord.hwaman.Bean.UserLogin;
import fr.BakaWord.hwaman.Bean.Response.JwtResponse;
import fr.BakaWord.hwaman.ConfigurationSecurity.jwt.JwtUtils;
import jakarta.validation.Valid;

/**
 * @author aly_d
 *
 */
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {
	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	JwtUtils jwtUtils;

	@PostMapping("/signin")
	  public ResponseEntity<?> authenticateUser(@Valid @RequestBody User loginRequest) {

	    Authentication authentication = authenticationManager.authenticate(
	        new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));

	    SecurityContextHolder.getContext().setAuthentication(authentication);
	    String jwt = jwtUtils.generateJwtToken(authentication);
	    
	    UserLogin userDetails =  (UserLogin) authentication.getPrincipal();    
	    List<String> roles = userDetails.getAuthorities().stream()
	        .map(item -> item.getAuthority())
	        .collect(Collectors.toList());

	    return ResponseEntity.ok(new JwtResponse(jwt, 
	                         userDetails.getUser().getId(), 
	                         userDetails.getUser().getEmail(), 
	                         userDetails.getFullName(),
	                         roles));
	  }
	}
