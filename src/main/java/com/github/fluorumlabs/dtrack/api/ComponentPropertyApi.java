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


import com.github.fluorumlabs.dtrack.model.ComponentProperty;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComponentPropertyApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public ComponentPropertyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ComponentPropertyApi(ApiClient apiClient) {
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
     * Build call for createProperty
     * @param uuid The UUID of the component to create a property for (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createPropertyCall(UUID uuid, ComponentProperty body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/component/{uuid}/property"
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
    private com.squareup.okhttp.Call createPropertyValidateBeforeCall(UUID uuid, ComponentProperty body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling createProperty(Async)");
        }
        
        com.squareup.okhttp.Call call = createPropertyCall(uuid, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Creates a new component property
     * &lt;p&gt;Requires permission &lt;strong&gt;PORTFOLIO_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the component to create a property for (required)
     * @param body  (optional)
     * @return ComponentProperty
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ComponentProperty createProperty(UUID uuid, ComponentProperty body) throws ApiException {
        ApiResponse<ComponentProperty> resp = createPropertyWithHttpInfo(uuid, body);
        return resp.getData();
    }

    /**
     * Creates a new component property
     * &lt;p&gt;Requires permission &lt;strong&gt;PORTFOLIO_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the component to create a property for (required)
     * @param body  (optional)
     * @return ApiResponse&lt;ComponentProperty&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ComponentProperty> createPropertyWithHttpInfo(UUID uuid, ComponentProperty body) throws ApiException {
        com.squareup.okhttp.Call call = createPropertyValidateBeforeCall(uuid, body, null, null);
        Type localVarReturnType = new TypeToken<ComponentProperty>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates a new component property (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;PORTFOLIO_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the component to create a property for (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createPropertyAsync(UUID uuid, ComponentProperty body, final ApiCallback<ComponentProperty> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createPropertyValidateBeforeCall(uuid, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ComponentProperty>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteProperty
     * @param uuid The UUID of the component to delete a property from (required)
     * @param propertyUuid The UUID of the component property to delete (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deletePropertyCall(UUID uuid, UUID propertyUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/component/{uuid}/property/{propertyUuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()))
            .replaceAll("\\{" + "propertyUuid" + "\\}", apiClient.escapeString(propertyUuid.toString()));

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
    private com.squareup.okhttp.Call deletePropertyValidateBeforeCall(UUID uuid, UUID propertyUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling deleteProperty(Async)");
        }
        // verify the required parameter 'propertyUuid' is set
        if (propertyUuid == null) {
            throw new ApiException("Missing the required parameter 'propertyUuid' when calling deleteProperty(Async)");
        }
        
        com.squareup.okhttp.Call call = deletePropertyCall(uuid, propertyUuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Deletes a config property
     * &lt;p&gt;Requires permission &lt;strong&gt;PORTFOLIO_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the component to delete a property from (required)
     * @param propertyUuid The UUID of the component property to delete (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteProperty(UUID uuid, UUID propertyUuid) throws ApiException {
        deletePropertyWithHttpInfo(uuid, propertyUuid);
    }

    /**
     * Deletes a config property
     * &lt;p&gt;Requires permission &lt;strong&gt;PORTFOLIO_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the component to delete a property from (required)
     * @param propertyUuid The UUID of the component property to delete (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deletePropertyWithHttpInfo(UUID uuid, UUID propertyUuid) throws ApiException {
        com.squareup.okhttp.Call call = deletePropertyValidateBeforeCall(uuid, propertyUuid, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a config property (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;PORTFOLIO_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the component to delete a property from (required)
     * @param propertyUuid The UUID of the component property to delete (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePropertyAsync(UUID uuid, UUID propertyUuid, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deletePropertyValidateBeforeCall(uuid, propertyUuid, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getProperties
     * @param uuid The UUID of the component to retrieve properties for (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPropertiesCall(UUID uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/component/{uuid}/property"
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
    private com.squareup.okhttp.Call getPropertiesValidateBeforeCall(UUID uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling getProperties(Async)");
        }
        
        com.squareup.okhttp.Call call = getPropertiesCall(uuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Returns a list of all properties for the specified component
     * &lt;p&gt;Requires permission &lt;strong&gt;VIEW_PORTFOLIO&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the component to retrieve properties for (required)
     * @return List&lt;ComponentProperty&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ComponentProperty> getProperties(UUID uuid) throws ApiException {
        ApiResponse<List<ComponentProperty>> resp = getPropertiesWithHttpInfo(uuid);
        return resp.getData();
    }

    /**
     * Returns a list of all properties for the specified component
     * &lt;p&gt;Requires permission &lt;strong&gt;VIEW_PORTFOLIO&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the component to retrieve properties for (required)
     * @return ApiResponse&lt;List&lt;ComponentProperty&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ComponentProperty>> getPropertiesWithHttpInfo(UUID uuid) throws ApiException {
        com.squareup.okhttp.Call call = getPropertiesValidateBeforeCall(uuid, null, null);
        Type localVarReturnType = new TypeToken<List<ComponentProperty>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a list of all properties for the specified component (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;VIEW_PORTFOLIO&lt;/strong&gt;&lt;/p&gt;
     * @param uuid The UUID of the component to retrieve properties for (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPropertiesAsync(UUID uuid, final ApiCallback<List<ComponentProperty>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPropertiesValidateBeforeCall(uuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ComponentProperty>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
