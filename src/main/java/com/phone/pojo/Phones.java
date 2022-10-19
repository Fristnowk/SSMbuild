package com.phone.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Phones {
    private int phoneID;
    private String phoneName;
    private int phoneCounts;
    private String detail;
}
