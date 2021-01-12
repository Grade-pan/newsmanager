package summer2020.newslayui.newsmanger.error;

/**
 * Author: PXY
 * Email: 1817865166@qq.com
 * Date: 2021/1/9
 * 封装返回结果
 */
public class ResultMe<T> {
    private Integer code;//状态码
    private String message;//提示消息
    private T data;//数据

    public ResultMe() {
    }

    /**
     * @param code 响应码
     * @param message 响应信息
     */
    public ResultMe(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * @param code 响应码
     * @param message 响应信息
     * @param data 数据
     */
    public ResultMe(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * @param resultEnumMe 自定义枚举类，包含 code 和 message
     */
    public ResultMe(ResultEnumMe resultEnumMe) {
        this.code = resultEnumMe.getCode();
        this.message = resultEnumMe.getMessage();
    }

    /**
     * @param resultEnumMe 自定义枚举类，包含 code 和 message
     * @param data 数据
     */
    public ResultMe(ResultEnumMe resultEnumMe, T data) {
        this.code = resultEnumMe.getCode();
        this.message = resultEnumMe.getMessage();
        this.data = data;
    }

    /**
     * 其他异常处理方法返回的结果
     * @param resultEnumMe 自定义枚举类，包含 code 和 message
     * @return 返回其他异常
     */

    
    public static ResultMe<Object> otherError(ResultEnumMe resultEnumMe) {
        return new ResultMe<>(resultEnumMe);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
