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
import merge_hris_client.model.Benefit;
import org.threeten.bp.OffsetDateTime;
import merge_hris_client.model.PaginatedBenefitList;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BenefitsApi
 */
@Ignore
public class BenefitsApiTest {

    private final BenefitsApi api = new BenefitsApi();

    
    /**
     * 
     *
     * Returns a list of &#x60;Benefit&#x60; objects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void benefitsListTest() throws ApiException {
        String xAccountToken = null;
        OffsetDateTime createdAfter = null;
        OffsetDateTime createdBefore = null;
        String cursor = null;
        String employeeId = null;
        Boolean includeRemoteData = null;
        OffsetDateTime modifiedAfter = null;
        OffsetDateTime modifiedBefore = null;
        Integer pageSize = null;
        String remoteId = null;
        PaginatedBenefitList response = api.benefitsList(xAccountToken, createdAfter, createdBefore, cursor, employeeId, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a &#x60;Benefit&#x60; object with the given &#x60;id&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void benefitsRetrieveTest() throws ApiException {
        String xAccountToken = null;
        UUID id = null;
        Boolean includeRemoteData = null;
        Benefit response = api.benefitsRetrieve(xAccountToken, id, includeRemoteData);

        // TODO: test validations
    }
    
}