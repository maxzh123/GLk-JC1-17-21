package example.app.controllers;

import example.app.models.City;
import example.app.repo.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController()
public class CityController {
    @Autowired
    private CityRepository repository;

    @GetMapping("/city/")
    public List<City> all() {
        List<City> result=new ArrayList<>();
        repository.findAll().forEach(result::add);
        return result;
    }

    @GetMapping("/city/{id}")
    public City one(@PathVariable("id") Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("NotFound:"+id));
    }


    @PutMapping("/city/{id}")
    public City update(@RequestBody City newCity, @PathVariable Long id) {
        return repository.findById(id)
                .map(city -> {
                    city.setTitle(newCity.getTitle());
                    return repository.save(city);
                })
                .orElseThrow(() -> new RuntimeException("NotFound:"+id));
    }

    @PutMapping("/city/")
    public City newOne(@RequestBody City newCity) {
                    return repository.save(newCity);
    }

    @DeleteMapping("/city/{id}")
    void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
