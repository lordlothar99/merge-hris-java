/*
 * Merge HRIS API
 * The unified API for building rich integrations with multiple HR Information System platforms.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: hello@merge.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package merge_hris_client.api;

import merge_hris_client.ApiException;
import merge_hris_client.model.AvailableActions;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AvailableActionsApi
 */
@Ignore
public class AvailableActionsApiTest {

    private final AvailableActionsApi api = new AvailableActionsApi();

    
    /**
     * 
     *
     * Returns a list of models and actions available for an account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void availableActionsRetrieveTest() throws ApiException {
        String xAccountToken = null;
        AvailableActions response = api.availableActionsRetrieve(xAccountToken);

        // TODO: test validations
    }
    
}
