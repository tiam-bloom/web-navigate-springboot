package top.code2022.service;

import top.code2022.pojo.SiteInfo;

import java.util.List;

/**
 * @Author Tiam
 * @Date 2023/1/17 14:55
 * @Description:
 */

public interface SiteInfoService {
    /**
     * 查询全部网站信息
     *
     * @return
     */
    List<SiteInfo> findAll();

    /**
     * 联合分类一起查询
     *
     * @return
     */
    List<SiteInfo> findAllComplete();

    /**
     * 根据分类id查询
     *
     * @param categoryId
     * @return
     */
    List<SiteInfo> findByCategoryId(Integer categoryId);

    /**
     * 根据标题或描述模糊查询
     *
     * @param keywords
     * @return
     */
    List<SiteInfo> findByTitleOrDesc(String keywords);

    /**
     * 插入一条新的网站信息
     * @param siteInfo
     * @return
     */
    int insertSiteInfo(SiteInfo siteInfo);

    /**
     * 根据id删除数据
     * @param id
     * @return
     */
    int deleteSiteInfoById(String id);

    /**
     * 修改信息
     * @param siteInfo
     * @return
     */
    int updateSiteInfo(SiteInfo siteInfo);
}
