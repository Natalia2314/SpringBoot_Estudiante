package SpringStudent.spring.modelsDAO.estudianteController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import SpringStudent.spring.estudianteService.IEstudianteService;
import SpringStudent.spring.modelEntity.Estudiante;


@RestController
@RequestMapping("/api")
public class EstudianteRestController {
	@Autowired
	private IEstudianteService estudianteService;
	@GetMapping("/personas")
	public List<Estudiante> listarEstudiantes(){
		return estudianteService.findAll();
	}
	@PostMapping("/personas")
	@ResponseStatus(HttpStatus.CREATED)
	public Estudiante guardar(@RequestBody Estudiante e) {
		return estudianteService.save(e);
	}
	@DeleteMapping("/personas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar(@PathVariable Long id) {
		estudianteService.delete(id);
	}
	@GetMapping("/personas/{id}")
	public Estudiante encontraporId(@PathVariable Long id) {
		return estudianteService.encontrarporId(id);
	}
	@PutMapping("/personas/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Estudiante editar(@PathVariable Long id,@RequestBody Estudiante e) {
		Estudiante actual=estudianteService.encontrarporId(id);
		actual.setNombre(e.getNombre());
		actual.setApellido(e.getApellido());
		return estudianteService.save(actual);
	}
}
