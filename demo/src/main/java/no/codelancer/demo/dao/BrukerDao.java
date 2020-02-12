package no.codelancer.demo.dao;

import no.codelancer.demo.model.Bruker;

import java.util.UUID;

public interface BrukerDao {

    int insertBruker(UUID id, Bruker bruker);

    default int insertBruker(Bruker bruker){

        UUID id = UUID.randomUUID();
        return insertBruker(id, bruker);

    }
}
