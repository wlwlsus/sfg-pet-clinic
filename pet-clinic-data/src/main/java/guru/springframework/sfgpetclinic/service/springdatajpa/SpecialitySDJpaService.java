package guru.springframework.sfgpetclinic.service.springdatajpa;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.repositories.SpecialityRepository;
import guru.springframework.sfgpetclinic.service.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialityService {
	private final SpecialityRepository SpecialityRepository;

	public SpecialitySDJpaService(SpecialityRepository SpecialityRepository) {
		this.SpecialityRepository = SpecialityRepository;
	}

	@Override
	public Set<Speciality> findAll() {
		Set<Speciality> specialities = new HashSet<>();
		SpecialityRepository.findAll().forEach(specialities::add);
		return specialities;
	}

	@Override
	public Speciality findById(Long aLong) {
		return SpecialityRepository.findById(aLong).orElse(null);
	}

	@Override
	public Speciality save(Speciality object) {
		return SpecialityRepository.save(object);
	}

	@Override
	public void delete(Speciality object) {
		SpecialityRepository.delete(object);
	}

	@Override
	public void deleteById(Long aLong) {
		SpecialityRepository.deleteById(aLong);
	}
}
