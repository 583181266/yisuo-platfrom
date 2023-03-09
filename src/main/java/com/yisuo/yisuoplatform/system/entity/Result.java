package com.yisuo.yisuoplatform.system.entity;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

/**
 * @author huangbentai
 * @date 2023/3/8 23:33
 */
@Data
public class Result<T>{

    private Integer code;

    private String msg;

    private T data;

    private Result(){

    }

    @NotNull
    public static <T> Result<T> ok(T data){
        Result<T> result = new Result<>();
        result.setCode(200);
        result.setMsg("操作成功");
        result.setData(data);
        return result;
    }

    public static <T> Result<T> ok() {
        Result<T> result = new Result<>();
        result.setCode(200);
        result.setMsg("操作成功");
        result.setData(null);
        return result;
    }
}
