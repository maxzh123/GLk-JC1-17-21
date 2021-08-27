package example.app.controllers;


import example.app.models.People;
import example.app.repo.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PeopleController {
    @Autowired
    private PeopleRepository repository;
    @GetMapping("/people/")
    public List<People> all() {
        List<People> result=new ArrayList<>();
        repository.findAll().forEach(result::add);
        return result;
    }

    @GetMapping("/people/{id}")
    public People one(@PathVariable("id") Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("NotFound:"+id));
    }

}
