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

public class PermissionApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public PermissionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PermissionApi(ApiClient apiClient) {
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
     * Build call for addPermissionToTeam
     * @param uuid A valid team uuid (required)
     * @param permission A valid permission (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addPermissionToTeamCall(UUID uuid, String permission, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/permission/{permission}/team/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()))
            .replaceAll("\\{" + "permission" + "\\}", apiClient.escapeString(permission.toString()));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private com.squareup.okhttp.Call addPermissionToTeamValidateBeforeCall(UUID uuid, String permission, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling addPermissionToTeam(Async)");
        }
        // verify the required parameter 'permission' is set
        if (permission == null) {
            throw new ApiException("Missing the required parameter 'permission' when calling addPermissionToTeam(Async)");
        }
        
        com.squareup.okhttp.Call call = addPermissionToTeamCall(uuid, permission, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Adds the permission to the specified team.
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid A valid team uuid (required)
     * @param permission A valid permission (required)
     * @return Team
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Team addPermissionToTeam(UUID uuid, String permission) throws ApiException {
        ApiResponse<Team> resp = addPermissionToTeamWithHttpInfo(uuid, permission);
        return resp.getData();
    }

    /**
     * Adds the permission to the specified team.
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid A valid team uuid (required)
     * @param permission A valid permission (required)
     * @return ApiResponse&lt;Team&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Team> addPermissionToTeamWithHttpInfo(UUID uuid, String permission) throws ApiException {
        com.squareup.okhttp.Call call = addPermissionToTeamValidateBeforeCall(uuid, permission, null, null);
        Type localVarReturnType = new TypeToken<Team>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds the permission to the specified team. (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid A valid team uuid (required)
     * @param permission A valid permission (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addPermissionToTeamAsync(UUID uuid, String permission, final ApiCallback<Team> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addPermissionToTeamValidateBeforeCall(uuid, permission, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Team>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for addPermissionToUser
     * @param username A valid username (required)
     * @param permission A valid permission (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addPermissionToUserCall(String username, String permission, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/permission/{permission}/user/{username}"
            .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
            .replaceAll("\\{" + "permission" + "\\}", apiClient.escapeString(permission.toString()));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private com.squareup.okhttp.Call addPermissionToUserValidateBeforeCall(String username, String permission, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling addPermissionToUser(Async)");
        }
        // verify the required parameter 'permission' is set
        if (permission == null) {
            throw new ApiException("Missing the required parameter 'permission' when calling addPermissionToUser(Async)");
        }
        
        com.squareup.okhttp.Call call = addPermissionToUserCall(username, permission, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Adds the permission to the specified username.
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param username A valid username (required)
     * @param permission A valid permission (required)
     * @return UserPrincipal
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserPrincipal addPermissionToUser(String username, String permission) throws ApiException {
        ApiResponse<UserPrincipal> resp = addPermissionToUserWithHttpInfo(username, permission);
        return resp.getData();
    }

    /**
     * Adds the permission to the specified username.
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param username A valid username (required)
     * @param permission A valid permission (required)
     * @return ApiResponse&lt;UserPrincipal&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserPrincipal> addPermissionToUserWithHttpInfo(String username, String permission) throws ApiException {
        com.squareup.okhttp.Call call = addPermissionToUserValidateBeforeCall(username, permission, null, null);
        Type localVarReturnType = new TypeToken<UserPrincipal>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds the permission to the specified username. (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param username A valid username (required)
     * @param permission A valid permission (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addPermissionToUserAsync(String username, String permission, final ApiCallback<UserPrincipal> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addPermissionToUserValidateBeforeCall(username, permission, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserPrincipal>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllPermissions
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllPermissionsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/permission";

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
    
    private com.squareup.okhttp.Call getAllPermissionsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getAllPermissionsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Returns a list of all permissions
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String getAllPermissions() throws ApiException {
        ApiResponse<String> resp = getAllPermissionsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Returns a list of all permissions
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getAllPermissionsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getAllPermissionsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a list of all permissions (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllPermissionsAsync(final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllPermissionsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for removePermissionFromTeam
     * @param uuid A valid team uuid (required)
     * @param permission A valid permission (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call removePermissionFromTeamCall(UUID uuid, String permission, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/permission/{permission}/team/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()))
            .replaceAll("\\{" + "permission" + "\\}", apiClient.escapeString(permission.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private com.squareup.okhttp.Call removePermissionFromTeamValidateBeforeCall(UUID uuid, String permission, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling removePermissionFromTeam(Async)");
        }
        // verify the required parameter 'permission' is set
        if (permission == null) {
            throw new ApiException("Missing the required parameter 'permission' when calling removePermissionFromTeam(Async)");
        }
        
        com.squareup.okhttp.Call call = removePermissionFromTeamCall(uuid, permission, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Removes the permission from the team.
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid A valid team uuid (required)
     * @param permission A valid permission (required)
     * @return Team
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Team removePermissionFromTeam(UUID uuid, String permission) throws ApiException {
        ApiResponse<Team> resp = removePermissionFromTeamWithHttpInfo(uuid, permission);
        return resp.getData();
    }

    /**
     * Removes the permission from the team.
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid A valid team uuid (required)
     * @param permission A valid permission (required)
     * @return ApiResponse&lt;Team&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Team> removePermissionFromTeamWithHttpInfo(UUID uuid, String permission) throws ApiException {
        com.squareup.okhttp.Call call = removePermissionFromTeamValidateBeforeCall(uuid, permission, null, null);
        Type localVarReturnType = new TypeToken<Team>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Removes the permission from the team. (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param uuid A valid team uuid (required)
     * @param permission A valid permission (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call removePermissionFromTeamAsync(UUID uuid, String permission, final ApiCallback<Team> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = removePermissionFromTeamValidateBeforeCall(uuid, permission, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Team>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for removePermissionFromUser
     * @param username A valid username (required)
     * @param permission A valid permission (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call removePermissionFromUserCall(String username, String permission, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/permission/{permission}/user/{username}"
            .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()))
            .replaceAll("\\{" + "permission" + "\\}", apiClient.escapeString(permission.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private com.squareup.okhttp.Call removePermissionFromUserValidateBeforeCall(String username, String permission, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling removePermissionFromUser(Async)");
        }
        // verify the required parameter 'permission' is set
        if (permission == null) {
            throw new ApiException("Missing the required parameter 'permission' when calling removePermissionFromUser(Async)");
        }
        
        com.squareup.okhttp.Call call = removePermissionFromUserCall(username, permission, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Removes the permission from the user.
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param username A valid username (required)
     * @param permission A valid permission (required)
     * @return UserPrincipal
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserPrincipal removePermissionFromUser(String username, String permission) throws ApiException {
        ApiResponse<UserPrincipal> resp = removePermissionFromUserWithHttpInfo(username, permission);
        return resp.getData();
    }

    /**
     * Removes the permission from the user.
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param username A valid username (required)
     * @param permission A valid permission (required)
     * @return ApiResponse&lt;UserPrincipal&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserPrincipal> removePermissionFromUserWithHttpInfo(String username, String permission) throws ApiException {
        com.squareup.okhttp.Call call = removePermissionFromUserValidateBeforeCall(username, permission, null, null);
        Type localVarReturnType = new TypeToken<UserPrincipal>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Removes the permission from the user. (asynchronously)
     * &lt;p&gt;Requires permission &lt;strong&gt;ACCESS_MANAGEMENT&lt;/strong&gt;&lt;/p&gt;
     * @param username A valid username (required)
     * @param permission A valid permission (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call removePermissionFromUserAsync(String username, String permission, final ApiCallback<UserPrincipal> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = removePermissionFromUserValidateBeforeCall(username, permission, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserPrincipal>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
