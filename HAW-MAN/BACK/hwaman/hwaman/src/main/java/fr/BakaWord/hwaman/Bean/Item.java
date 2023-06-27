/**
 * 
 */
package fr.BakaWord.hwaman.Bean;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

/**
 * @author aly_d
 *
 */
@Entity
@Table(name = "item")
@Inheritance(strategy = InheritanceType.JOINED)
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;


	@Column(name = "description")
    private String description;

    @Column(name = "cover_image")
    private String coverImage;

    @Column(name = "item_type")
    private String itemType;

 // Constructors
    public Item() {
        // Constructeur par défaut
    }

    public Item(String title, String author, String description, String coverImage, String itemType) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.coverImage = coverImage;
        this.itemType = itemType;
    }

    /**
	 * @param itemId
	 * @param title
	 * @param author
	 * @param description
	 * @param coverImage
	 * @param itemType
	 */
	public Item(Long itemId, String title, String author, String description, String coverImage, String itemType) {
		super();
		this.itemId = itemId;
		this.title = title;
		this.author = author;
		this.description = description;
		this.coverImage = coverImage;
		this.itemType = itemType;
	}

    public Long getItemId() {
        return itemId;
    }

	public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
}