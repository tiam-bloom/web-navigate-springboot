package top.code2022.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.code2022.pojo.Category;
import top.code2022.pojo.Result;
import top.code2022.service.CategoryService;

/**
 * @Author Tiam
 * @Date 2023/1/17 15:03
 * @Description: 分类控制器
 */
@RestController
@CrossOrigin
@Api("网站分类管理")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/listCategories")
    @ApiOperation("查询全部分类信息")
    public Result<?> listCategories() {
        return Result.ok(categoryService.findAll());
    }

    @GetMapping("/getCategoryById")
    @ApiOperation("根据id查询分类")
    @ApiImplicitParam(name = "id", value = "类别唯一标识", required = true, paramType = "Integer")
    public Result<?> getCategoryById( Integer id) {
        return Result.ok(categoryService.findById(id));
    }

    @PostMapping("/insertCategory")
    @ApiOperation("新增分类")
    public Result<?> insertCategory(@RequestBody Category category) {
        return Result.ok(categoryService.insertCategory(category));
    }

    @PutMapping("/updateCategory")
    @ApiOperation("修改分类")
    public Result<?> updateCategory(@RequestBody Category category) {
        return Result.ok(categoryService.updateCategory(category));
    }

    @DeleteMapping("/deleteCategoryById")
    @ApiOperation("删除分类")
    @ApiImplicitParam(name = "id", value = "类别唯一标识", required = true, paramType = "Integer")
    public Result<?> deleteCategoryById(Integer id) {
        return Result.ok(categoryService.deleteCategoryById(id));
    }
}
