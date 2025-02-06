package com.lla.commonservice.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Document(collection = "company")
public class Company {
    @Id
    private String id;
    private String name;
    private List<Developer> developers = new ArrayList<>();

    @JsonProperty("isActive")
    private boolean isActive;

    @CreatedDate
    private Date created;
}
