/**
 * 
 */
package fr.BakaWord.hwaman.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.BakaWord.hwaman.Bean.User;
import fr.BakaWord.hwaman.Service.UserService;

/**
 * @author aly_d
 *
 */
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
	@Autowired
	private UserService userService;

	// CRUD - C
	@PostMapping("/create")
	public ResponseEntity<String> Ajout(@RequestBody User user) {
		if (userService.create(user)) {
			return new ResponseEntity<String>(user.getPrenom() + " a été ajouté", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<String>("Oups, pas ajouté", HttpStatus.BAD_REQUEST);
		}
	}

	// CRUD - R
	@GetMapping("/read")
	public List<User> affichage() {
		return userService.read();
	}

	// CRUD - U
	@PutMapping("/update")
	public ResponseEntity<String> edit(@RequestBody User user) {
		if (userService.update(user)) {
			return new ResponseEntity<String>(user.getPrenom() + " a été modifié", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<String>("Oups, pas ajouté", HttpStatus.BAD_REQUEST);
		}
	}

	// CRUD - D
	@DeleteMapping("/user/{id}")
	public ResponseEntity<String> suppression(@PathVariable int id) {
		if (userService.delete(id)) {
			return new ResponseEntity<String>(" La supp OK", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<String>("Oups, pas ajouté", HttpStatus.BAD_REQUEST);
		}
	}

}
