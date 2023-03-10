package io.adabox.storage.nft.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * UploadResponse
 */
public class UploadResponse {

    public static final String SERIALIZED_NAME_OK = "ok";
    @SerializedName(SERIALIZED_NAME_OK)
    private Boolean ok = true;
    public static final String SERIALIZED_NAME_VALUE = "value";
    @SerializedName(SERIALIZED_NAME_VALUE)
    private NFT value;

    public UploadResponse ok(Boolean ok) {
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

    public UploadResponse value(NFT value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NFT getValue() {
        return value;
    }

    public void setValue(NFT value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadResponse uploadResponse = (UploadResponse) o;
        return Objects.equals(this.ok, uploadResponse.ok) &&
                Objects.equals(this.value, uploadResponse.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ok, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadResponse {\n");
        sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
