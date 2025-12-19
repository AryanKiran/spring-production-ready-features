package com.codingshuttle.Aryan.prod_ready_features.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
//❌ No table is created for this class
//✅ Its fields become columns in child entity tables
@MappedSuperclass
public class AuditableEntity {
    @CreatedDate
    @Column(nullable=false)
    private LocalDateTime createdDate;


    @LastModifiedDate
    private LocalDateTime modifiedDate;

    @CreatedBy
    @Column(nullable=false)
    private String createdBy;

    @LastModifiedBy
    private String modifiedBy;
}
