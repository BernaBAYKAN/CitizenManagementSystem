package com.bernabaykan.citizenmanagementsystem.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DrivingRequestDto {
    boolean hasDrivingLicense;
}
