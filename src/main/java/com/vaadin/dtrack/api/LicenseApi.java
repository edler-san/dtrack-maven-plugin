/*
 * OWASP Dependency-Track
 * REST API of OWASP Dependency-Track
 *
 * OpenAPI spec version: 4.12.6
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vaadin.dtrack.api;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import com.vaadin.dtrack.ApiCallback;
import com.vaadin.dtrack.ApiClient;
import com.vaadin.dtrack.ApiException;
import com.vaadin.dtrack.ApiResponse;
import com.vaadin.dtrack.Configuration;
import com.vaadin.dtrack.Pair;
import com.vaadin.dtrack.ProgressRequestBody;
import com.vaadin.dtrack.ProgressResponseBody;

public class LicenseApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public LicenseApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LicenseApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void setHeadersOverrides(Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * Build call for createLicense
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createLicenseCall(License body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/license";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private com.squareup.okhttp.Call createLicenseValidateBeforeCall(License body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = createLicenseCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Creates a new custom license
     * &lt;p&gt;Requires permission &lt;strong&gt;SYSTEM_CONFIGURATION&lt;/strong&gt;&lt;/p&gt;
     * @param body  (optional)
     * @return License
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public License createLicense(License body) throws ApiException {
        ApiResponse<License> resp = createLicenseWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Creates a new custom license
     * &lt;p&gt;Requires permission &lt;strong&gt;SYSTEM_CONFIGURATION&lt;/strong&gt;&lt;/p&gt;
     * @param body  (optional)
     * @return ApiResponse&lt;License&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<License> createLicenseWithHttpInfo(License body) throws ApiException {
        com.squareup.okhttp.Call call = createLicenseValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<License>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates a new custom license (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;SYSTEM_CONFIGURATION&lt;/strong&gt;&lt;/p&gt;
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createLicenseAsync(License body, final ApiCallback<License> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createLicenseValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<License>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteLicense
     * @param licenseId The SPDX License ID of the license to delete (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteLicenseCall(String licenseId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/license/{licenseId}"
            .replaceAll("\\{" + "licenseId" + "\\}", apiClient.escapeString(licenseId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private com.squareup.okhttp.Call deleteLicenseValidateBeforeCall(String licenseId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'licenseId' is set
        if (licenseId == null) {
            throw new ApiException("Missing the required parameter 'licenseId' when calling deleteLicense(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteLicenseCall(licenseId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes a custom license
     * &lt;p&gt;Requires permission &lt;strong&gt;SYSTEM_CONFIGURATION&lt;/strong&gt;&lt;/p&gt;
     * @param licenseId The SPDX License ID of the license to delete (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteLicense(String licenseId) throws ApiException {
        deleteLicenseWithHttpInfo(licenseId);
    }

    /**
     * Deletes a custom license
     * &lt;p&gt;Requires permission &lt;strong&gt;SYSTEM_CONFIGURATION&lt;/strong&gt;&lt;/p&gt;
     * @param licenseId The SPDX License ID of the license to delete (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteLicenseWithHttpInfo(String licenseId) throws ApiException {
        com.squareup.okhttp.Call call = deleteLicenseValidateBeforeCall(licenseId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a custom license (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;SYSTEM_CONFIGURATION&lt;/strong&gt;&lt;/p&gt;
     * @param licenseId The SPDX License ID of the license to delete (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteLicenseAsync(String licenseId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteLicenseValidateBeforeCall(licenseId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getLicense
     * @param licenseId The SPDX License ID of the license to retrieve (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLicenseCall(String licenseId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/license/{licenseId}"
            .replaceAll("\\{" + "licenseId" + "\\}", apiClient.escapeString(licenseId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private com.squareup.okhttp.Call getLicenseValidateBeforeCall(String licenseId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'licenseId' is set
        if (licenseId == null) {
            throw new ApiException("Missing the required parameter 'licenseId' when calling getLicense(Async)");
        }
        
        com.squareup.okhttp.Call call = getLicenseCall(licenseId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Returns a specific license
     * 
     * @param licenseId The SPDX License ID of the license to retrieve (required)
     * @return License
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public License getLicense(String licenseId) throws ApiException {
        ApiResponse<License> resp = getLicenseWithHttpInfo(licenseId);
        return resp.getData();
    }

    /**
     * Returns a specific license
     * 
     * @param licenseId The SPDX License ID of the license to retrieve (required)
     * @return ApiResponse&lt;License&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<License> getLicenseWithHttpInfo(String licenseId) throws ApiException {
        com.squareup.okhttp.Call call = getLicenseValidateBeforeCall(licenseId, null, null);
        Type localVarReturnType = new TypeToken<License>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a specific license (asynchronously)
     * 
     * @param licenseId The SPDX License ID of the license to retrieve (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLicenseAsync(String licenseId, final ApiCallback<License> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getLicenseValidateBeforeCall(licenseId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<License>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLicenseListing
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLicenseListingCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/license/concise";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private com.squareup.okhttp.Call getLicenseListingValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLicenseListingCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Returns a concise listing of all licenses
     * 
     * @return List&lt;License&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<License> getLicenseListing() throws ApiException {
        ApiResponse<List<License>> resp = getLicenseListingWithHttpInfo();
        return resp.getData();
    }

    /**
     * Returns a concise listing of all licenses
     * 
     * @return ApiResponse&lt;List&lt;License&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<License>> getLicenseListingWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getLicenseListingValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<License>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a concise listing of all licenses (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLicenseListingAsync(final ApiCallback<List<License>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getLicenseListingValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<License>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLicenses
     * @param pageNumber The page to return. To be used in conjunction with &lt;code&gt;pageSize&lt;/code&gt;. (optional, default to 1)
     * @param pageSize Number of elements to return per page. To be used in conjunction with &lt;code&gt;pageNumber&lt;/code&gt;. (optional, default to 100)
     * @param offset Offset to start returning elements from. To be used in conjunction with &lt;code&gt;limit&lt;/code&gt;. (optional)
     * @param limit Number of elements to return per page. To be used in conjunction with &lt;code&gt;offset&lt;/code&gt;. (optional)
     * @param sortName Name of the resource field to sort on. (optional)
     * @param sortOrder Ordering of items when sorting with &lt;code&gt;sortName&lt;/code&gt;. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLicensesCall(String pageNumber, String pageSize, String offset, String limit, String sortName, String sortOrder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/license";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pageNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageNumber", pageNumber));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageSize", pageSize));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (sortName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sortName", sortName));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sortOrder", sortOrder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private com.squareup.okhttp.Call getLicensesValidateBeforeCall(String pageNumber, String pageSize, String offset, String limit, String sortName, String sortOrder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLicensesCall(pageNumber, pageSize, offset, limit, sortName, sortOrder, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Returns a list of all licenses with complete metadata for each license
     * 
     * @param pageNumber The page to return. To be used in conjunction with &lt;code&gt;pageSize&lt;/code&gt;. (optional, default to 1)
     * @param pageSize Number of elements to return per page. To be used in conjunction with &lt;code&gt;pageNumber&lt;/code&gt;. (optional, default to 100)
     * @param offset Offset to start returning elements from. To be used in conjunction with &lt;code&gt;limit&lt;/code&gt;. (optional)
     * @param limit Number of elements to return per page. To be used in conjunction with &lt;code&gt;offset&lt;/code&gt;. (optional)
     * @param sortName Name of the resource field to sort on. (optional)
     * @param sortOrder Ordering of items when sorting with &lt;code&gt;sortName&lt;/code&gt;. (optional)
     * @return List&lt;License&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<License> getLicenses(String pageNumber, String pageSize, String offset, String limit, String sortName, String sortOrder) throws ApiException {
        ApiResponse<List<License>> resp = getLicensesWithHttpInfo(pageNumber, pageSize, offset, limit, sortName, sortOrder);
        return resp.getData();
    }

    /**
     * Returns a list of all licenses with complete metadata for each license
     * 
     * @param pageNumber The page to return. To be used in conjunction with &lt;code&gt;pageSize&lt;/code&gt;. (optional, default to 1)
     * @param pageSize Number of elements to return per page. To be used in conjunction with &lt;code&gt;pageNumber&lt;/code&gt;. (optional, default to 100)
     * @param offset Offset to start returning elements from. To be used in conjunction with &lt;code&gt;limit&lt;/code&gt;. (optional)
     * @param limit Number of elements to return per page. To be used in conjunction with &lt;code&gt;offset&lt;/code&gt;. (optional)
     * @param sortName Name of the resource field to sort on. (optional)
     * @param sortOrder Ordering of items when sorting with &lt;code&gt;sortName&lt;/code&gt;. (optional)
     * @return ApiResponse&lt;List&lt;License&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<License>> getLicensesWithHttpInfo(String pageNumber, String pageSize, String offset, String limit, String sortName, String sortOrder) throws ApiException {
        com.squareup.okhttp.Call call = getLicensesValidateBeforeCall(pageNumber, pageSize, offset, limit, sortName, sortOrder, null, null);
        Type localVarReturnType = new TypeToken<List<License>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a list of all licenses with complete metadata for each license (asynchronously)
     * 
     * @param pageNumber The page to return. To be used in conjunction with &lt;code&gt;pageSize&lt;/code&gt;. (optional, default to 1)
     * @param pageSize Number of elements to return per page. To be used in conjunction with &lt;code&gt;pageNumber&lt;/code&gt;. (optional, default to 100)
     * @param offset Offset to start returning elements from. To be used in conjunction with &lt;code&gt;limit&lt;/code&gt;. (optional)
     * @param limit Number of elements to return per page. To be used in conjunction with &lt;code&gt;offset&lt;/code&gt;. (optional)
     * @param sortName Name of the resource field to sort on. (optional)
     * @param sortOrder Ordering of items when sorting with &lt;code&gt;sortName&lt;/code&gt;. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLicensesAsync(String pageNumber, String pageSize, String offset, String limit, String sortName, String sortOrder, final ApiCallback<List<License>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getLicensesValidateBeforeCall(pageNumber, pageSize, offset, limit, sortName, sortOrder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<License>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
