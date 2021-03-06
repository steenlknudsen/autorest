/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyfile.implementation;

import retrofit2.Retrofit;
import fixtures.bodyfile.Files;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import fixtures.bodyfile.models.ErrorException;
import java.io.InputStream;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Streaming;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Files.
 */
public final class FilesImpl implements Files {
    /** The Retrofit service to perform REST calls. */
    private FilesService service;
    /** The service client containing this operation class. */
    private AutoRestSwaggerBATFileServiceImpl client;

    /**
     * Initializes an instance of Files.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public FilesImpl(Retrofit retrofit, AutoRestSwaggerBATFileServiceImpl client) {
        this.service = retrofit.create(FilesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Files to be
     * used by Retrofit to perform actually REST calls.
     */
    interface FilesService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("files/stream/nonempty")
        @Streaming
        Observable<Response<ResponseBody>> getFile();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("files/stream/verylarge")
        @Streaming
        Observable<Response<ResponseBody>> getFileLarge();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("files/stream/empty")
        @Streaming
        Observable<Response<ResponseBody>> getEmptyFile();

    }

    /**
     * Get file.
     *
     * @return the InputStream object if successful.
     */
    public InputStream getFile() {
        return getFileWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Get file.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<InputStream> getFileAsync(final ServiceCallback<InputStream> serviceCallback) {
        return ServiceCall.create(getFileWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get file.
     *
     * @return the observable to the InputStream object
     */
    public Observable<InputStream> getFileAsync() {
        return getFileWithServiceResponseAsync().map(new Func1<ServiceResponse<InputStream>, InputStream>() {
            @Override
            public InputStream call(ServiceResponse<InputStream> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Get file.
     *
     * @return the observable to the InputStream object
     */
    public Observable<ServiceResponse<InputStream>> getFileWithServiceResponseAsync() {
        return service.getFile()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InputStream>>>() {
                @Override
                public Observable<ServiceResponse<InputStream>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InputStream> clientResponse = getFileDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<InputStream> getFileDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<InputStream, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<InputStream>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get a large file.
     *
     * @return the InputStream object if successful.
     */
    public InputStream getFileLarge() {
        return getFileLargeWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Get a large file.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<InputStream> getFileLargeAsync(final ServiceCallback<InputStream> serviceCallback) {
        return ServiceCall.create(getFileLargeWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get a large file.
     *
     * @return the observable to the InputStream object
     */
    public Observable<InputStream> getFileLargeAsync() {
        return getFileLargeWithServiceResponseAsync().map(new Func1<ServiceResponse<InputStream>, InputStream>() {
            @Override
            public InputStream call(ServiceResponse<InputStream> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Get a large file.
     *
     * @return the observable to the InputStream object
     */
    public Observable<ServiceResponse<InputStream>> getFileLargeWithServiceResponseAsync() {
        return service.getFileLarge()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InputStream>>>() {
                @Override
                public Observable<ServiceResponse<InputStream>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InputStream> clientResponse = getFileLargeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<InputStream> getFileLargeDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<InputStream, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<InputStream>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get empty file.
     *
     * @return the InputStream object if successful.
     */
    public InputStream getEmptyFile() {
        return getEmptyFileWithServiceResponseAsync().toBlocking().single().getBody();
    }

    /**
     * Get empty file.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<InputStream> getEmptyFileAsync(final ServiceCallback<InputStream> serviceCallback) {
        return ServiceCall.create(getEmptyFileWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get empty file.
     *
     * @return the observable to the InputStream object
     */
    public Observable<InputStream> getEmptyFileAsync() {
        return getEmptyFileWithServiceResponseAsync().map(new Func1<ServiceResponse<InputStream>, InputStream>() {
            @Override
            public InputStream call(ServiceResponse<InputStream> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Get empty file.
     *
     * @return the observable to the InputStream object
     */
    public Observable<ServiceResponse<InputStream>> getEmptyFileWithServiceResponseAsync() {
        return service.getEmptyFile()
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InputStream>>>() {
                @Override
                public Observable<ServiceResponse<InputStream>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InputStream> clientResponse = getEmptyFileDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<InputStream> getEmptyFileDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<InputStream, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<InputStream>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
