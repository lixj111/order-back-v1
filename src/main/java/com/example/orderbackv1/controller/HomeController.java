package com.example.orderbackv1.controller;

import com.example.orderbackv1.common.ApiResult;
import com.example.orderbackv1.common.SwiperData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/public/v1/home")
public class HomeController {

    @GetMapping("/swiperdata")
    public ApiResult<List<SwiperData>> getSwiperData(){
        List<SwiperData> swiperDataList = new ArrayList<>();
        swiperDataList.add(new SwiperData("http://localhost:8888/static/swiperdata1.jpg",""));
        swiperDataList.add(new SwiperData("http://localhost:8888/static/swiperdata2.jpg",""));
        swiperDataList.add(new SwiperData("http://localhost:8888/static/swiperdata3.jpg",""));
        return new ApiResult<>(swiperDataList,new ApiResult.Meta("获取成功",200));
    }

}
