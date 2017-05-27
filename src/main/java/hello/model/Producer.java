package hello.model;

import javax.persistence.*;

@Entity
@Table(name="Producers")
public class Producer {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer nProducer;

	@Column(name="Producer")
	private String pName;
	private String pdSurname;
	private String pdName;
	private String pdMiddleName;
	private int pBuild;
	private String pStreet;
	private String pCity;
	private String pCountry;
	private int pIndex;
	private String mName;
	private int dateOfProd;
	private int expDate;

	public int getNProducer() {
		return nProducer;
	}
	
	public void setNProducer(int nProducer) {		
		this.nProducer = nProducer;
	}

	public String getPName() {
		return pName;
	}

	public void setPName(String pName) {
		this.pName = pName;
	}

	public String getPDSurname() {
        	return pdSurname;
	}

	public void setPDSurname(String pdSurname) {
        	this.pdSurname = pdSurname;
	}

	public String getPDName() {
        	return pdName;
	}

	public void setPDName(String PDName) {
        	this.pdName = pdName;
	}

	public String getPDMiddleName() {
        	return pdMiddleName;
	}

	public void setPDMiddleName(String pdMiddleName) {
        	this.pdMiddleName = pdMiddleName;
	}

	public int getPBuild() {
        	return pBuild;
	}

	public void setPBuild(int pBuild) {
        	this.pBuild = pBuild;
	}

	public String getPStreet() {
        	return pStreet;
	}

	public void setPStreet(String pStreet) {
        	this.pStreet = pStreet;
	}

	public String getPCity() {
        	return pCity;
	}

	public void setPCity(String pCity) {
        	this.pCity = pCity;
	}

	public String getPCountry() {
        	return pCountry;
	}

	public void setPCountry(String pCountry) {
        	this.pCountry = pCountry;
	}

	public int getPIndex() {
        	return pIndex;
	}

	public void setPIndex(int pIndex) {
        	this.pIndex = pIndex;
	}

	public String getMName() {
        	return mName;
	}

	public void setMName(String mName) {
        	this.mName = mName;
	}

	public String getExpDate() {
        	return expDate;
	}

	public void setExpDate(String expDate) {
        	this.expDate = expDate;
	}

	public String getDateOfProd() {
        	return dateOfProd;
	}

	public void setDateOfProd(String dateOfProd) {
        	this.dateOfProd = dateOfProd;
	}

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer n_producer;

    @Column(name="producer")
    private String pName;
    private String pdSurname;
    private String pdName;
    private String pdMiddleName;
    private int pBuild;
    private String pStreet;
    private String pCity;
    private String pCountry;
    private int pIndex;
    private String medName;
    private int expDate;
    private int dateOfProduction;

    public int getN_producer() {
        return n_producer;
    }

    public void setN_producer(int n_producer) {
        this.n_producer = n_producer;
    }

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }

    public String getPdMiddleName() {
        return pdMiddleName;
    }

    public void setPdMiddleName(String pdMiddleName) {
        this.pdMiddleName = pdMiddleName;
    }

    public String getPDSurname() {
        return pdSurname;
    }

    public void setPDSurname(String pdSurname) {
        this.pdSurname = pdSurname;
    }

    public String getPDName() {
        return pdName;
    }

    public void setPDName(String PDName) {
        this.pdName = pdName;
    }

    public String getPDMiddleName() {
        return pdMiddleName;
    }

    public void setPDMiddleName(String pdMiddleName) {
        this.pdSurname = pdMiddleName;
    }

    public int getPBuild() {
        return pBuild;
    }

    public void setPBuild(int pBuild) {
        this.pBuild = pBuild;
    }

    public String getPStreet() {
        return pStreet;
    }

    public void setPStreet(String pStreet) {
        this.pStreet = pStreet;
    }

    public String getPCity() {
        return pCity;
    }

    public void setPCity(String pCity) {
        this.pCity = pCity;
    }

    public String getPCountry() {
        return pCountry;
    }

    public void setPCountry(String pCountry) {
        this.pCountry = pCountry;
    }

    public int getPIndex() {
        return pIndex;
    }

    public void setPIndex(int pIndex) {
        this.pIndex = pIndex;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public int getExpDate() {
        return expDate;
    }

    public void setExpDate(int expDate) {
        this.expDate = expDate;
    }

    public int getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(int dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }
}