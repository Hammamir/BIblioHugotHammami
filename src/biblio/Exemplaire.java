package biblio;

import java.util.Date;

public class Exemplaire {
	private int idExemplaire;
	private Date dateAchat;
	private String isbn;
	private EnumStatusExemplaire status;
	private String title;
	private String auteur;
	
	public Exemplaire() {}
	public Exemplaire(int idExemplaire, String title, String auteur, 
			Date dateAchat, String isbn, EnumStatusExemplaire status) {
		super();
		this.idExemplaire = idExemplaire;
		this.title = title;
		this.auteur = auteur;
		this.dateAchat = dateAchat;
		this.isbn = isbn;
		this.status = status;
	}
	
	public EnumStatusExemplaire getStatus() {
		return status;
	}
	public void setStatus(EnumStatusExemplaire status) {
		this.status = status;
	}
	public int getIdExemplaire() {
		return idExemplaire;
	}
	public Date getDateAchat() {
		return dateAchat;
	}
	public String getIsbn() {
		return isbn;
	}
	
	@Override
	public String toString() {
		return "Exemplaire [idExemplaire=" + idExemplaire 
				+ ", title=" + title + ", auteur=" + auteur 
				+ ", dateAchat=" + dateAchat + ", isbn=" + isbn 
				+ ", status=" + status + "]";
	}
	
	
	
	
}
