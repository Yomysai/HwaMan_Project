/**
 * 
 */
package fr.BakaWord.hwaman.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * @author aly_d
 *
 */

@Entity
@Table(name = "book")
public class Book extends Item {
  
    private String bookSpecificColumn1;
	/**
	 * @return the bookSpecificColumn1
	 */
	public String getBookSpecificColumn1() {
		return bookSpecificColumn1;
	}
	/**
	 * @param bookSpecificColumn1 the bookSpecificColumn1 to set
	 */
	public void setBookSpecificColumn1(String bookSpecificColumn1) {
		this.bookSpecificColumn1 = bookSpecificColumn1;
	}

    // Constructors, getters, and setters
    
}