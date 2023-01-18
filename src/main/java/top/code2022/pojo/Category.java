package top.code2022.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author Tiam
 * @Date 2023/1/17 14:20
 * @Description:
 */
@Data
@TableName("category")
@ApiModel(value = "Category", description = "分类信息")
public class Category {
    @TableId(type = IdType.AUTO)
    @ApiModelProperty("类别唯一标识")
    private Integer id;
    @ApiModelProperty(name = "类名", value = "类别唯一标识", required = true)
    private String category;
}
