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


import com.github.fluorumlabs.dtrack.model.ProjectProperty;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectPropertyApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public ProjectPropertyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProjectPropertyApi(ApiClient apiClient) {
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
     * Build call for createProperty1
     * @param uuid The UUID of the project to create a property for (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createProperty1Call(UUID uuid, ProjectProperty body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/project/{uuid}/property"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

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
            "application/json"
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
    private com.squareup.okhttp.Call createProperty1ValidateBeforeCall(UUID uuid, ProjectProperty body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling createProperty1(Async)");
        }
        
        com.squareup.okhttp.Call call = createProperty1Call(uuid, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Creates a new project property
     * &lt;p&gt;Requires permission &lt;strong&gt;PORTFOLIO_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the project to create a property for (required)
     * @param body  (optional)
     * @return ProjectProperty
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProjectProperty createProperty1(UUID uuid, ProjectProperty body) throws ApiException {
        ApiResponse<ProjectProperty> resp = createProperty1WithHttpInfo(uuid, body);
        return resp.getData();
    }

    /**
     * Creates a new project property
     * &lt;p&gt;Requires permission &lt;strong&gt;PORTFOLIO_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the project to create a property for (required)
     * @param body  (optional)
     * @return ApiResponse&lt;ProjectProperty&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProjectProperty> createProperty1WithHttpInfo(UUID uuid, ProjectProperty body) throws ApiException {
        com.squareup.okhttp.Call call = createProperty1ValidateBeforeCall(uuid, body, null, null);
        Type localVarReturnType = new TypeToken<ProjectProperty>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates a new project property (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;PORTFOLIO_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the project to create a property for (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createProperty1Async(UUID uuid, ProjectProperty body, final ApiCallback<ProjectProperty> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createProperty1ValidateBeforeCall(uuid, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProjectProperty>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteProperty1
     * @param uuid The UUID of the project to delete a property from (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteProperty1Call(UUID uuid, ProjectProperty body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/project/{uuid}/property"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
    private com.squareup.okhttp.Call deleteProperty1ValidateBeforeCall(UUID uuid, ProjectProperty body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling deleteProperty1(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteProperty1Call(uuid, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes a config property
     * &lt;p&gt;Requires permission &lt;strong&gt;PORTFOLIO_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the project to delete a property from (required)
     * @param body  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteProperty1(UUID uuid, ProjectProperty body) throws ApiException {
        deleteProperty1WithHttpInfo(uuid, body);
    }

    /**
     * Deletes a config property
     * &lt;p&gt;Requires permission &lt;strong&gt;PORTFOLIO_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the project to delete a property from (required)
     * @param body  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteProperty1WithHttpInfo(UUID uuid, ProjectProperty body) throws ApiException {
        com.squareup.okhttp.Call call = deleteProperty1ValidateBeforeCall(uuid, body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a config property (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;PORTFOLIO_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the project to delete a property from (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteProperty1Async(UUID uuid, ProjectProperty body, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteProperty1ValidateBeforeCall(uuid, body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getProperties1
     * @param uuid The UUID of the project to retrieve properties for (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getProperties1Call(UUID uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/project/{uuid}/property"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BearerAuth" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getProperties1ValidateBeforeCall(UUID uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling getProperties1(Async)");
        }
        
        com.squareup.okhttp.Call call = getProperties1Call(uuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Returns a list of all ProjectProperties for the specified project
     * &lt;p&gt;Requires permission &lt;strong&gt;PORTFOLIO_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the project to retrieve properties for (required)
     * @return List&lt;ProjectProperty&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ProjectProperty> getProperties1(UUID uuid) throws ApiException {
        ApiResponse<List<ProjectProperty>> resp = getProperties1WithHttpInfo(uuid);
        return resp.getData();
    }

    /**
     * Returns a list of all ProjectProperties for the specified project
     * &lt;p&gt;Requires permission &lt;strong&gt;PORTFOLIO_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the project to retrieve properties for (required)
     * @return ApiResponse&lt;List&lt;ProjectProperty&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ProjectProperty>> getProperties1WithHttpInfo(UUID uuid) throws ApiException {
        com.squareup.okhttp.Call call = getProperties1ValidateBeforeCall(uuid, null, null);
        Type localVarReturnType = new TypeToken<List<ProjectProperty>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a list of all ProjectProperties for the specified project (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;PORTFOLIO_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the project to retrieve properties for (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getProperties1Async(UUID uuid, final ApiCallback<List<ProjectProperty>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getProperties1ValidateBeforeCall(uuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ProjectProperty>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateProperty
     * @param uuid The UUID of the project to create a property for (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updatePropertyCall(UUID uuid, ProjectProperty body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/project/{uuid}/property"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

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
            "application/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updatePropertyValidateBeforeCall(UUID uuid, ProjectProperty body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling updateProperty(Async)");
        }
        
        com.squareup.okhttp.Call call = updatePropertyCall(uuid, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Updates a project property
     * &lt;p&gt;Requires permission &lt;strong&gt;PORTFOLIO_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the project to create a property for (required)
     * @param body  (optional)
     * @return ProjectProperty
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProjectProperty updateProperty(UUID uuid, ProjectProperty body) throws ApiException {
        ApiResponse<ProjectProperty> resp = updatePropertyWithHttpInfo(uuid, body);
        return resp.getData();
    }

    /**
     * Updates a project property
     * &lt;p&gt;Requires permission &lt;strong&gt;PORTFOLIO_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the project to create a property for (required)
     * @param body  (optional)
     * @return ApiResponse&lt;ProjectProperty&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProjectProperty> updatePropertyWithHttpInfo(UUID uuid, ProjectProperty body) throws ApiException {
        com.squareup.okhttp.Call call = updatePropertyValidateBeforeCall(uuid, body, null, null);
        Type localVarReturnType = new TypeToken<ProjectProperty>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a project property (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;PORTFOLIO_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the project to create a property for (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updatePropertyAsync(UUID uuid, ProjectProperty body, final ApiCallback<ProjectProperty> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updatePropertyValidateBeforeCall(uuid, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProjectProperty>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
