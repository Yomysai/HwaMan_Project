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

import fr.BakaWord.hwaman.Bean.Manga;
import fr.BakaWord.hwaman.Service.MangaService;

/**
 * @author aly_d
 *
 */

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MangaController {
	  @Autowired
	    private MangaService mangaService;

	    // CRUD - Create
	    @PostMapping("/manga")
	    public ResponseEntity<String> addManga(@RequestBody Manga manga) {
	        if (mangaService.addManga(manga)) {
	            return new ResponseEntity<>("Manga ajouté avec succès", HttpStatus.CREATED);
	        } else {
	            return new ResponseEntity<>("Erreur lors de l'ajout du manga", HttpStatus.BAD_REQUEST);
	        }
	    }

	    // CRUD - Read
	    @GetMapping("/mangas")
	    public List<Manga> getAllMangas() {
	        return mangaService.getAllMangas();
	    }

	    @GetMapping("/manga/{id}")
	    public ResponseEntity<Manga> getMangaById(@PathVariable int id) {
	        Manga manga = mangaService.getMangaById(id);
	        if (manga != null) {
	            return new ResponseEntity<>(manga, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    // CRUD - Update
	    @PutMapping("/manga/{id}")
	    public ResponseEntity<String> updateManga(@PathVariable int id, @RequestBody Manga manga) {
	        if (mangaService.updateManga( manga)) {
	            return new ResponseEntity<>("Manga modifié avec succès", HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>("Erreur lors de la modification du manga", HttpStatus.BAD_REQUEST);
	        }
	    }

	    // CRUD - Delete
	    @DeleteMapping("/manga/{id}")
	    public ResponseEntity<String> deleteManga(@PathVariable int id) {
	        if (mangaService.deleteManga(id)) {
	            return new ResponseEntity<>("Manga supprimé avec succès", HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>("Erreur lors de la suppression du manga", HttpStatus.BAD_REQUEST);
	        }
	    }

}
