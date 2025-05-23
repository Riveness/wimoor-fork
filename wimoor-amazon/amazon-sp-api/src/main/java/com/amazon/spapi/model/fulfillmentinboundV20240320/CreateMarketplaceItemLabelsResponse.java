/*
 * Fulfillment Inbound v2024-03-20
 * The Selling Partner API for Fulfillment By Amazon (FBA) Inbound. The FBA Inbound API enables building inbound workflows to create, manage, and send shipments into Amazon's fulfillment network. The API has interoperability with the Send-to-Amazon user interface.
 *
 * OpenAPI spec version: 2024-03-20
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillmentinboundV20240320;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The &#x60;createMarketplaceItemLabels&#x60; response.
 */
@ApiModel(description = "The `createMarketplaceItemLabels` response.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-11-13T14:17:39.430+08:00")
public class CreateMarketplaceItemLabelsResponse {
  @SerializedName("documentDownloads")
  private List<DocumentDownload> documentDownloads = new ArrayList<DocumentDownload>();

  public CreateMarketplaceItemLabelsResponse documentDownloads(List<DocumentDownload> documentDownloads) {
    this.documentDownloads = documentDownloads;
    return this;
  }

  public CreateMarketplaceItemLabelsResponse addDocumentDownloadsItem(DocumentDownload documentDownloadsItem) {
    this.documentDownloads.add(documentDownloadsItem);
    return this;
  }

   /**
   * Resources to download the requested document.
   * @return documentDownloads
  **/
  @ApiModelProperty(required = true, value = "Resources to download the requested document.")
  public List<DocumentDownload> getDocumentDownloads() {
    return documentDownloads;
  }

  public void setDocumentDownloads(List<DocumentDownload> documentDownloads) {
    this.documentDownloads = documentDownloads;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMarketplaceItemLabelsResponse createMarketplaceItemLabelsResponse = (CreateMarketplaceItemLabelsResponse) o;
    return Objects.equals(this.documentDownloads, createMarketplaceItemLabelsResponse.documentDownloads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentDownloads);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMarketplaceItemLabelsResponse {\n");
    
    sb.append("    documentDownloads: ").append(toIndentedString(documentDownloads)).append("\n");
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

