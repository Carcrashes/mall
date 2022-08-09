package com.dy.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dy.mall.product.entity.BrandEntity;
import com.dy.mall.product.service.BrandService;
import feign.QueryMap;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest()
class MallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
    }

    @Test
    void testAddBrand(){
        BrandEntity entity=new BrandEntity();
        entity.setName("apple");
        brandService.save(entity);
    }

    @Test
    void testSelectAll(){
        List<BrandEntity> list = brandService.list();
        for (BrandEntity entity: list) {
            System.out.println(entity.getName());
        }
    }

    @Test
    void testSelectById(){
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
        for (BrandEntity entity: list) {
            System.out.println(entity.getName());
        }
    }

}
