import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "citi")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode(of = "citiId")
public class Citi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "citi_id")
    private int citiId;
    @Column(name = "citi_name")
    private String citiName;
    @OneToMany(mappedBy = "citiName", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    /* применяем FetchType.EAGER так как перечесление
     * городов без работников вряд ли может быть необходимо
     * (по составу базы данных на этот момент) */
    List<Employee> employees;
}
