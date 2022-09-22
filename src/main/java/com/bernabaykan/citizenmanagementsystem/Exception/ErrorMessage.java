package com.bernabaykan.citizenmanagementsystem.Exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ErrorMessage {
    private int code;  // 1001
    private String message; // kimlik(id) bulunamadı
    private List<String> fields;
}
