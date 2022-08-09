package com.dy.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dy.mall.common.utils.PageUtils;
import com.dy.mall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author dingyu
 * @email dingyu4849@qq.com
 * @date 2022-08-09 17:32:23
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

