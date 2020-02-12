package no.codelancer.demo.api;

import no.codelancer.demo.model.Bruker;
import no.codelancer.demo.service.BrukerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/bruker")
@RestController
public class BrukerController {

    private final BrukerService brukerService;

    @Autowired
    public BrukerController(BrukerService brukerService) {
        this.brukerService = brukerService;
    }
    @PostMapping
    public void addBruker(@RequestBody Bruker bruker){
        brukerService.addBruker(bruker);
    }
}
