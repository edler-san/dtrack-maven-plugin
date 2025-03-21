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
import java.util.UUID;

import com.google.gson.reflect.TypeToken;
import com.vaadin.dtrack.ApiCallback;
import com.vaadin.dtrack.ApiClient;
import com.vaadin.dtrack.ApiException;
import com.vaadin.dtrack.ApiResponse;
import com.vaadin.dtrack.Configuration;
import com.vaadin.dtrack.Pair;
import com.vaadin.dtrack.ProgressRequestBody;
import com.vaadin.dtrack.ProgressResponseBody;

public class ViolationanalysisApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public ViolationanalysisApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ViolationanalysisApi(ApiClient apiClient) {
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
     * Build call for retrieveAnalysis1
     * @param component The UUID of the component (required)
     * @param policyViolation The UUID of the policy violation (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveAnalysis1Call(UUID component, UUID policyViolation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/violation/analysis";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (component != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("component", component));
        if (policyViolation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("policyViolation", policyViolation));

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
    
    private com.squareup.okhttp.Call retrieveAnalysis1ValidateBeforeCall(UUID component, UUID policyViolation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'component' is set
        if (component == null) {
            throw new ApiException("Missing the required parameter 'component' when calling retrieveAnalysis1(Async)");
        }
        // verify the required parameter 'policyViolation' is set
        if (policyViolation == null) {
            throw new ApiException("Missing the required parameter 'policyViolation' when calling retrieveAnalysis1(Async)");
        }
        
        com.squareup.okhttp.Call call = retrieveAnalysis1Call(component, policyViolation, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieves a violation analysis trail
     * &lt;p&gt;Requires permission &lt;strong&gt;VIEW_POLICY_VIOLATION&lt;/strong&gt;&lt;/p&gt;
     * @param component The UUID of the component (required)
     * @param policyViolation The UUID of the policy violation (required)
     * @return ViolationAnalysis
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ViolationAnalysis retrieveAnalysis1(UUID component, UUID policyViolation) throws ApiException {
        ApiResponse<ViolationAnalysis> resp = retrieveAnalysis1WithHttpInfo(component, policyViolation);
        return resp.getData();
    }

    /**
     * Retrieves a violation analysis trail
     * &lt;p&gt;Requires permission &lt;strong&gt;VIEW_POLICY_VIOLATION&lt;/strong&gt;&lt;/p&gt;
     * @param component The UUID of the component (required)
     * @param policyViolation The UUID of the policy violation (required)
     * @return ApiResponse&lt;ViolationAnalysis&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ViolationAnalysis> retrieveAnalysis1WithHttpInfo(UUID component, UUID policyViolation) throws ApiException {
        com.squareup.okhttp.Call call = retrieveAnalysis1ValidateBeforeCall(component, policyViolation, null, null);
        Type localVarReturnType = new TypeToken<ViolationAnalysis>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves a violation analysis trail (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;VIEW_POLICY_VIOLATION&lt;/strong&gt;&lt;/p&gt;
     * @param component The UUID of the component (required)
     * @param policyViolation The UUID of the policy violation (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveAnalysis1Async(UUID component, UUID policyViolation, final ApiCallback<ViolationAnalysis> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = retrieveAnalysis1ValidateBeforeCall(component, policyViolation, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ViolationAnalysis>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateAnalysis1
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateAnalysis1Call(ViolationAnalysisRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/violation/analysis";

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private com.squareup.okhttp.Call updateAnalysis1ValidateBeforeCall(ViolationAnalysisRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = updateAnalysis1Call(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Records a violation analysis decision
     * &lt;p&gt;Requires permission &lt;strong&gt;POLICY_VIOLATION_ANALYSIS&lt;/strong&gt;&lt;/p&gt;
     * @param body  (optional)
     * @return ViolationAnalysis
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ViolationAnalysis updateAnalysis1(ViolationAnalysisRequest body) throws ApiException {
        ApiResponse<ViolationAnalysis> resp = updateAnalysis1WithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Records a violation analysis decision
     * &lt;p&gt;Requires permission &lt;strong&gt;POLICY_VIOLATION_ANALYSIS&lt;/strong&gt;&lt;/p&gt;
     * @param body  (optional)
     * @return ApiResponse&lt;ViolationAnalysis&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ViolationAnalysis> updateAnalysis1WithHttpInfo(ViolationAnalysisRequest body) throws ApiException {
        com.squareup.okhttp.Call call = updateAnalysis1ValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<ViolationAnalysis>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Records a violation analysis decision (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;POLICY_VIOLATION_ANALYSIS&lt;/strong&gt;&lt;/p&gt;
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAnalysis1Async(ViolationAnalysisRequest body, final ApiCallback<ViolationAnalysis> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateAnalysis1ValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ViolationAnalysis>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
