/*
 * API Manager Portal
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sensedia.api.v3;

import com.sensedia.api.v3.client.ApiException;
import com.sensedia.api.v3.model.ChangeLogBean;
import com.sensedia.api.v3.model.Developer;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DevelopersApi
 */
@Ignore
public class DevelopersApiTest {

    private final DevelopersApi api = new DevelopersApi();

    
    /**
     * Create or update developer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrUpdateDeveloper1Test() throws ApiException {
        String login = null;
        Developer bean = null;
        String sensediaAuth = null;
        Developer response = api.createOrUpdateDeveloper1(login, bean, sensediaAuth);

        // TODO: test validations
    }
    
    /**
     * Retrieve developers total
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void developersCount1Test() throws ApiException {
        String sensediaAuth = null;
        Long response = api.developersCount1(sensediaAuth);

        // TODO: test validations
    }
    
    /**
     * Delete developer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeDeveloper1Test() throws ApiException {
        String login = null;
        String sensediaAuth = null;
        api.removeDeveloper1(login, sensediaAuth);

        // TODO: test validations
    }
    
    /**
     * Retrive audit developer per username
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retriveChangeLogByUsername1Test() throws ApiException {
        String username = null;
        String sensediaAuth = null;
        List<ChangeLogBean> response = api.retriveChangeLogByUsername1(username, sensediaAuth);

        // TODO: test validations
    }
    
    /**
     * Retrive developer per Login
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retriveDeveloperByLogin1Test() throws ApiException {
        String login = null;
        String sensediaAuth = null;
        Developer response = api.retriveDeveloperByLogin1(login, sensediaAuth);

        // TODO: test validations
    }
    
    /**
     * Retrive developers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retriveDevelopers1Test() throws ApiException {
        String sensediaAuth = null;
        String loginOrEmail = null;
        String name = null;
        String email = null;
        Integer actualPage = null;
        Integer pageSize = null;
        List<Developer> response = api.retriveDevelopers1(sensediaAuth, loginOrEmail, name, email, actualPage, pageSize);

        // TODO: test validations
    }
    
}
