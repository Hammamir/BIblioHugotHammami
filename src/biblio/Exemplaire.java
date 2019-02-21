package biblio;

import java.util.Date;

public class Exemplaire {
	private int idExemplaire;
	private Date dateAchat;
	private String isbn;
	private EnumStatusExemplaire status;
	
	public Exemplaire() {}
	public Exemplaire(int idExemplaire, Date dateAchat, String isbn,
			EnumStatusExemplaire status) {
		super();
		this.idExemplaire = idExemplaire;
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
		return "Exemplaire [idExemplaire=" + idExemplaire + ", dateAchat="
				+ dateAchat + ", isbn=" + isbn + ", status=" + status + "]";
	}
	
	
	
	
}
