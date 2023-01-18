package top.code2022.webnavigatespringboot;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.code2022.mapper.CategoryMapper;
import top.code2022.mapper.SiteInfoMapper;
import top.code2022.pojo.Category;
import top.code2022.pojo.SiteInfo;
import top.code2022.service.CategoryService;
import top.code2022.service.SiteInfoService;

import java.util.List;

@SpringBootTest
class WebNavigateSpringbootApplicationTests {
    @Autowired
    private SiteInfoMapper siteInfoMapper;
    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    void testSelectSiteInfo() {
        // List<SiteInfo> siteInfos = siteInfoMapper.selectList(null);
        QueryWrapper<SiteInfo> qw = new QueryWrapper<>();
        qw.eq("category_id",1);
        List<SiteInfo> siteInfos = siteInfoMapper.selectList(qw);
        siteInfos.forEach(System.out::println);
    }

    @Test
    void testSelectAllCategory() {
        List<Category> categories = categoryMapper.selectList(null);
        categories.forEach(System.out::println);
    }

    @Test
    void testSelectCatById(){
        Category category = categoryMapper.selectById(1);
        System.out.println(category);
    }

    @Test
    void findAllCompleteSiteInfo() {
        List<SiteInfo> siteInfos = siteInfoMapper.findAllComplete();
        siteInfos.forEach(System.out::println);
    }
    @Autowired
    private SiteInfoService siteInfoService;

    @Autowired
    private CategoryService categoryService;
    @Test
    void testInsertSiteInfo(){
        SiteInfo siteInfo = new SiteInfo();
        siteInfo.setId("1");
        siteInfo.setTitle("1");
        siteInfo.setIcon("1");
        siteInfo.setUrl("1");
        siteInfo.setDescription("1");
        siteInfo.setCategoryId(1);

        int i = siteInfoService.insertSiteInfo(siteInfo);
        System.out.println(i);
    }
    @Test
    void testUpdateSiteInfo(){
        SiteInfo siteInfo = new SiteInfo();
        siteInfo.setId("1");
        siteInfo.setTitle("2");
        siteInfo.setIcon("2");
        siteInfo.setUrl("2");
        siteInfo.setDescription("2");
        siteInfo.setCategoryId(2);

        int i = siteInfoService.updateSiteInfo(siteInfo);
        System.out.println(i);
    }

    @Test
    void testDeleteSiteInfo(){
        int i = siteInfoService.deleteSiteInfoById("1");
        System.out.println(i);
    }

    @Test
    void testInsertCat(){
        Category category = new Category();
        // category.setId(0);
        category.setCategory("测试");
        int i = categoryService.insertCategory(category);
        System.out.println(i);
    }

    @Test
    void testUpdateCat(){
        Category category = new Category();
        category.setId(8);
        category.setCategory("测试111");
        int i = categoryService.updateCategory(category);
        System.out.println(i);
    }

    @Test
    void testDeleteCat(){
        int i = categoryService.deleteCategoryById(8);
        System.out.println(i);
    }

    @Test
    void testFindByCategoryId(){
        List<SiteInfo> list = siteInfoService.findByCategoryId(1);
        list.forEach(System.out::println);
    }

    @Test
    void testFindByTitleOrDesc(){
        List<SiteInfo> list = siteInfoService.findByTitleOrDesc("vue");
        list.forEach(System.out::println);
    }
}
