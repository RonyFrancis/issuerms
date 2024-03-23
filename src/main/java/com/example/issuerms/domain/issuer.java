package com.example.issuerms.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="issuer")
public class issuer {
    @GeneratedValue
    @Id
    private Integer Id;

    private Integer isbn;

    private Integer custID;

    private Integer noOfCopies;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public Integer getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(Integer noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public Integer getCustID() {
        return custID;
    }

    public void setCustID(Integer custID) {
        this.custID = custID;
    }
}
