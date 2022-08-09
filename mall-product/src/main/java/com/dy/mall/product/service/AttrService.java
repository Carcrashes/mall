package com.dy.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.mall.common.utils.PageUtils;
import com.dy.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author dingyu
 * @email dingyu4849@qq.com
 * @date 2022-08-07 08:04:02
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

