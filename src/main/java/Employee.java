import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode(of = "id")
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
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    /* применяем FetchType.LAZY так как перечесление
     * работников без городов может быть необходимо
     * а города подгружаются по необходимости */
    @JoinColumn (name = "citi_id")
    private Citi citiName;

}
