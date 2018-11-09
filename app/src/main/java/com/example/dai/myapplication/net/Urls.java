package com.example.dai.myapplication.net;

/**
 * Created by dai on 2017/11/22.
 */

public class Urls {


    public final static String HOST_TEST = "https://womx-test.wifi.email";

    public final static String HOST_RELEASE = "https://womx.wifi.email";

//    public final static String HOST = AppCache.isDebug() ? HOST_TEST : HOST_RELEASE;
    public final static String HOST = HOST_RELEASE;

    //获取token
    public final static String API_GET_TOKEN = HOST + "/api/v1.0/auth/auth_token";

    //账户-授权 - 登录验证码
    public final static String API_GET_VALID_CODE = HOST + "/api/v1.0/auth/login_msg_token";

    //全局资源 - 查询资源版本
    public final static String API_GET_VERSION_DATA = HOST + "/api/v1.0/globals/versions";

    //移动端-轮播图 - 获取首页Banner
    public final static String API_GET_HOME_BANNER = HOST + "/api/v1.0/mobile/index_banner";

    //移动端-版本更新 - 获取版本信息
    public final static String API_GET_VERSION_DATA_DETAIL = HOST + "/api/v1.0/mobile/version";

    //全局资源 - 获取区域列表
    public final static String API_GET_DISTRICT_LIST = HOST + "/api/v1.0/globals/district_list";

    //全局资源 - 获取行业列表
    public final static String API_GET_INDUSTRY_LIST = HOST + "/api/v1.0/globals/industry_list";

    //选项类别 - 获取类别列表
    public final static String API_GET_CATEGORY_LIST = HOST + "/api/v1.0/globals/category_list";

    //账户-其他 - 获取Wicode
    public final static String API_GET_AUTH_WICODE = HOST + "/api/v1.0/auth/wicode";

    //账户-授权 - 换手机验证码
    public final static String API_GET_AUTH_CHANGE_PHONE_MSG = HOST + "/api/v1.0/auth/change_phone_msg";

    //用户-当前用户 - 修改用户信息
    public final static String API_PUT_USER_INFO = HOST + "/api/v1.0/user/self_info";

    //客户-门店 - 获取门店列表
    public final static String API_GET_CLIENT_STORE_LIST = HOST + "/api/v1.0/client/store_list";

    //客户-门店 - 获取门店详情
    public final static String API_GET_CLIENT_STORE_DETAIL = HOST + "/api/v1.0/client/store";

    //删除SSID
    public final static String API_GET_CLIENT_DELETE_SSID = HOST + "/api/v1.0/client/network/ssid";

    //新增SSID
    public final static String API_GET_CLIENT_ADD_SSID = HOST + "/api/v1.0/client/network/ssid/";

    //修改SSID
    public final static String API_GET_CLIENT_EDIT_SSID = HOST + "/api/v1.0/client/network/ssid";

    //人事管理-权限 - 获取权限列表
    public final static String API_GET_PERMISSION_LIST = HOST + "/api/v1.0/pem/organization/permission_list";

    //人事管理-用户 - 获取用户
    public final static String API_GET_USER_INFO = HOST + "/api/v1.0/pem/organization/user/";

    //人事管理-用户 - 修改用户
    public final static String API_PUT_ORGANIZATION_USER_INFO = HOST + "/api/v1.0/pem/organization/user/";

    //人事管理-部门 - 获取部门列表
    public final static String API_PUT_ORGANIZATION_DEPARTMENT_LIST = HOST + "/api/v1.0/pem/organization/department_list";

    //人事管理-部门 - 获取部门
    public final static String API_PUT_ORGANIZATION_DEPARTMENT = HOST + "/api/v1.0/pem/organization/department/";

    //人事管理-用户 - 获取用户列表
    public final static String API_PUT_ORGANIZATION_USER_LIST = HOST + "/api/v1.0/pem/organization/user_list";

    //人事管理-职务 - 获取职务列表
    public final static String API_PUT_ORGANIZATION_TITLE_LIST = HOST + "/api/v1.0/pem/organization/title_list";

    //人事管理-岗位 - 获取岗位列表
    public final static String API_PUT_ORGANIZATION_POST_LIST = HOST + "/api/v1.0/pem/organization/post_list";

    //人事管理-角色 - 获取角色列表
    public final static String API_PUT_ORGANIZATION_ROLE_LIST = HOST + "/api/v1.0/pem/organization/role_list";

    //人事管理-岗位 - 删除岗位
    public final static String API_DELETE_ORGANIZATION_POST = HOST + "/api/v1.0/pem/organization/post/";

    //人事管理-部门 - 修改部门岗位(批量)
    public final static String API_PUT_ORGANIZATION_DEPARTMENT_POST = HOST + "/api/v1.0/pem/organization/department/%s/post";

    //人事管理-部门 - 新增部门岗位
    public final static String API_POST_ORGANIZATION_DEPT_POST = HOST + "/api/v1.0/pem/organization/dept_post";

    //人事管理-部门 - 修改部门岗位
    public final static String API_PUT_ORGANIZATION_POST = HOST + "/api/v1.0/pem/organization/dept_post/";

    //附录-其他 - 模糊查询(自动补全)
    public final static String API_GET_GLOBALS_FUZZY_KEY = HOST + "/api/v1.0/globals/fuzzy_key";

    //附录-云配置 - 获取用户云配置
    public final static String API_GET_GLOBALS_CLOUD_CONF = HOST + "/api/v1.0/globals/cloud_conf";

    //附录-云配置 - 修改用户云配置
    public final static String API_PUT_GLOBALS_CLOUD_CONF = HOST + "/api/v1.0/globals/cloud_conf";

    //人事管理-部门 - 删除部门岗位
    public final static String API_DELETE_ORGANIZATION_DEPT_POST = HOST + "/api/v1.0/pem/organization/dept_post/";

    //附录-文件 - 上传图片/文件
    public final static String API_POST_GLOBALS_FILE = HOST + "/api/v1.0/globals/file";

    //人事管理-角色 - 删除角色
    public final static String API_DELETE_ROLE = HOST + "/api/v1.0/pem/organization/role/";

}
