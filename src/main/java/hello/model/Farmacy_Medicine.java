package hello.model;
import sun.util.calendar.LocalGregorianCalendar;

import javax.persistence.*;

@Entity
@Table(name = "FarmMeds")
public class FarmMeds {

    	@Id
    	@GeneratedValue(strategy = GenerationType.AUTO)
    	private Integer nFM;

    	@Column(name = "farmMeds")
    	private String nFarmacy;
    	private String nMedicine;
    	private String mPrise;

    	public int getNFM() {
		return nFM;
    	}

    	public void setNFM(int nFM) {
        	this.nFM = nFM;
    	}

    	public String getNFarmacy() {
        	return nFarmacy;
    	}

    	public void setNFarmacy(String nFarmacy) {
        	this.nFarmacy = nFarmacy;
    	}	

	public String getNMedicine() {
        	return nMedicine;
	}

    	public void setNMedicine(String nMedicine) {
        	this.nMedicine = nMedicine;
   	}

	public String getMPrise() {
        	return mPrise;
	}

    	public void setMPrise(String mPrise) {
        	this.mPrise = mPrise;
   	}
}