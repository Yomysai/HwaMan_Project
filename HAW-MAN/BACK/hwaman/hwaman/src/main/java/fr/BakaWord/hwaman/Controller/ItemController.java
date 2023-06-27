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

import fr.BakaWord.hwaman.Bean.Item;
import fr.BakaWord.hwaman.Service.ItemService;

/**
 * @author aly_d
 *
 */
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ItemController {
	 @Autowired
	    private ItemService itemService;

	    // CRUD - Create
	    @PostMapping("/item")
	    public ResponseEntity<String> addItem(@RequestBody Item item) {
	        if (itemService.addItem(item)) {
	            return new ResponseEntity<>("Item ajouté avec succès", HttpStatus.CREATED);
	        } else {
	            return new ResponseEntity<>("Erreur lors de l'ajout de l'item", HttpStatus.BAD_REQUEST);
	        }
	    }

	    // CRUD - Read
	    @GetMapping("/items")
	    public List<Item> getAllItems() {
	        return itemService.getAllItems();
	    }

	    @GetMapping("/item/{id}")
	    public ResponseEntity<Item> getItemById(@PathVariable Long id) {
	        Item item = itemService.getItemById(id);
	        if (item != null) {
	            return new ResponseEntity<>(item, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    // CRUD - Update
	    @PutMapping("/item/{id}")
	    public ResponseEntity<String> updateItem(@PathVariable Long id, @RequestBody Item item) {
	        if (itemService.updateItem(item)) {
	            return new ResponseEntity<>("Item modifié avec succès", HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>("Erreur lors de la modification de l'item", HttpStatus.BAD_REQUEST);
	        }
	    }

	    // CRUD - Delete
	    @DeleteMapping("/item/{id}")
	    public ResponseEntity<String> deleteItem(@PathVariable Long id) {
	        if (itemService.deleteItem(id)) {
	            return new ResponseEntity<>("Item supprimé avec succès", HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>("Erreur lors de la suppression de l'item", HttpStatus.BAD_REQUEST);
	        }
	    }
}
