package com.atguigu.gulimall.gulimallproduct;

import com.atguigu.gulimall.gulimallproduct.entity.BrandEntity;
import com.atguigu.gulimall.gulimallproduct.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void createBrand() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("");
        brandEntity.setName("Huawei");
        brandService.save(brandEntity);

        System.out.println("Success saved");
    }
	@Test
	void updateBrand() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setBrandId(1L);
		brandEntity.setDescript("updated description");

		brandService.updateById(brandEntity);
	}

	@Test
	void queryBrand() {



		List list =  brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1));
		list.stream().forEach(System.out::println);
	}


}
