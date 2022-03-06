package guru.springframework.sfgpetclinic.service.map;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.service.SpecialtiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialtiesService {
	@Override
	public Set<Speciality> findAll() {
		return null;
	}

	@Override
	public void deleteById(Long id) {

	}

	@Override
	public void delete(Speciality object) {

	}

	@Override
	public Speciality save(Speciality object) {
		return null;
	}

	@Override
	public Speciality findById(Long id) {
		return null;
	}
}
