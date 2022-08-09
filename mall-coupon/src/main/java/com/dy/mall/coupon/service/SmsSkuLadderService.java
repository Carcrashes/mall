package com.dy.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.mall.common.utils.PageUtils;
import com.dy.mall.coupon.entity.SmsSkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author dingyu
 * @email dingyu4849@qq.com
 * @date 2022-08-09 17:22:21
 */
public interface SmsSkuLadderService extends IService<SmsSkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

