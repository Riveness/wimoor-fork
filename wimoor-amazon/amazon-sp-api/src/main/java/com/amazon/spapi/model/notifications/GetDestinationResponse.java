/*
 * Selling Partner API for Notifications
 * The Selling Partner API for Notifications lets you subscribe to notifications that are relevant to a selling partner's business. Using this API you can create a destination to receive notifications, subscribe to notifications, delete notification subscriptions, and more.  For more information, refer to the [Notifications Use Case Guide](https://developer-docs.amazon.com/sp-api/docs/notifications-api-v1-use-case-guide).
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.notifications;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.amazon.spapi.model.notifications.Destination;
import com.amazon.spapi.model.ErrorList;
import java.io.IOException;

/**
 * The response schema for the &#x60;getDestination&#x60; operation.
 */
@ApiModel(description = "The response schema for the `getDestination` operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:45.878+08:00")
public class GetDestinationResponse {
  @SerializedName("payload")
  private Destination payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetDestinationResponse payload(Destination payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the &#x60;getDestination&#x60; operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for the `getDestination` operation.")
  public Destination getPayload() {
    return payload;
  }

  public void setPayload(Destination payload) {
    this.payload = payload;
  }

  public GetDestinationResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * One or more unexpected errors occurred during the &#x60;getDestination&#x60; operation.
   * @return errors
  **/
  @ApiModelProperty(value = "One or more unexpected errors occurred during the `getDestination` operation.")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDestinationResponse getDestinationResponse = (GetDestinationResponse) o;
    return Objects.equals(this.payload, getDestinationResponse.payload) &&
        Objects.equals(this.errors, getDestinationResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDestinationResponse {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

