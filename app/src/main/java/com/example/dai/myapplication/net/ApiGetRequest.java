package com.example.dai.myapplication.net;

import android.text.TextUtils;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by yun on 2017/5/24.
 */

public class ApiGetRequest {

//    private void addToken(JSONObject data) {
//        if (!TextUtils.isEmpty(UserAction.Token)) {
//            data.put("token", UserAction.Token);
//        }
//        data.put("appVersion", Tools.APP_VERSION);
//    }

//    //获取token
//    public static void getToken(String source, String code, String mobile_num, NetWorkCallBack netWorkCallBack) {
//        try {
//            String url = String.format("%s?source=%s&code=%s", Urls.API_GET_TOKEN, source, code);
//            if (!TextUtils.isEmpty(mobile_num)) {
//                url = String.format("%s&mobile_num=%s", url, mobile_num);
//            }
//            AsyncApiClient.get(url, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //账户-授权 - 登录验证码
//    public static void getValidCode(String account, NetWorkCallBack netWorkCallBack) {
//        try {
//            String url = String.format("%s?account=%s", Urls.API_GET_VALID_CODE, account);
//            AsyncApiClient.get(url, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //    待查询版本的资源列表
//    //- android -> 查询Android APP版本
//    //- ios -> 查询IOS APP版本
//    //- district -> 查询区域信息版本
//    //- industry -> 查询品牌行业信息版本
//    //- category -> 查询类别信息版本
//    //- title -> 查询职务信息版本
//    //- post -> 查询岗位信息版本
//    //- role -> 查询角色信息版本
//    //- dept -> 查询部门信息版本
//    //- permissions -> 查询权限树版本
//    //- user_info -> 查询当前用户信息版本
//    //- user_perm -> 查询当前用户权限版本
//    //- app_index_banner -> 查询App首页轮播图版本
//    //全局资源 - 查询资源版本
//    public static void getVersionData(NetWorkCallBack netWorkCallBack) {
//        try {
//            String url = String.format("%s?resources=%s", Urls.API_GET_VERSION_DATA, "android,district,industry,category,title,post,role,dept,user_info,user_perm,permissions,app_index_banner");
//            AsyncApiClient.get(url, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //移动端-轮播图 - 获取首页Banner
//    public static void getBanner(NetWorkCallBack netWorkCallBack) {
//        try {
//            AsyncApiClient.get(Urls.API_GET_HOME_BANNER, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //移动端-版本更新 - 获取版本信息
//    public static void getVersion(NetWorkCallBack netWorkCallBack) {
//        try {
//            //channel = 1 安卓手机 (2 iOS)
//            String url = String.format("%s?channel=%s", Urls.API_GET_VERSION_DATA_DETAIL, "android");
//            AsyncApiClient.get(url, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //全局资源 - 获取区域列表
//    public static void getDistrictList(NetWorkCallBack netWorkCallBack) {
//        try {
//            AsyncApiClient.get(Urls.API_GET_DISTRICT_LIST, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //全局资源 - 获取行业列表
//    public static void getIndustryList(NetWorkCallBack netWorkCallBack) {
//        try {
//            AsyncApiClient.get(Urls.API_GET_INDUSTRY_LIST, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //选项类别 - 获取类别列表
//    public static void getCategoryList(NetWorkCallBack netWorkCallBack) {
//        try {
//            AsyncApiClient.get(Urls.API_GET_CATEGORY_LIST, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //账户-其他 - 获取Wicode
//    public static void getAuthWicode(NetWorkCallBack netWorkCallBack) {
//        try {
//            AsyncApiClient.get(Urls.API_GET_AUTH_WICODE, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //账户-授权 - 换手机验证码
//    public static void getAuthChangePhoneMsg(String mobile, NetWorkCallBack netWorkCallBack) {
//        try {
//            String url = String.format("%s?Mobile=%s", Urls.API_GET_AUTH_CHANGE_PHONE_MSG, mobile);
//            AsyncApiClient.get(url, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //客户-门店 - 获取门店列表
//    public static void getClientStoreList(String page, NetWorkCallBack netWorkCallBack) {
//        try {
//            String url = String.format("%s?page=%s&limit=10", Urls.API_GET_CLIENT_STORE_LIST, page);
//            AsyncApiClient.get(url, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //客户-门店 - 获取门店列表
//    public static void getStoreDetail(String StoreID, NetWorkCallBack netWorkCallBack) {
//        try {
//            String channels = "basic,bgserver,map,network,ssid,device,device_status,maintain,broadband_pay,survey,malfunction,image_store,image_net,image_point";
//            String url = String.format("%s/%s?channels=%s", Urls.API_GET_CLIENT_STORE_DETAIL, StoreID, channels);
//            AsyncApiClient.get(url, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //人事管理-权限 - 获取权限列表
//    public static void getPermissionList(NetWorkCallBack netWorkCallBack) {
//        try {
//            AsyncApiClient.get(Urls.API_GET_PERMISSION_LIST, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //人事管理-用户 - 获取用户
//    //  按需获取用户信息
//    // - account 账户信息
//    // - title 职务信息
//    // - dept 部门信息
//    // - post 岗位信息
//    // - profile1 初级信息
//    // - profile2 高级信息
//    // - role 角色信息
//    // - perms 个人权限
//    // - all_perms 所有权限(包括个人权限和角色权限)
//    public static void getUserInfo(String UserID, NetWorkCallBack netWorkCallBack) {
//        try {
//            if (UserID.equals("0")) {
//                UserID = "";
//            }
//            String url = Urls.API_GET_USER_INFO + UserID + "?channels=account,title,dept,post,profile1,profile2,role,perms,all_perms";
//            AsyncApiClient.get(url, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //人事管理-部门 - 获取部门列表
//    public static void getOrganizationDepartmentList(NetWorkCallBack netWorkCallBack) {
//        try {
//            // 部门类别(10.总部, 20.普通部门, 30.兼职工程师部门)
//            String DeptType = "20";
//            String url = Urls.API_PUT_ORGANIZATION_DEPARTMENT_LIST + "?DeptType=" + DeptType;
//            AsyncApiClient.get(url, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //人事管理-部门 - 获取部门
//    public static void getOrganizationDepartment(int DeptID, NetWorkCallBack netWorkCallBack) {
//        try {
//            String url = Urls.API_PUT_ORGANIZATION_DEPARTMENT + DeptID + "";
//            AsyncApiClient.get(url, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //人事管理-用户 - 获取用户列表
////    public static void getOrganizationUserList(int page, int UserNature, int Status, int DeptID, int IncludeSubset, NetWorkCallBack netWorkCallBack) {
////        try {
////            String url = Urls.API_PUT_ORGANIZATION_USER_LIST + "?page=1" + page + "&UserNature=" + UserNature + "&Status=" + Status + "&DeptID"
////                    + DeptID + "&IncludeSubset" + IncludeSubset + "&limit=500";
////            AsyncApiClient.get(url, netWorkCallBack);
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////    }
//    //人事管理-用户 - 获取用户列表
//    public static void getOrganizationUserList(int DeptID, NetWorkCallBack netWorkCallBack) {
//        try {
//            String url = Urls.API_PUT_ORGANIZATION_USER_LIST + "?page=1&UserNature=1&Status=1&DeptID="
//                    + DeptID + "&IncludeSubset=0&limit=0";
//            AsyncApiClient.get(url, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //人事管理-职务 - 获取职务列表
//    public static void getOrganizationTitleList(NetWorkCallBack netWorkCallBack) {
//        try {
//            AsyncApiClient.get(Urls.API_PUT_ORGANIZATION_TITLE_LIST, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //人事管理-岗位 - 获取岗位列表
//    public static void getOrganizationPostList(NetWorkCallBack netWorkCallBack) {
//        try {
//            AsyncApiClient.get(Urls.API_PUT_ORGANIZATION_POST_LIST, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //人事管理-岗位 - 获取岗位列表
//    public static void getOrganizationRoleList(NetWorkCallBack netWorkCallBack) {
//        try {
//            AsyncApiClient.get(Urls.API_PUT_ORGANIZATION_ROLE_LIST, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //    检索用户姓名（中文名 or 英文名）
//    public static final String SEARCH_USER = "user";
//    //    检索客户名称（支持检索多组关键字）
//    public static final String SEARCH_BUSINESS = "business";
//    //    检索品牌名称（支持检索多组关键字）
//    public static final String SEARCH_BRAND = "brand";
//    //    检索门店名称（支持检索多组关键字）
//    public static final String SEARCH_STORE = "store";
//
//    //附录-其他 - 模糊查询(自动补全)
//    public static void getSearch(String channel, String key, NetWorkCallBack netWorkCallBack) {
//        try {
//            String url = String.format("%s?channel=%s&key=%s", Urls.API_GET_GLOBALS_FUZZY_KEY, channel, key);
//            AsyncApiClient.get(url, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //    查询所有云配置信息
//    public static final String ALL_MENU = "All";
//    //     App上已选择的小应用ID列表
//    public static final String APP_MENU = "AppMenu";
//
//    //附录-云配置 - 获取用户云配置
//    public static void getGlobalsCloudConf(String resources, NetWorkCallBack netWorkCallBack) {
//        try {
//            String url = Urls.API_GET_GLOBALS_CLOUD_CONF + "?resources=" + resources;
//            AsyncApiClient.get(url, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
