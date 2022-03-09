package guru.springframework.sfgpetclinic.service.springdatajpa;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.repositories.VetRepository;
import guru.springframework.sfgpetclinic.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {
	private final VetRepository VetRepository;

	public VetSDJpaService(VetRepository vetRepository) {
		this.VetRepository = vetRepository;
	}

	@Override
	public Set<Vet> findAll() {
		Set<Vet> vets = new HashSet<>();
		VetRepository.findAll().forEach(vets::add);
		return vets;
	}

	@Override
	public Vet findById(Long aLong) {
		return VetRepository.findById(aLong).orElse(null);
	}

	@Override
	public Vet save(Vet object) {
		return VetRepository.save(object);
	}

	@Override
	public void delete(Vet object) {
		VetRepository.delete(object);
	}

	@Override
	public void deleteById(Long aLong) {
		VetRepository.deleteById(aLong);
	}
}
