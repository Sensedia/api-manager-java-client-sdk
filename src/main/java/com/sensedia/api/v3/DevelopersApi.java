package com.sensedia.api.v3;

import com.sensedia.api.v3.client.ApiException;
import com.sensedia.api.v3.client.ApiClient;
import com.sensedia.api.v3.client.Configuration;
import com.sensedia.api.v3.client.Pair;

import javax.ws.rs.core.GenericType;

import com.sensedia.api.v3.model.ChangeLogBean;
import com.sensedia.api.v3.model.Developer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T23:40:42.718-03:00")
public class DevelopersApi {
  private ApiClient apiClient;

  public DevelopersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DevelopersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create or update developer
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param login Developer Login (required)
   * @param bean bean (required)
   * @return Developer
   * @throws ApiException if fails to make API call
   */
  public Developer createOrUpdateDeveloper1(String sensediaAuth, String login, Developer bean) throws ApiException {
    Object localVarPostBody = bean;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling createOrUpdateDeveloper1");
    }
    
    // verify the required parameter 'login' is set
    if (login == null) {
      throw new ApiException(400, "Missing the required parameter 'login' when calling createOrUpdateDeveloper1");
    }
    
    // verify the required parameter 'bean' is set
    if (bean == null) {
      throw new ApiException(400, "Missing the required parameter 'bean' when calling createOrUpdateDeveloper1");
    }
    
    // create path and map variables
    String localVarPath = "/developers/{login}"
      .replaceAll("\\{" + "login" + "\\}", apiClient.escapeString(login.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (sensediaAuth != null)
      localVarHeaderParams.put("Sensedia-Auth", apiClient.parameterToString(sensediaAuth));

    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Developer> localVarReturnType = new GenericType<Developer>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve developers total
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @return Long
   * @throws ApiException if fails to make API call
   */
  public Long developersCount1(String sensediaAuth) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling developersCount1");
    }
    
    // create path and map variables
    String localVarPath = "/developers/count";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (sensediaAuth != null)
      localVarHeaderParams.put("Sensedia-Auth", apiClient.parameterToString(sensediaAuth));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Long> localVarReturnType = new GenericType<Long>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete developer
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param login Developer Login (required)
   * @throws ApiException if fails to make API call
   */
  public void removeDeveloper1(String sensediaAuth, String login) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling removeDeveloper1");
    }
    
    // verify the required parameter 'login' is set
    if (login == null) {
      throw new ApiException(400, "Missing the required parameter 'login' when calling removeDeveloper1");
    }
    
    // create path and map variables
    String localVarPath = "/developers/{login}"
      .replaceAll("\\{" + "login" + "\\}", apiClient.escapeString(login.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (sensediaAuth != null)
      localVarHeaderParams.put("Sensedia-Auth", apiClient.parameterToString(sensediaAuth));

    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Retrive audit developer per username
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param username Developer username (required)
   * @return List&lt;ChangeLogBean&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ChangeLogBean> retriveChangeLogByUsername1(String sensediaAuth, String username) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling retriveChangeLogByUsername1");
    }
    
    // verify the required parameter 'username' is set
    if (username == null) {
      throw new ApiException(400, "Missing the required parameter 'username' when calling retriveChangeLogByUsername1");
    }
    
    // create path and map variables
    String localVarPath = "/developers/{username}/changelog"
      .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (sensediaAuth != null)
      localVarHeaderParams.put("Sensedia-Auth", apiClient.parameterToString(sensediaAuth));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ChangeLogBean>> localVarReturnType = new GenericType<List<ChangeLogBean>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrive developer per Login
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param login Developer Login (required)
   * @return Developer
   * @throws ApiException if fails to make API call
   */
  public Developer retriveDeveloperByLogin1(String sensediaAuth, String login) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling retriveDeveloperByLogin1");
    }
    
    // verify the required parameter 'login' is set
    if (login == null) {
      throw new ApiException(400, "Missing the required parameter 'login' when calling retriveDeveloperByLogin1");
    }
    
    // create path and map variables
    String localVarPath = "/developers/{login}"
      .replaceAll("\\{" + "login" + "\\}", apiClient.escapeString(login.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (sensediaAuth != null)
      localVarHeaderParams.put("Sensedia-Auth", apiClient.parameterToString(sensediaAuth));

    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Developer> localVarReturnType = new GenericType<Developer>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrive developers
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param loginOrEmail Login or E-mail (optional)
   * @param name Developer Name (optional)
   * @param email Developer E-mail (optional)
   * @param actualPage Number of the page in pagination. The starting page number is zero. (optional)
   * @param pageSize Define the size of the returned list of developers. (optional)
   * @return List&lt;Developer&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Developer> retriveDevelopers1(String sensediaAuth, String loginOrEmail, String name, String email, Integer actualPage, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling retriveDevelopers1");
    }
    
    // create path and map variables
    String localVarPath = "/developers";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loginOrEmail", loginOrEmail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actualPage", actualPage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));

    if (sensediaAuth != null)
      localVarHeaderParams.put("Sensedia-Auth", apiClient.parameterToString(sensediaAuth));

    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Developer>> localVarReturnType = new GenericType<List<Developer>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
