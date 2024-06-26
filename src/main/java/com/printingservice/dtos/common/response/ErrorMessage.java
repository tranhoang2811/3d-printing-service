package com.printingservice.dtos.common.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ErrorMessage {
    private Integer statusCode;
    private Date timestamp;
    private String message;
    private String description;
}
