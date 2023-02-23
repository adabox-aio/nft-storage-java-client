/*
 * NFT Storage API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.adabox.storage.nft.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * ForbiddenErrorResponse
 */
public class ForbiddenErrorResponse {

    public static final String SERIALIZED_NAME_OK = "ok";
    @SerializedName(SERIALIZED_NAME_OK)
    private Boolean ok = false;
    public static final String SERIALIZED_NAME_ERROR = "error";
    @SerializedName(SERIALIZED_NAME_ERROR)
    private ForbiddenErrorResponseError error;

    public ForbiddenErrorResponse ok(Boolean ok) {
        this.ok = ok;
        return this;
    }

    /**
     * Get ok
     *
     * @return ok
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public ForbiddenErrorResponse error(ForbiddenErrorResponseError error) {
        this.error = error;
        return this;
    }

    /**
     * Get error
     *
     * @return error
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ForbiddenErrorResponseError getError() {
        return error;
    }

    public void setError(ForbiddenErrorResponseError error) {
        this.error = error;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ForbiddenErrorResponse forbiddenErrorResponse = (ForbiddenErrorResponse) o;
        return Objects.equals(this.ok, forbiddenErrorResponse.ok) &&
                Objects.equals(this.error, forbiddenErrorResponse.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ok, error);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ForbiddenErrorResponse {\n");
        sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}