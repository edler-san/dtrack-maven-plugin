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


import com.github.fluorumlabs.dtrack.model.Analysis;
import com.github.fluorumlabs.dtrack.model.AnalysisRequest;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalysisApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public AnalysisApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AnalysisApi(ApiClient apiClient) {
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
     * Build call for retrieveAnalysis
     * @param component The UUID of the component (required)
     * @param vulnerability The UUID of the vulnerability (required)
     * @param project The UUID of the project (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveAnalysisCall(UUID component, UUID vulnerability, UUID project, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/analysis";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (project != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("project", project));
        if (component != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("component", component));
        if (vulnerability != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("vulnerability", vulnerability));

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
    private com.squareup.okhttp.Call retrieveAnalysisValidateBeforeCall(UUID component, UUID vulnerability, UUID project, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'component' is set
        if (component == null) {
            throw new ApiException("Missing the required parameter 'component' when calling retrieveAnalysis(Async)");
        }
        // verify the required parameter 'vulnerability' is set
        if (vulnerability == null) {
            throw new ApiException("Missing the required parameter 'vulnerability' when calling retrieveAnalysis(Async)");
        }
        
        com.squareup.okhttp.Call call = retrieveAnalysisCall(component, vulnerability, project, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieves an analysis trail
     * &lt;p&gt;Requires permission &lt;strong&gt;VIEW_VULNERABILITY&lt;/strong&gt;&lt;/p&gt;
     * @param component The UUID of the component (required)
     * @param vulnerability The UUID of the vulnerability (required)
     * @param project The UUID of the project (optional)
     * @return Analysis
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Analysis retrieveAnalysis(UUID component, UUID vulnerability, UUID project) throws ApiException {
        ApiResponse<Analysis> resp = retrieveAnalysisWithHttpInfo(component, vulnerability, project);
        return resp.getData();
    }

    /**
     * Retrieves an analysis trail
     * &lt;p&gt;Requires permission &lt;strong&gt;VIEW_VULNERABILITY&lt;/strong&gt;&lt;/p&gt;
     * @param component The UUID of the component (required)
     * @param vulnerability The UUID of the vulnerability (required)
     * @param project The UUID of the project (optional)
     * @return ApiResponse&lt;Analysis&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Analysis> retrieveAnalysisWithHttpInfo(UUID component, UUID vulnerability, UUID project) throws ApiException {
        com.squareup.okhttp.Call call = retrieveAnalysisValidateBeforeCall(component, vulnerability, project, null, null);
        Type localVarReturnType = new TypeToken<Analysis>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves an analysis trail (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;VIEW_VULNERABILITY&lt;/strong&gt;&lt;/p&gt;
     * @param component The UUID of the component (required)
     * @param vulnerability The UUID of the vulnerability (required)
     * @param project The UUID of the project (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveAnalysisAsync(UUID component, UUID vulnerability, UUID project, final ApiCallback<Analysis> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = retrieveAnalysisValidateBeforeCall(component, vulnerability, project, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Analysis>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateAnalysis
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateAnalysisCall(AnalysisRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/analysis";

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
    private com.squareup.okhttp.Call updateAnalysisValidateBeforeCall(AnalysisRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = updateAnalysisCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Records an analysis decision
     * &lt;p&gt;Requires permission &lt;strong&gt;VULNERABILITY_ANALYSIS&lt;/strong&gt;&lt;/p&gt;
     * @param body  (optional)
     * @return Analysis
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Analysis updateAnalysis(AnalysisRequest body) throws ApiException {
        ApiResponse<Analysis> resp = updateAnalysisWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Records an analysis decision
     * &lt;p&gt;Requires permission &lt;strong&gt;VULNERABILITY_ANALYSIS&lt;/strong&gt;&lt;/p&gt;
     * @param body  (optional)
     * @return ApiResponse&lt;Analysis&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Analysis> updateAnalysisWithHttpInfo(AnalysisRequest body) throws ApiException {
        com.squareup.okhttp.Call call = updateAnalysisValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Analysis>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Records an analysis decision (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;VULNERABILITY_ANALYSIS&lt;/strong&gt;&lt;/p&gt;
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAnalysisAsync(AnalysisRequest body, final ApiCallback<Analysis> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateAnalysisValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Analysis>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
