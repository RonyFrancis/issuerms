package com.example.issuerms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.issuerms.domain.issuer;
import org.springframework.stereotype.Repository;

@Repository
public interface IssuerRepo extends JpaRepository<issuer, Integer> {
}
