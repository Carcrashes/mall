package com.dy.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.mall.common.utils.PageUtils;
import com.dy.mall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author dingyu
 * @email dingyu4849@qq.com
 * @date 2022-08-07 08:04:01
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

