/**
 * 
 */
package fr.BakaWord.hwaman.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.BakaWord.hwaman.Bean.Manga;
import fr.BakaWord.hwaman.Repository.MangaRepository;

/**
 * @author aly_d
 *
 */
@Service
public class MangaService {
	  @Autowired
	    private MangaRepository mangaRepository;

	    public boolean addManga(Manga manga) {
	        // Ajouter la logique de validation ou de traitement si nécessaire
	        Manga savedManga = mangaRepository.save(manga);
	        return savedManga != null;
	    }

	    public List<Manga> getAllMangas() {
	        return mangaRepository.findAll();
	    }

	    public Manga getMangaById(int id) {
	        return mangaRepository.findById(id).orElse(null);
	    }

//	    public boolean updateManga(int id, Manga manga) {
//	        // Ajouter la logique de validation ou de traitement si nécessaire
//	        Manga existingManga = mangaRepository.findById(id).orElse(null);
//	        if (existingManga != null) {
//	            existingManga.setTitle(manga.getTitle());
//	            existingManga.setAuthor(manga.getAuthor());
//	            existingManga.setDescription(manga.getDescription());
//	            existingManga.setCoverImage(manga.getCoverImage());
//	            existingManga.setItemType(manga.getItemType());
//	            existingManga.setMangaSpecificColumn1(manga.getMangaSpecificColumn1());
//	            mangaRepository.save(existingManga);
//	            return true;
//	        } else {
//	            return false;
//	        }
//	    }
	    public boolean updateManga(Manga manga) {
	        try {
	            if (mangaRepository.save(manga) != null) {
	                return true;
	            } else {
	                return false;
	            }
	        } catch (Exception e) {
	            return false;
	        }
	    }

	    public boolean deleteManga(int id) {
	        Manga existingManga = mangaRepository.findById(id).orElse(null);
	        if (existingManga != null) {
	            mangaRepository.delete(existingManga);
	            return true;
	        } else {
	            return false;
	        }
	    }
}
