package com.dy.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.mall.common.utils.PageUtils;
import com.dy.mall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author dingyu
 * @email dingyu4849@qq.com
 * @date 2022-08-08 20:50:30
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

