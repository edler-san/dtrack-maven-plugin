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

package com.github.fluorumlabs.dtrack.api;

import com.github.fluorumlabs.dtrack.ApiCallback;
import com.github.fluorumlabs.dtrack.ApiClient;
import com.github.fluorumlabs.dtrack.ApiException;
import com.github.fluorumlabs.dtrack.ApiResponse;
import com.github.fluorumlabs.dtrack.Configuration;
import com.github.fluorumlabs.dtrack.Pair;
import com.github.fluorumlabs.dtrack.ProgressRequestBody;
import com.github.fluorumlabs.dtrack.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.github.fluorumlabs.dtrack.model.AclMappingRequest;
import com.github.fluorumlabs.dtrack.model.Project;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AclApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public AclApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AclApi(ApiClient apiClient) {
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
     * Build call for addMapping
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addMappingCall(AclMappingRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/acl/mapping";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BearerAuth" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addMappingValidateBeforeCall(AclMappingRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = addMappingCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Adds an ACL mapping
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param body  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void addMapping(AclMappingRequest body) throws ApiException {
        addMappingWithHttpInfo(body);
    }

    /**
     * Adds an ACL mapping
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param body  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> addMappingWithHttpInfo(AclMappingRequest body) throws ApiException {
        com.squareup.okhttp.Call call = addMappingValidateBeforeCall(body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Adds an ACL mapping (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addMappingAsync(AclMappingRequest body, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addMappingValidateBeforeCall(body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteMapping
     * @param teamUuid The UUID of the team to delete the mapping for (required)
     * @param projectUuid The UUID of the project to delete the mapping for (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteMappingCall(UUID teamUuid, UUID projectUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/acl/mapping/team/{teamUuid}/project/{projectUuid}"
            .replaceAll("\\{" + "teamUuid" + "\\}", apiClient.escapeString(teamUuid.toString()))
            .replaceAll("\\{" + "projectUuid" + "\\}", apiClient.escapeString(projectUuid.toString()));

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BearerAuth" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteMappingValidateBeforeCall(UUID teamUuid, UUID projectUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'teamUuid' is set
        if (teamUuid == null) {
            throw new ApiException("Missing the required parameter 'teamUuid' when calling deleteMapping(Async)");
        }
        // verify the required parameter 'projectUuid' is set
        if (projectUuid == null) {
            throw new ApiException("Missing the required parameter 'projectUuid' when calling deleteMapping(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteMappingCall(teamUuid, projectUuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Removes an ACL mapping
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param teamUuid The UUID of the team to delete the mapping for (required)
     * @param projectUuid The UUID of the project to delete the mapping for (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteMapping(UUID teamUuid, UUID projectUuid) throws ApiException {
        deleteMappingWithHttpInfo(teamUuid, projectUuid);
    }

    /**
     * Removes an ACL mapping
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param teamUuid The UUID of the team to delete the mapping for (required)
     * @param projectUuid The UUID of the project to delete the mapping for (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteMappingWithHttpInfo(UUID teamUuid, UUID projectUuid) throws ApiException {
        com.squareup.okhttp.Call call = deleteMappingValidateBeforeCall(teamUuid, projectUuid, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes an ACL mapping (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param teamUuid The UUID of the team to delete the mapping for (required)
     * @param projectUuid The UUID of the project to delete the mapping for (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteMappingAsync(UUID teamUuid, UUID projectUuid, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteMappingValidateBeforeCall(teamUuid, projectUuid, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for retrieveProjects
     * @param uuid The UUID of the team to retrieve mappings for (required)
     * @param pageNumber The page to return. To be used in conjunction with &lt;code&gt;pageSize&lt;/code&gt;. (optional, default to 1)
     * @param pageSize Number of elements to return per page. To be used in conjunction with &lt;code&gt;pageNumber&lt;/code&gt;. (optional, default to 100)
     * @param offset Offset to start returning elements from. To be used in conjunction with &lt;code&gt;limit&lt;/code&gt;. (optional)
     * @param limit Number of elements to return per page. To be used in conjunction with &lt;code&gt;offset&lt;/code&gt;. (optional)
     * @param sortName Name of the resource field to sort on. (optional)
     * @param sortOrder Ordering of items when sorting with &lt;code&gt;sortName&lt;/code&gt;. (optional)
     * @param excludeInactive Optionally excludes inactive projects from being returned (optional)
     * @param onlyRoot Optionally excludes children projects from being returned (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveProjectsCall(UUID uuid, String pageNumber, String pageSize, String offset, String limit, String sortName, String sortOrder, Boolean excludeInactive, Boolean onlyRoot, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/acl/team/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

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
        if (excludeInactive != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("excludeInactive", excludeInactive));
        if (onlyRoot != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("onlyRoot", onlyRoot));

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BearerAuth" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call retrieveProjectsValidateBeforeCall(UUID uuid, String pageNumber, String pageSize, String offset, String limit, String sortName, String sortOrder, Boolean excludeInactive, Boolean onlyRoot, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling retrieveProjects(Async)");
        }
        
        com.squareup.okhttp.Call call = retrieveProjectsCall(uuid, pageNumber, pageSize, offset, limit, sortName, sortOrder, excludeInactive, onlyRoot, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Returns the projects assigned to the specified team
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the team to retrieve mappings for (required)
     * @param pageNumber The page to return. To be used in conjunction with &lt;code&gt;pageSize&lt;/code&gt;. (optional, default to 1)
     * @param pageSize Number of elements to return per page. To be used in conjunction with &lt;code&gt;pageNumber&lt;/code&gt;. (optional, default to 100)
     * @param offset Offset to start returning elements from. To be used in conjunction with &lt;code&gt;limit&lt;/code&gt;. (optional)
     * @param limit Number of elements to return per page. To be used in conjunction with &lt;code&gt;offset&lt;/code&gt;. (optional)
     * @param sortName Name of the resource field to sort on. (optional)
     * @param sortOrder Ordering of items when sorting with &lt;code&gt;sortName&lt;/code&gt;. (optional)
     * @param excludeInactive Optionally excludes inactive projects from being returned (optional)
     * @param onlyRoot Optionally excludes children projects from being returned (optional)
     * @return List&lt;Project&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Project> retrieveProjects(UUID uuid, String pageNumber, String pageSize, String offset, String limit, String sortName, String sortOrder, Boolean excludeInactive, Boolean onlyRoot) throws ApiException {
        ApiResponse<List<Project>> resp = retrieveProjectsWithHttpInfo(uuid, pageNumber, pageSize, offset, limit, sortName, sortOrder, excludeInactive, onlyRoot);
        return resp.getData();
    }

    /**
     * Returns the projects assigned to the specified team
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the team to retrieve mappings for (required)
     * @param pageNumber The page to return. To be used in conjunction with &lt;code&gt;pageSize&lt;/code&gt;. (optional, default to 1)
     * @param pageSize Number of elements to return per page. To be used in conjunction with &lt;code&gt;pageNumber&lt;/code&gt;. (optional, default to 100)
     * @param offset Offset to start returning elements from. To be used in conjunction with &lt;code&gt;limit&lt;/code&gt;. (optional)
     * @param limit Number of elements to return per page. To be used in conjunction with &lt;code&gt;offset&lt;/code&gt;. (optional)
     * @param sortName Name of the resource field to sort on. (optional)
     * @param sortOrder Ordering of items when sorting with &lt;code&gt;sortName&lt;/code&gt;. (optional)
     * @param excludeInactive Optionally excludes inactive projects from being returned (optional)
     * @param onlyRoot Optionally excludes children projects from being returned (optional)
     * @return ApiResponse&lt;List&lt;Project&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Project>> retrieveProjectsWithHttpInfo(UUID uuid, String pageNumber, String pageSize, String offset, String limit, String sortName, String sortOrder, Boolean excludeInactive, Boolean onlyRoot) throws ApiException {
        com.squareup.okhttp.Call call = retrieveProjectsValidateBeforeCall(uuid, pageNumber, pageSize, offset, limit, sortName, sortOrder, excludeInactive, onlyRoot, null, null);
        Type localVarReturnType = new TypeToken<List<Project>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns the projects assigned to the specified team (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the team to retrieve mappings for (required)
     * @param pageNumber The page to return. To be used in conjunction with &lt;code&gt;pageSize&lt;/code&gt;. (optional, default to 1)
     * @param pageSize Number of elements to return per page. To be used in conjunction with &lt;code&gt;pageNumber&lt;/code&gt;. (optional, default to 100)
     * @param offset Offset to start returning elements from. To be used in conjunction with &lt;code&gt;limit&lt;/code&gt;. (optional)
     * @param limit Number of elements to return per page. To be used in conjunction with &lt;code&gt;offset&lt;/code&gt;. (optional)
     * @param sortName Name of the resource field to sort on. (optional)
     * @param sortOrder Ordering of items when sorting with &lt;code&gt;sortName&lt;/code&gt;. (optional)
     * @param excludeInactive Optionally excludes inactive projects from being returned (optional)
     * @param onlyRoot Optionally excludes children projects from being returned (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveProjectsAsync(UUID uuid, String pageNumber, String pageSize, String offset, String limit, String sortName, String sortOrder, Boolean excludeInactive, Boolean onlyRoot, final ApiCallback<List<Project>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = retrieveProjectsValidateBeforeCall(uuid, pageNumber, pageSize, offset, limit, sortName, sortOrder, excludeInactive, onlyRoot, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Project>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
