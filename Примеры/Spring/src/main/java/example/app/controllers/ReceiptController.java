package example.app.controllers;


import example.app.models.Receipt;
import example.app.repo.ReceiptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReceiptController {
    @Autowired
    private ReceiptRepository repository;

    @GetMapping("/receipt/")
    public List<Receipt> all() {
        List<Receipt> result=new ArrayList<>();
        repository.findAll().forEach(result::add);
        return result;
    }

    @GetMapping("/receipt/{id}")
    public Receipt one(@PathVariable("id") Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("NotFound:"+id));
    }

}
