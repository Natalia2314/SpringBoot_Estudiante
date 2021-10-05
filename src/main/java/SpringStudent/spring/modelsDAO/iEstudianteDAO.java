package SpringStudent.spring.modelsDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import SpringStudent.spring.modelEntity.Estudiante;

public interface iEstudianteDAO extends JpaRepository<Estudiante, Long> {

}
