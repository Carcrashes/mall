package com.dy.mall.order.dao;

import com.dy.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author dingyu
 * @email dingyu4849@qq.com
 * @date 2022-08-08 20:50:31
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
