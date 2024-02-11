package com.example.backend.model.request;

import lombok.Data;
import lombok.Builder;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UpdateGameRequest {

    private String newName;
    private Float newPrice;

}