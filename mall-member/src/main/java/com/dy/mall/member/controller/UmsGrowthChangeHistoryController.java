package com.dy.mall.member.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dy.mall.member.entity.UmsGrowthChangeHistoryEntity;
import com.dy.mall.member.service.UmsGrowthChangeHistoryService;
import com.dy.mall.common.utils.PageUtils;
import com.dy.mall.common.utils.R;



/**
 * 成长值变化历史记录
 *
 * @author dingyu
 * @email dingyu4849@qq.com
 * @date 2022-08-09 17:09:09
 */
@RestController
@RequestMapping("member/umsgrowthchangehistory")
public class UmsGrowthChangeHistoryController {
    @Autowired
    private UmsGrowthChangeHistoryService umsGrowthChangeHistoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:umsgrowthchangehistory:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = umsGrowthChangeHistoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:umsgrowthchangehistory:info")
    public R info(@PathVariable("id") Long id){
		UmsGrowthChangeHistoryEntity umsGrowthChangeHistory = umsGrowthChangeHistoryService.getById(id);

        return R.ok().put("umsGrowthChangeHistory", umsGrowthChangeHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:umsgrowthchangehistory:save")
    public R save(@RequestBody UmsGrowthChangeHistoryEntity umsGrowthChangeHistory){
		umsGrowthChangeHistoryService.save(umsGrowthChangeHistory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:umsgrowthchangehistory:update")
    public R update(@RequestBody UmsGrowthChangeHistoryEntity umsGrowthChangeHistory){
		umsGrowthChangeHistoryService.updateById(umsGrowthChangeHistory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:umsgrowthchangehistory:delete")
    public R delete(@RequestBody Long[] ids){
		umsGrowthChangeHistoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
