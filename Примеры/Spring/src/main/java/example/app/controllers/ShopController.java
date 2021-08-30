package example.app.controllers;

import example.app.models.Shop;
import example.app.repo.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ShopController {
    @Autowired
    private ShopRepository repository;
    @GetMapping("/shop/")
    public List<Shop> all() {
        List<Shop> result=new ArrayList<>();
        repository.findAll().forEach(result::add);
        return result;
    }

    @GetMapping("/shop/{id}")
    public Shop one(@PathVariable("id") Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("NotFound:"+id));
    }

}
