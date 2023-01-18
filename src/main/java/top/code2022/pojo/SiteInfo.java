package top.code2022.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author Tiam
 * @Date 2022/12/25 14:45
 * @Description:
 */
@Data
@TableName("site_info")
public class SiteInfo {
    @TableId
    @ApiModelProperty(name = "ID", value = "网站信息的唯一标识", required = true)
    private String id;
    @ApiModelProperty("网站标题")
    private String title;
    @ApiModelProperty("网站图标地址")
    private String icon;
    @ApiModelProperty("网站地址")
    private String url;
    @ApiModelProperty("网站描述")
    private String description;
    @ApiModelProperty("网站所属分类id")
    private Integer categoryId;
    @TableField(exist = false) // 不为数据库表字段
    @ApiModelProperty("网站分类名")
    private String category;
}
