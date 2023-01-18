package top.code2022.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.code2022.pojo.Result;
import top.code2022.pojo.SiteInfo;
import top.code2022.service.SiteInfoService;

/**
 * @Author Tiam
 * @Date 2022/12/25 14:00
 * @Description:
 * Ctrl+F9 快速重新构建
 */
@RestController
@CrossOrigin
@Api("网站导航信息管理")
public class SiteInfoController {

    @GetMapping("/test/{name}")
    @ApiOperation("测试接口1")
    public Result<?> test(@PathVariable("name")String name){
        return Result.ok("params is "+name);
    }
    @GetMapping("/test")
    @ApiOperation("测试接口2")
    public Result<?> test(){
        return Result.ok();
    }

    @Autowired
    private SiteInfoService siteInfoService;

    @GetMapping("/listSiteInfos")
    @ApiOperation("查询全部网站信息")
    public Result<?> listSiteInfos(){
        return Result.ok(siteInfoService.findAll());
    }

    @GetMapping("/listSiteInfosByCategoryId/{id}")
    @ApiOperation("根据分类id查询")
    @ApiImplicitParam(name = "id", value = "类别唯一标识", required = true, paramType = "Integer")
    public Result<?> listSiteInfosByCategoryId(@PathVariable("id")Integer id){
        return Result.ok(siteInfoService.findByCategoryId(id));
    }

    @GetMapping("/listSiteInfosByTitleOrDesc/{keywords}")
    @ApiOperation("根据关键词模糊查询标题和描述")
    @ApiImplicitParam(name = "keywords", value = "关键字", required = true, paramType = "String")
    public Result<?> listSiteInfosByCategoryId(@PathVariable("keywords")String keywords){
        return Result.ok(siteInfoService.findByTitleOrDesc(keywords));
    }

    @PostMapping("/insertSiteInfo")
    @ApiOperation("新增网站信息")
    public Result<?> insertSiteInfo(@RequestBody SiteInfo siteInfo){
        return Result.ok(siteInfoService.insertSiteInfo(siteInfo));
    }

    @PutMapping("/updateSiteInfo")
    @ApiOperation("修改网站信息")
    public Result<?> updateSiteInfo(@RequestBody SiteInfo siteInfo){
        return Result.ok(siteInfoService.updateSiteInfo(siteInfo));
    }

    @DeleteMapping("/deleteSiteInfoById/{id}")
    @ApiOperation("根据id删除网站信息")
    @ApiImplicitParam(name = "id", value = "信息唯一标识", required = true, paramType = "String")
    public Result<?> deleteSiteInfoById(@PathVariable("id")String id){
        return Result.ok(siteInfoService.deleteSiteInfoById(id));
    }
}
