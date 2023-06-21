/**
 * 
 */
package fr.BakaWord.hwaman.Bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author aly_d
 *
 */
@Entity
public class Role {

	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int id;

	  @Column(length = 20)
	  private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
