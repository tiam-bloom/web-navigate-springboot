package top.code2022.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.code2022.pojo.SiteInfo;

import java.util.List;

/**
 * @Author Tiam
 * @Date 2023/1/17 13:48
 * @Description:
 */
@Mapper
public interface SiteInfoMapper extends BaseMapper<SiteInfo> {
    /**
     * 联合查询全部完整的网站信息, 包括所属分类
     * @return
     */
    List<SiteInfo> findAllComplete();

}
