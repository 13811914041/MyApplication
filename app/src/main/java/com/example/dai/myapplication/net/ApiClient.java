package com.example.dai.myapplication.net;


public class ApiClient {
	public static final String UTF_8 = "UTF-8";
	public static final String DESC = "descend";
	public static final String ASC = "ascend";

	private final static int TIMEOUT_CONNECTION = 20000;
	private final static int TIMEOUT_SOCKET = 20000;
	private final static int RETRY_TIME = 3;

	private static String appCookie;
	private static String appUserAgent;

//	private static String _MakeURL(String p_url, Map<String, Object> params) {
//		StringBuilder url = new StringBuilder(p_url);
//		if (url.indexOf("?") < 0)
//			url.append('?');
//
//		for (String name : params.keySet()) {
//			url.append('&');
//			url.append(name);
//			url.append('=');
//			url.append(String.valueOf(params.get(name)));
//			// 不做URLEncoder处理
//			// url.append(URLEncoder.encode(String.valueOf(params.get(name)),
//			// UTF_8));
//		}
//
//		return url.toString().replace("?&", "?");
//	}
//
//	public static InputStream http_get(String url) throws AppException {
//		// System.out.println("get_url==> "+url);
//		// String cookie = getCookie(appContext);
//		// String userAgent = getUserAgent(appContext);
//
//		String cookie = "";
//		String userAgent = "";
//
//		HttpClient httpClient = null;
//		GetMethod httpGet = null;
//
//		String responseBody = "";
//		int time = 0;
//		do {
//			try {
//				httpClient = getHttpClient();
//				httpGet = getHttpGet(url, cookie, userAgent);
//				int statusCode = httpClient.executeMethod(httpGet);
//				if (statusCode != HttpStatus.SC_OK) {
//					throw AppException.http(statusCode);
//				}
//				responseBody = httpGet.getResponseBodyAsString();
//				// System.out.println("XMLDATA=====>"+responseBody);
//				break;
//			} catch (HttpException e) {
//				time++;
//				if (time < RETRY_TIME) {
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e1) {
//					}
//					continue;
//				}
//				// 发生致命的异常，可能是协议不对或者返回的内容有问题
//				e.printStackTrace();
//				throw AppException.http(e);
//			} catch (IOException e) {
//				time++;
//				if (time < RETRY_TIME) {
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e1) {
//					}
//					continue;
//				}
//				// 发生网络异常
//				e.printStackTrace();
//				throw AppException.network(e);
//			} catch (Exception e) {
//
//				String aa = e.getMessage();
//				time++;
//				if (time < RETRY_TIME) {
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e1) {
//					}
//					continue;
//				}
//				// 发生网络异常
//				e.printStackTrace();
//				throw AppException.network(e);
//			} finally {
//				// 释放连接
//				httpGet.releaseConnection();
//				httpClient = null;
//			}
//		} while (time < RETRY_TIME);
//
//		responseBody = responseBody.replaceAll("\\p{Cntrl}", "");
//
//		return new ByteArrayInputStream(responseBody.getBytes());
//	}
//
//	public static String http_get(AppApplication application, String url)
//			throws AppException {
//		// System.out.println("get_url==> "+url);
//		// String cookie = getCookie(appContext);
//		// String userAgent = getUserAgent(appContext);
//
//		String cookie = "";
//		String userAgent = "";
//
//		HttpClient httpClient = null;
//		GetMethod httpGet = null;
//
//		String responseBody = "";
//		int time = 0;
//		do {
//			try {
//				httpClient = getHttpClient();
//				httpGet = getHttpGet(url, cookie, userAgent);
//				int statusCode = httpClient.executeMethod(httpGet);
//				if (statusCode != HttpStatus.SC_OK) {
//					throw AppException.http(statusCode);
//				}
//				responseBody = httpGet.getResponseBodyAsString();
//				// System.out.println("XMLDATA=====>"+responseBody);
//				break;
//			} catch (HttpException e) {
//				time++;
//				if (time < RETRY_TIME) {
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e1) {
//					}
//					continue;
//				}
//				// 发生致命的异常，可能是协议不对或者返回的内容有问题
//				e.printStackTrace();
//				throw AppException.http(e);
//			} catch (IOException e) {
//				time++;
//				if (time < RETRY_TIME) {
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e1) {
//					}
//					continue;
//				}
//				// 发生网络异常
//				e.printStackTrace();
//				throw AppException.network(e);
//			} finally {
//				// 释放连接
//				httpGet.releaseConnection();
//				httpClient = null;
//			}
//		} while (time < RETRY_TIME);
//
//		responseBody = responseBody.replaceAll("\\p{Cntrl}", "");
//
//		return responseBody;
//	}
//
//	public static InputStream http_get_stream(AppApplication application, String url)
//			throws AppException {
//
//		String responseBody = http_get(application, url);
//		return new ByteArrayInputStream(responseBody.getBytes());
//	}
//
//	private static GetMethod getHttpGet(String url, String cookie,
//                                        String userAgent) {
//		GetMethod httpGet = new GetMethod(url);
//		// 设置 请求超时时间
//		httpGet.getParams().setSoTimeout(TIMEOUT_SOCKET);
//		httpGet.setRequestHeader("Host", URLs.API_HOST);
//		httpGet.setRequestHeader("Connection", "Keep-Alive");
//		httpGet.setRequestHeader("Cookie", cookie);
//		httpGet.setRequestHeader("User-Agent", userAgent);
//		return httpGet;
//	}
//
//	private static HttpClient getHttpClient() {
//		HttpClient httpClient = new HttpClient();
//		// 设置 HttpClient 接收 Cookie,用与浏览器一样的策略
//		httpClient.getParams().setCookiePolicy(
//				CookiePolicy.BROWSER_COMPATIBILITY);
//		// 设置 默认的超时重试处理策略
//		httpClient.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
//				new DefaultHttpMethodRetryHandler());
//		// 设置 连接超时时间
//		httpClient.getHttpConnectionManager().getParams()
//				.setConnectionTimeout(TIMEOUT_CONNECTION);
//		// 设置 读数据超时时间
//		httpClient.getHttpConnectionManager().getParams()
//				.setSoTimeout(TIMEOUT_SOCKET);
//		// 设置 字符集
//		httpClient.getParams().setContentCharset(UTF_8);
//		return httpClient;
//	}
//
//	public static ProductList getProductList(AppContext appContext, final int typeid, int pageIndex) throws AppException {
//		String url = String.format("%s?type=%d&page=%d&limit=10", URLs.API_V3_PRODUCT_LIST,typeid, pageIndex);
//		try {
//			return ProductList.parse(http_get(appContext, url));
//		} catch (Exception e) {
//			if (e instanceof AppException)
//				throw (AppException) e;
//			throw AppException.network(e);
//		}
//	}

}
