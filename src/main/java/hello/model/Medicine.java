package hello.model;

import javax.persistence.*;


@Entity
@Table(name="Medicines")
public class Medicine {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer nMedicine;

	@Column(name="medicine")
	private String mName;

	public int getNMedicine() {
		return nMedicine;
	}
	
	public void setNMedicine(int nMedicine) {		
		this.nMedicine = nMedicine;
	}

	public String getMName() {
		return mName;
	}

	public void setMName(String mName) {
		this.mName = mName;
	}
}