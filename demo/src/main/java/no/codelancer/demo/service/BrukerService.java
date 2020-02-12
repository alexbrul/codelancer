package no.codelancer.demo.service;

import no.codelancer.demo.dao.BrukerDao;
import no.codelancer.demo.model.Bruker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class BrukerService {

    private final BrukerDao brukerDao;
    @Autowired
    public BrukerService(@Qualifier("fakeDao") BrukerDao brukerdao){
        this.brukerDao = brukerdao;

    }

    @PostMapping
    public int addBruker(Bruker bruker){
        return brukerDao.insertBruker(bruker);

    }
}
