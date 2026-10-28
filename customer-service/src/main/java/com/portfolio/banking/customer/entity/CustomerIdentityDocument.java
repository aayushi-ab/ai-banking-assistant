package com.portfolio.banking.customer.entity;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "customer_identity_documents")
public class CustomerIdentityDocument  {

    @Id 
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn (name = "customer_id", nullable = false)
    private Customer customer;

    /*@Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private IdentityDocumentType documentType;

    @Column(nullable = false, length = 1024)
    private String encryptedDocumentNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "verification_status", nullable = false)
    private VerificationStatus verificationStatus;*/

    protected CustomerIdentityDocument() {
    }

    public Customer getCustomer(){
        return this.customer;
    }


    
}
