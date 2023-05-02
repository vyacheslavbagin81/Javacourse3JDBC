import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "citi")
@Setter
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Citi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "citi_id")
    private int citiId;
    @Column(name = "citi_name")
    private String citiName;
    @OneToMany(mappedBy = "citi", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    /* используем FetchType.LAZY что бы не делать неныжные загрузки,
    * так как нас могут интересовать выборки работников без указания места проживания
    * (можно было явно не указывать так как fetch в OneToMany по умолчанию LAZY)*/
    private List<Employee> employee;


    public Citi(String citiName, List<Employee> employee) {
        this.citiName = citiName;
        this.employee = employee;
    }
}
