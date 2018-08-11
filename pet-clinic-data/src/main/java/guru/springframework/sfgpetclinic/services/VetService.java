package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    public Vet findById(Long id);

    public Vet save(Vet pet);

    public Set<Vet> findall();
}