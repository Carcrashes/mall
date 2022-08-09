package com.dy.mall.product.dao;

import com.dy.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author dingyu
 * @email dingyu4849@qq.com
 * @date 2022-08-07 08:04:01
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
