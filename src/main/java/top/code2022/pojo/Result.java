package top.code2022.pojo;

import lombok.Data;

import static top.code2022.enums.StateCodeEnum.FAILED;
import static top.code2022.enums.StateCodeEnum.SUCCESS;

/**
 * @Author Tiam
 * @Date 2022/12/25 15:14
 * @Description:
 */
@Data
public class Result<T> {
    /**
     * 返回状态
     */
    private boolean flag;
    /**
     * 状态码
     */
    private int code;
    /**
     * 返回信息
     */
    private String message;
    /**
     * 返回数据
     */
    private T data;

    /**
     * 当成功时, 不需返回数据
     * @return
     */
    public static Result ok() {
        return restResult(true);
    }

    /**
     * 当成功时, 返回的数据
     * @param data
     * @return
     * @param <T>
     */
    public static <T> Result<T> ok(T data) {
        return restResult(true, SUCCESS.getCode(), SUCCESS.getMessage(), data);
    }

    /**
     * 失败时
     * @return
     */
    public static Result fail() {
        return restResult(false);
    }

    private static <T> Result<T> restResult(boolean flag) {
        Result<T> apiResult = new Result<>();
        apiResult.setFlag(flag);
        apiResult.setCode(flag? SUCCESS.getCode() : FAILED.getCode());
        apiResult.setMessage(flag? SUCCESS.getMessage() : FAILED.getMessage());
        return apiResult;
    }

    private static <T> Result<T> restResult(boolean flag, Integer code, String message, T data) {
        Result<T> apiResult = new Result<>();
        apiResult.setFlag(flag);
        apiResult.setCode(code);
        apiResult.setMessage(message);
        apiResult.setData(data);
        return apiResult;
    }
}