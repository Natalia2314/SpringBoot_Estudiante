package SpringStudent.spring.estudianteService;

import java.util.List;

import SpringStudent.spring.modelEntity.Estudiante;


public interface IEstudianteService {
	public List<Estudiante> findAll();
	public Estudiante save(Estudiante e);
	public void delete(Long id);
	public Estudiante encontrarporId(Long id);
}
