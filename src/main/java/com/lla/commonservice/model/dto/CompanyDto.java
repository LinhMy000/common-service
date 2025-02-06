package com.lla.commonservice.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.List;

@Data
public class CompanyDto {
    private String id;
    private String name;
    private List<DeveloperDto> developers;

    @JsonProperty("isActive")
    private boolean isActive;

    @CreatedDate
    private Date created;
}
