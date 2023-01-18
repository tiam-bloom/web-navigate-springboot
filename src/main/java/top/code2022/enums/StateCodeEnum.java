package top.code2022.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author Tiam
 * @Date 2023/1/17 13:26
 * @Description:
 */
@Getter
@AllArgsConstructor
public enum StateCodeEnum {
    /**
     * 操作成功
     */
    SUCCESS(200,"操作成功"),
    /**
     * 失败
     */
    FAILED(400,"操作失败");
    /**
     * 状态码
     */
    private final Integer code;
    /**
     * 状态消息
     */
    private final String message;
}
