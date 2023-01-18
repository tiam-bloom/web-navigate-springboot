package top.code2022.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.code2022.mapper.SiteInfoMapper;
import top.code2022.pojo.SiteInfo;
import top.code2022.service.SiteInfoService;

import java.util.List;

/**
 * @Author Tiam
 * @Date 2023/1/17 15:33
 * @Description:
 */
@Service
public class SiteInfoServiceImpl implements SiteInfoService {
    @Autowired
    private SiteInfoMapper siteInfoMapper;

    @Override
    public List<SiteInfo> findAll() {
        return siteInfoMapper.selectList(null);
    }

    @Override
    public List<SiteInfo> findAllComplete() {
        return siteInfoMapper.findAllComplete();
    }

    @Override
    public List<SiteInfo> findByCategoryId(Integer categoryId) {
        return siteInfoMapper.selectList(new QueryWrapper<SiteInfo>().eq("category_id", categoryId));
    }

    @Override
    public List<SiteInfo> findByTitleOrDesc(String keywords) {
        return siteInfoMapper.selectList(new QueryWrapper<SiteInfo>().like("title", keywords).or().like("description", keywords));
    }

    @Override
    public int insertSiteInfo(SiteInfo siteInfo) {
        return siteInfoMapper.insert(siteInfo);
    }

    @Override
    public int deleteSiteInfoById(String id) {
        return siteInfoMapper.deleteById(id);
    }

    @Override
    public int updateSiteInfo(SiteInfo siteInfo) {
        return siteInfoMapper.updateById(siteInfo);
    }
}
