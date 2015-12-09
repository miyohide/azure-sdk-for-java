/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.ResponseBody;
import fixtures.bodystring.models.Colors;
import fixtures.bodystring.models.Error;
import java.io.IOException;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in EnumOperations.
 */
public final class EnumOperationsImpl implements EnumOperations {
    /** The Retrofit service to perform REST calls. */
    private EnumService service;
    /** The service client containing this operation class. */
    private AutoRestSwaggerBATService client;

    /**
     * Initializes an instance of EnumOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public EnumOperationsImpl(Retrofit retrofit, AutoRestSwaggerBATService client) {
        this.service = retrofit.create(EnumService.class);
        this.client = client;
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Colors object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Colors> getNotExpandable() throws ServiceException, IOException {
        Call<ResponseBody> call = service.getNotExpandable();
        return getNotExpandableDelegate(call.execute(), null);
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getNotExpandableAsync(final ServiceCallback<Colors> serviceCallback) {
        Call<ResponseBody> call = service.getNotExpandable();
        call.enqueue(new ServiceResponseCallback<Colors>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getNotExpandableDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Colors> getNotExpandableDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Colors>()
                .register(200, new TypeToken<Colors>() { }.getType())
                .registerError(new TypeToken<Error>() { }.getType())
                .build(response, retrofit);
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values for this parameter include: 'red color', 'green-color', 'blue_color'
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putNotExpandable(Colors stringBody) throws ServiceException, IOException, IllegalArgumentException {
        if (stringBody == null) {
            throw new IllegalArgumentException("Parameter stringBody is required and cannot be null.");
        }
        Call<ResponseBody> call = service.putNotExpandable(stringBody);
        return putNotExpandableDelegate(call.execute(), null);
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values for this parameter include: 'red color', 'green-color', 'blue_color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> putNotExpandableAsync(Colors stringBody, final ServiceCallback<Void> serviceCallback) {
        if (stringBody == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter stringBody is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.putNotExpandable(stringBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putNotExpandableDelegate(response, retrofit));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putNotExpandableDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException, IOException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(new TypeToken<Error>() { }.getType())
                .build(response, retrofit);
    }

}
