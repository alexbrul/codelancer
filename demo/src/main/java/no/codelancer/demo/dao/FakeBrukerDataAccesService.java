package no.codelancer.demo.dao;

import no.codelancer.demo.model.Bruker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakeBrukerDataAccesService implements BrukerDao{

    private static List<Bruker> DB = new ArrayList<>();

    @Override
    public int insertBruker(UUID id, Bruker bruker) {
        DB.add(new Bruker(id, bruker.getName()));


        return 1;
    }
}
