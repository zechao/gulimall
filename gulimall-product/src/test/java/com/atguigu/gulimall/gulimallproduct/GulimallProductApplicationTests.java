package com.atguigu.gulimall.gulimallproduct;

import com.atguigu.gulimall.gulimallproduct.entity.BrandEntity;
import com.atguigu.gulimall.gulimallproduct.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("");
        brandEntity.setName("Huawei");
        brandService.save(brandEntity);

        System.out.println("Success saved");
    }

}
