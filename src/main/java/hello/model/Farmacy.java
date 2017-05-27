package hello.model;

import javax.persistence.*;

@Entity
@Table(name = "FarmacyAll")
public class Farmacy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer nFarmacy;

    @Column(name = "farmacy")
    private String fName;
    private String fdSurname;
    private String fdName;
    private String fdMiddleName;
    private int fBuild;
    private String fStreet;
    private String fCity;
    private String fCountry;
    private int fIndex;

    public int getNFarmacy() {
        return nFarmacy;
    }

<<<<<<< HEAD
    public void setNFarmacy(int nFarmacy) {
        this.nFarmacy = nFarmacy;
=======
    public void setN_farmacy(int n_farmacy) {
        this.n_farmacy = n_farmacy;
>>>>>>> 9beee718ead600dcdbdda4ca51ae4134b14c8e27
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getFDSurname() {
        return fdSurname;
    }

    public void setFDSurname(String fdSurname) {
        this.fdSurname = fdSurname;
    }

    public String getFDName() {
        return fdName;
    }

    public void setFDName(String fdName) {
        this.fdName = fdName;
    }

    public String getFDMiddleName() {
        return fdMiddleName;
    }

<<<<<<< HEAD
    public void setFDMiddleName(String fdMiddleName) {
        this.fdMiddleName = fdMiddleName;
=======
    public void setDMiddleName(String dMiddleName) {
        this.dMiddleName = dMiddleName;
>>>>>>> 9beee718ead600dcdbdda4ca51ae4134b14c8e27
    }

    public int getFBuild() {
        return fBuild;
    }

    public void setFBuild(int fBuild) {
        this.fBuild = fBuild;
    }

    public String getFStreet() {
        return fStreet;
    }

    public void setFStreet(String fStreet) {
        this.fStreet = fStreet;
    }

    public String getFCity() {
        return fCity;
    }

    public void setFCity(String fCity) {
        this.fCity = fCity;
    }

    public String getFCountry() {
        return fCountry;
    }

    public void setFCountry(String fCountry) {
        this.fCountry = fCountry;
    }

    public int getFIndex() {
        return fIndex;
    }

    public void setFIndex(int fIndex) {
        this.fIndex = fIndex;
    }
}