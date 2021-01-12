package summer2020.newslayui.newsmanger.error;

import io.purge.starter.dispose.exception.error.details.BusinessErrorCode;

/**
 * Author: PXY
 * Email: 1817865166@qq.com
 * Date: 2021/1/10
 */
public class BusinessException extends RuntimeException{
    private String code;
    private boolean isShowMsg = true;

    /**
     * 使用枚举传参
     *
     * @param errorCode 异常枚举
     */
    public BusinessException(BusinessErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    /**
     * 使用自定义消息
     *
     * @param code 值
     * @param msg 详情
     */
    public BusinessException(String code, String msg) {
        super(msg);
        this.code = code;
    }

}
