package hello.model;

import javax.persistence.*;

/**
 * Created by Анастасия on 13.05.2017.
 */
@Entity
@Table(name="Farmacy")
public class Farmacy {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
        private Integer id;

        @Column(name="type")
        private String FarmName;
        private String FDir;
        private String IDir;
        private String ODir;
        private String Address;
}
