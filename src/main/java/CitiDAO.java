import java.util.List;

public interface CitiDAO  <T> {
    void createCiti(Citi citi);

    Citi getCitiById(int id);

    List<Citi> getAllCiti();

    void updateCiti(Citi citi);

    void deleteCiti(int id);
}
