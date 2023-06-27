/**
 * 
 */
package fr.BakaWord.hwaman.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.BakaWord.hwaman.Bean.Item;
import fr.BakaWord.hwaman.Repository.ItemRepository;

/**
 * @author aly_d
 *
 */
@Service
public class ItemService {
	 @Autowired
	    private ItemRepository itemRepository;

	    public boolean addItem(Item item) {
	        try {
	            itemRepository.save(item);
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	    }
	   
	    public List<Item> getAllItems() {
	        return itemRepository.findAll();
	    }

	    public Item getItemById(Long id) {
	        return itemRepository.findById(id).orElse(null);
	    }
	    public boolean updateItem(Item item) {
	        try {
	            if (itemRepository.save(item) != null) {
	                return true;
	            } else {
	                return false;
	            }
	        } catch (Exception e) {
	            return false;
	        }
	    }

	    public boolean deleteItem(Long id) {
	        try {
	            itemRepository.deleteById(id);
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	    }

}
