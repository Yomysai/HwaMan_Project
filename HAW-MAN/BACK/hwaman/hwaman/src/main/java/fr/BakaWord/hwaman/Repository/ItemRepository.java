/**
 * 
 */
package fr.BakaWord.hwaman.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.BakaWord.hwaman.Bean.Item;

/**
 * @author aly_d
 *
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
