package hello.model;

import javax.persistence.*;

@Entity
@Table(name = "FarmacyAll")
public class Farmacy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer n_farmacy;

    @Column(name = "farmacy")
    private String fName;
    private String dSurname;
    private String dName;
    private String dMiddleName;
    private int fBuild;
    private String fStreet;
    private String fCity;
    private String fCountry;
    private int fIndex;

    public int getN_farmacy() {
        return n_farmacy;
    }

    public void setN_farmacy(int n_farmacy) {
        this.n_farmacy = n_farmacy;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getDSurname() {
        return dSurname;
    }

    public void setDSurname(String dSurname) {
        this.dSurname = dSurname;
    }

    public String getDName() {
        return dName;
    }

    public void setDName(String dName) {
        this.dName = dName;
    }

    public String getDMiddleName() {
        return dMiddleName;
    }

    public void setDMiddleName(String dMiddleName) {
        this.dMiddleName = dMiddleName;
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