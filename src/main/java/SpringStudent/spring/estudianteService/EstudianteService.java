package SpringStudent.spring.estudianteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringStudent.spring.modelEntity.Estudiante;
import SpringStudent.spring.modelsDAO.iEstudianteDAO;


@Service
public class EstudianteService implements IEstudianteService{
	@Autowired
	private iEstudianteDAO estudiantedao;

	@Override
	public List<Estudiante> findAll() {
		// TODO Auto-generated method stub
		return estudiantedao.findAll();//orm		
	}
	
	@Override
	public Estudiante save(Estudiante e) {
		// TODO Auto-generated method stub
		return estudiantedao.save(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		estudiantedao.deleteById(id);
		
	}

	@Override
	public Estudiante encontrarporId(Long id) {
		// TODO Auto-generated method stub
		return estudiantedao.findById(id).orElse(null);
	}
}