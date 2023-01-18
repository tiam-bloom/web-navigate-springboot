package top.code2022.service;

import top.code2022.pojo.Category;

import java.util.List;

/**
 * @Author Tiam
 * @Date 2023/1/17 14:54
 * @Description:
 */

public interface CategoryService {
    /**
     * 查询全部分类
     * @return
     */
    List<Category> findAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Category findById(Integer id);

    /**
     * 新增分类
     * @param category
     * @return
     */
    int insertCategory(Category category);

    /**
     * 修改分类信息
     * @param category
     * @return
     */
    int updateCategory(Category category);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    int deleteCategoryById(Integer id);
}
