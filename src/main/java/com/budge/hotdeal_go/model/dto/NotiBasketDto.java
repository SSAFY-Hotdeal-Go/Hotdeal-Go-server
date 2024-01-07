package com.budge.hotdeal_go.model.dto;

import lombok.Data;

@Data
public class NotiBasketDto {
    private String title;
    private String userId;
    private String address;
    private String sendYN;
    private String createTime;
}