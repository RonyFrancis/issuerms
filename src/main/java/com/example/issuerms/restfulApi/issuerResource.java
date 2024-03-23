package com.example.issuerms.restfulApi;

import com.example.issuerms.repo.IssuerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.issuerms.domain.issuer;
import java.util.List;

@RestController
public class issuerResource {
    @Autowired
    private IssuerRepo issuerRepo;
    @GetMapping("/issue")
    public List<issuer> getAllBooks() {
        return issuerRepo.findAll();
    }

    @PostMapping("/add_issuer")
    public issuer addIssuer(@RequestBody issuer issuer) {
        return issuerRepo.save(issuer);
    }

    @PutMapping("/cancel_issue/{id}")
    public issuer cancelIssuer(@PathVariable Integer id, @RequestBody issuer issuer) {
        issuer Issue = issuerRepo.findById(id).orElse(null);
        if (Issue == null) {
            return null;
        }
        Integer copies = Issue.getNoOfCopies();
        Issue.setNoOfCopies(copies + 1);
        return issuerRepo.save(Issue);
    }
}
