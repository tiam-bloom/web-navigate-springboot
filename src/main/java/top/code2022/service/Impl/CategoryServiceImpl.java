package top.code2022.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.code2022.mapper.CategoryMapper;
import top.code2022.pojo.Category;
import top.code2022.service.CategoryService;

import java.util.List;

/**
 * @Author Tiam
 * @Date 2023/1/17 15:20
 * @Description:
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> findAll() {
        return categoryMapper.selectList(null);
    }

    @Override
    public Category findById(Integer id) {
        return categoryMapper.selectById(id);
    }

    @Override
    public int insertCategory(Category category) {
        return categoryMapper.insert(category);
    }

    @Override
    public int updateCategory(Category category) {
        return categoryMapper.updateById(category);
    }

    @Override
    public int deleteCategoryById(Integer id) {
        return categoryMapper.deleteById(id);
    }
}
