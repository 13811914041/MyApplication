package com.example.dai.myapplication.net;

/**
 * Created by dai on 2017/11/22.
 */

public class ApiCode {

    //请求成功
    public final static int OK = 0;

    //系统繁忙
    public final static int FAILED = -1;

    //AuthToken失效
    public final static int TOKEN_EXPIRED = 4001;

    //您没有相关访问权限
    public final static int NO_PERMISSION = 4002;

    //网络错误，请稍后重试
    public final static int NETWORK_ERROR = 4003;

    //API不存在
    public final static int API_NOT_FOUND = 4004;

    //AuthToken即将过期, 请更换新token
    public final static int UPDATE_TOKEN_NEEDED = 4005;

    //查询的数据不存在
    public final static int DATA_NOT_FOUND = 4010;

    //参数传递有误
    public final static int ILLEGAL_PARAMETER = 4011;

    //该账户未绑定手机, 请联系管理员绑定手机号
    public final static int NO_VALID_MOBILE = 4012;

    //手机验证码发送失败, 请稍后再试
    public final static int SEND_VALID_CODE_FAILED = 4013;

    //参数格式有误
    public final static int ILLEGAL_PARAMETER_FORM = 4014;

    //密钥错误
    public final static int SECRET_KEY_ERROR = 4015;

    //手机号已存在, 一个手机号只能绑定一个账号
    public final static int MOBILE_ALREADY_EXIST = 4016;

    //服务器内部错误
    public final static int SERVER_ERROR = 5001;

    //操作失败
    public final static int OPERATION_FAILED = 5002;

}
