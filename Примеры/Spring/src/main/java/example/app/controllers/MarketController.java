package example.app.controllers;


import example.app.models.Market;
import example.app.repo.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MarketController {
    @Autowired
private MarketRepository repository;
    @GetMapping("/market/")
    public List<Market> all() {
        List<Market> result=new ArrayList<>();
        repository.findAll().forEach(result::add);
        return result;
    }

    @GetMapping("/market/{id}")
    public Market one(@PathVariable("id") Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("NotFound:"+id));
    }

}
