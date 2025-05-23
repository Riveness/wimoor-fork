/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.productpricing;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * BuyBoxPriceType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T16:09:49.847+08:00")
public class BuyBoxPriceType {
  @SerializedName("condition")
  private String condition = null;

  @SerializedName("offerType")
  private OfferCustomerType offerType = null;

  @SerializedName("quantityTier")
  private Integer quantityTier = null;

  @SerializedName("quantityDiscountType")
  private QuantityDiscountType quantityDiscountType = null;

  @SerializedName("LandedPrice")
  private MoneyType landedPrice = null;

  @SerializedName("ListingPrice")
  private MoneyType listingPrice = null;

  @SerializedName("Shipping")
  private MoneyType shipping = null;

  @SerializedName("Points")
  private Points points = null;

  @SerializedName("sellerId")
  private String sellerId = null;

  public BuyBoxPriceType condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Indicates the condition of the item. For example: New, Used, Collectible, Refurbished, or Club.
   * @return condition
  **/
  @ApiModelProperty(required = true, value = "Indicates the condition of the item. For example: New, Used, Collectible, Refurbished, or Club.")
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public BuyBoxPriceType offerType(OfferCustomerType offerType) {
    this.offerType = offerType;
    return this;
  }

   /**
   * Indicates the type of customer that the offer is valid for.&lt;br&gt;&lt;br&gt;When the offer type is B2C in a quantity discount, the seller is winning the Buy Box because others do not have inventory at that quantity, not because they have a quantity discount on the ASIN.
   * @return offerType
  **/
  @ApiModelProperty(value = "Indicates the type of customer that the offer is valid for.<br><br>When the offer type is B2C in a quantity discount, the seller is winning the Buy Box because others do not have inventory at that quantity, not because they have a quantity discount on the ASIN.")
  public OfferCustomerType getOfferType() {
    return offerType;
  }

  public void setOfferType(OfferCustomerType offerType) {
    this.offerType = offerType;
  }

  public BuyBoxPriceType quantityTier(Integer quantityTier) {
    this.quantityTier = quantityTier;
    return this;
  }

   /**
   * Indicates at what quantity this price becomes active.
   * @return quantityTier
  **/
  @ApiModelProperty(value = "Indicates at what quantity this price becomes active.")
  public Integer getQuantityTier() {
    return quantityTier;
  }

  public void setQuantityTier(Integer quantityTier) {
    this.quantityTier = quantityTier;
  }

  public BuyBoxPriceType quantityDiscountType(QuantityDiscountType quantityDiscountType) {
    this.quantityDiscountType = quantityDiscountType;
    return this;
  }

   /**
   * Indicates the type of quantity discount this price applies to.
   * @return quantityDiscountType
  **/
  @ApiModelProperty(value = "Indicates the type of quantity discount this price applies to.")
  public QuantityDiscountType getQuantityDiscountType() {
    return quantityDiscountType;
  }

  public void setQuantityDiscountType(QuantityDiscountType quantityDiscountType) {
    this.quantityDiscountType = quantityDiscountType;
  }

  public BuyBoxPriceType landedPrice(MoneyType landedPrice) {
    this.landedPrice = landedPrice;
    return this;
  }

   /**
   * The value calculated by adding ListingPrice + Shipping - Points.
   * @return landedPrice
  **/
  @ApiModelProperty(required = true, value = "The value calculated by adding ListingPrice + Shipping - Points.")
  public MoneyType getLandedPrice() {
    return landedPrice;
  }

  public void setLandedPrice(MoneyType landedPrice) {
    this.landedPrice = landedPrice;
  }

  public BuyBoxPriceType listingPrice(MoneyType listingPrice) {
    this.listingPrice = listingPrice;
    return this;
  }

   /**
   * The price of the item.
   * @return listingPrice
  **/
  @ApiModelProperty(required = true, value = "The price of the item.")
  public MoneyType getListingPrice() {
    return listingPrice;
  }

  public void setListingPrice(MoneyType listingPrice) {
    this.listingPrice = listingPrice;
  }

  public BuyBoxPriceType shipping(MoneyType shipping) {
    this.shipping = shipping;
    return this;
  }

   /**
   * The shipping cost.
   * @return shipping
  **/
  @ApiModelProperty(required = true, value = "The shipping cost.")
  public MoneyType getShipping() {
    return shipping;
  }

  public void setShipping(MoneyType shipping) {
    this.shipping = shipping;
  }

  public BuyBoxPriceType points(Points points) {
    this.points = points;
    return this;
  }

   /**
   * The number of Amazon Points offered with the purchase of an item.
   * @return points
  **/
  @ApiModelProperty(value = "The number of Amazon Points offered with the purchase of an item.")
  public Points getPoints() {
    return points;
  }

  public void setPoints(Points points) {
    this.points = points;
  }

  public BuyBoxPriceType sellerId(String sellerId) {
    this.sellerId = sellerId;
    return this;
  }

   /**
   * The seller identifier for the offer.
   * @return sellerId
  **/
  @ApiModelProperty(value = "The seller identifier for the offer.")
  public String getSellerId() {
    return sellerId;
  }

  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyBoxPriceType buyBoxPriceType = (BuyBoxPriceType) o;
    return Objects.equals(this.condition, buyBoxPriceType.condition) &&
        Objects.equals(this.offerType, buyBoxPriceType.offerType) &&
        Objects.equals(this.quantityTier, buyBoxPriceType.quantityTier) &&
        Objects.equals(this.quantityDiscountType, buyBoxPriceType.quantityDiscountType) &&
        Objects.equals(this.landedPrice, buyBoxPriceType.landedPrice) &&
        Objects.equals(this.listingPrice, buyBoxPriceType.listingPrice) &&
        Objects.equals(this.shipping, buyBoxPriceType.shipping) &&
        Objects.equals(this.points, buyBoxPriceType.points) &&
        Objects.equals(this.sellerId, buyBoxPriceType.sellerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, offerType, quantityTier, quantityDiscountType, landedPrice, listingPrice, shipping, points, sellerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyBoxPriceType {\n");
    
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
    sb.append("    quantityTier: ").append(toIndentedString(quantityTier)).append("\n");
    sb.append("    quantityDiscountType: ").append(toIndentedString(quantityDiscountType)).append("\n");
    sb.append("    landedPrice: ").append(toIndentedString(landedPrice)).append("\n");
    sb.append("    listingPrice: ").append(toIndentedString(listingPrice)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
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

