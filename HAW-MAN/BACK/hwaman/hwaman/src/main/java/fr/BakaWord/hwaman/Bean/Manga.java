/**
 * 
 */
package fr.BakaWord.hwaman.Bean;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * @author aly_d
 *
 */
@Entity
@Table(name = "manga")
public class Manga extends Item {
	private String origine;
	private String artiste;
	private String statut;
	private int numberOfChapters;
	private String publisher;
	private Date publicationDate;
	private int volumesVO;
	private int volumesVF;
	private String ageConseille;
	private String autresCaracteristiques;
	private String mangaSpecificColumn1;

	// Constructors
	public Manga() {
		// Constructeur par défaut
	}

	public Manga(Long itemId, String mangaSpecificColumn1, String title, String author, String description,
			String coverImage, String itemType) {
		super(itemId, title, author, description, coverImage, itemType);
		this.mangaSpecificColumn1 = mangaSpecificColumn1;
	}
	/**
	 * @param origine
	 * @param artiste
	 * @param statut
	 * @param numberOfChapters
	 * @param publisher
	 * @param publicationDate
	 * @param volumesVO
	 * @param volumesVF
	 * @param ageConseille
	 * @param autresCaracteristiques
	 * @param mangaSpecificColumn
	 */
	public Manga(Long itemId, String mangaSpecificColumn1, String title, String author, String description,
			String coverImage, String itemType,String origine, String artiste, String statut, int numberOfChapters, String publisher,
			Date publicationDate, int volumesVO, int volumesVF, String ageConseille, String autresCaracteristiques) {
		super(itemId, title, author, description, coverImage, itemType);
		this.origine = origine;
		this.artiste = artiste;
		this.statut = statut;
		this.numberOfChapters = numberOfChapters;
		this.publisher = publisher;
		this.publicationDate = publicationDate;
		this.volumesVO = volumesVO;
		this.volumesVF = volumesVF;
		this.ageConseille = ageConseille;
		this.autresCaracteristiques = autresCaracteristiques;
	}
	

	/**
	 * @return the origine
	 */
	public String getOrigine() {
		return origine;
	}

	/**
	 * @param origine the origine to set
	 */
	public void setOrigine(String origine) {
		this.origine = origine;
	}

	/**
	 * @return the artiste
	 */
	public String getArtiste() {
		return artiste;
	}

	/**
	 * @param artiste the artiste to set
	 */
	public void setArtiste(String artiste) {
		this.artiste = artiste;
	}

	/**
	 * @return the statut
	 */
	public String getStatut() {
		return statut;
	}

	/**
	 * @param statut the statut to set
	 */
	public void setStatut(String statut) {
		this.statut = statut;
	}

	/**
	 * @return the numberOfChapters
	 */
	public int getNumberOfChapters() {
		return numberOfChapters;
	}

	/**
	 * @param numberOfChapters the numberOfChapters to set
	 */
	public void setNumberOfChapters(int numberOfChapters) {
		this.numberOfChapters = numberOfChapters;
	}

	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return the publicationDate
	 */
	public Date getPublicationDate() {
		return publicationDate;
	}

	/**
	 * @param publicationDate the publicationDate to set
	 */
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	/**
	 * @return the volumesVO
	 */
	public int getVolumesVO() {
		return volumesVO;
	}

	/**
	 * @param volumesVO the volumesVO to set
	 */
	public void setVolumesVO(int volumesVO) {
		this.volumesVO = volumesVO;
	}

	/**
	 * @return the volumesVF
	 */
	public int getVolumesVF() {
		return volumesVF;
	}

	/**
	 * @param volumesVF the volumesVF to set
	 */
	public void setVolumesVF(int volumesVF) {
		this.volumesVF = volumesVF;
	}

	/**
	 * @return the ageConseille
	 */
	public String getAgeConseille() {
		return ageConseille;
	}

	/**
	 * @param ageConseille the ageConseille to set
	 */
	public void setAgeConseille(String ageConseille) {
		this.ageConseille = ageConseille;
	}

	/**
	 * @return the autresCaracteristiques
	 */
	public String getAutresCaracteristiques() {
		return autresCaracteristiques;
	}

	/**
	 * @param autresCaracteristiques the autresCaracteristiques to set
	 */
	public void setAutresCaracteristiques(String autresCaracteristiques) {
		this.autresCaracteristiques = autresCaracteristiques;
	}

	/**
	 * @return the mangaSpecificColumn1
	 */
	public String getMangaSpecificColumn1() {
		return mangaSpecificColumn1;
	}

	/**
	 * @param mangaSpecificColumn1 the mangaSpecificColumn1 to set
	 */
	public void setMangaSpecificColumn1(String mangaSpecificColumn1) {
		this.mangaSpecificColumn1 = mangaSpecificColumn1;
	}

}
