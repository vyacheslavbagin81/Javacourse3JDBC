import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class CitiDAOImpl <T extends Citi> implements CitiDAO {

    @Override
    public void createCiti(Citi citi) {
        EntityManager entityManager = readPersistent();
        Citi citiNew = entityManager.merge(citi);
        entityManager.getTransaction().commit();
        citi.setCitiId(citiNew.getCitiId());
        entityManager.close();
    }

    @Override
    public Citi getCitiById(int id) {
        EntityManager entityManager = readPersistent();
        Citi citi = entityManager.find(Citi.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return citi;
    }

    @Override
    public List<Citi> getAllCiti() {
        EntityManager entityManager = readPersistent();
        String s = "SELECT e FROM Employee e";
        TypedQuery<Citi> query = entityManager.createQuery(s, Citi.class);
        List<Citi> cities = query.getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return cities;
    }

    @Override
    public void updateCiti(Citi citi) {
        EntityManager entityManager = readPersistent();
        entityManager.merge(citi);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void deleteCiti(int id) {
        EntityManager entityManager = readPersistent();
        entityManager.remove(entityManager.find(Citi.class, id));
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    static EntityManager readPersistent() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        return entityManager;
    }
}
