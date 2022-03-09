package guru.springframework.sfgpetclinic.service.springdatajpa;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.repositories.PetTypeRepository;
import guru.springframework.sfgpetclinic.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {
	private final PetTypeRepository PetTypeRepository;

	public PetTypeSDJpaService(PetTypeRepository PetTypeRepository) {
		this.PetTypeRepository = PetTypeRepository;
	}

	@Override
	public Set<PetType> findAll() {
		Set<PetType> petTypes = new HashSet<>();
		PetTypeRepository.findAll().forEach(petTypes::add);
		return petTypes;
	}

	@Override
	public PetType findById(Long aLong) {
		return PetTypeRepository.findById(aLong).orElse(null);
	}

	@Override
	public PetType save(PetType object) {
		return PetTypeRepository.save(object);
	}

	@Override
	public void delete(PetType object) {
		PetTypeRepository.delete(object);
	}

	@Override
	public void deleteById(Long aLong) {
		PetTypeRepository.deleteById(aLong);
	}
}
