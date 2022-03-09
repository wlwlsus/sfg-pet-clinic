package guru.springframework.sfgpetclinic.service.springdatajpa;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.repositories.PetRepository;
import guru.springframework.sfgpetclinic.service.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {
	private final PetRepository PetRepository;

	public PetSDJpaService(PetRepository PetRepository) {
		this.PetRepository = PetRepository;
	}

	@Override
	public Set<Pet> findAll() {
		Set<Pet> pets = new HashSet<>();
		PetRepository.findAll().forEach(pets::add);
		return pets;
	}

	@Override
	public Pet findById(Long aLong) {
		return PetRepository.findById(aLong).orElse(null);
	}

	@Override
	public Pet save(Pet object) {
		return PetRepository.save(object);
	}

	@Override
	public void delete(Pet object) {
		PetRepository.delete(object);
	}

	@Override
	public void deleteById(Long aLong) {
		PetRepository.deleteById(aLong);
	}
}
