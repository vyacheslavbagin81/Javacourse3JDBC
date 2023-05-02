import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Setter
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Employee {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

   @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "age")
    private int age;
    @Column(name = "citi_id")
    private int citiId;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    /* применяем FetchType.EAGER так как само по себе перечесление
     * городов без привязки к работникам вряд ли будет необходимо
     * (можно было явно не указывать так как fetch в ManyToOne по умолчанию EAGER) */
    @JoinColumn (name = "citi_id")
    private Citi citi;


    public Employee(String first_name, String last_name, String gender, int age, int citi_id) {
        this.firstName = first_name;
        this.lastName = last_name;
        this.gender = gender;
        this.age = age;
        this.citiId = citi_id;
    }
}
