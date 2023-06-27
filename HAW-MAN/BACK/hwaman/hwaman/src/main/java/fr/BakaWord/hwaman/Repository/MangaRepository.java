/**
 * 
 */
package fr.BakaWord.hwaman.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.BakaWord.hwaman.Bean.Manga;

/**
 * @author aly_d
 *
 */
@Repository
public interface MangaRepository extends JpaRepository<Manga, Integer> {

}
