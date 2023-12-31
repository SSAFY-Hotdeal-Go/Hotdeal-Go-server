package com.budge.hotdeal_go.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class HotDealDto {
    private String title;
    private String price;
    private String shippingFee;
    private String purchasingPlace;
    private String url;
    private Long likeCnt;
    private String time;
    private String img;
}