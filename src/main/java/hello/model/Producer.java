package hello.model;

import javax.persistence.*;

/**
 * Created by Анастасия on 13.05.2017.
 */
@Entity
@Table(name="Producer")
public class Producer {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name="type")
    private String ProdName;
    private String FDir;
    private String IDir;
    private String ODir;
    private String Address;
    private String MedName;
    private int SrokGodn;
    private int DateIzg;
}