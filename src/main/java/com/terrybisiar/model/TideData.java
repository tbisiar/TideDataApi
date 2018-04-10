package com.terrybisiar.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * TideData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-07T22:40:35.263Z")

public class TideData   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("height")
  private Float height = null;

  /**
   * Units of which tide height is provided. Options are 'm' (meters) or 'ft' (feet).
   */
  public enum HeightUnitsEnum {
    M("m"),
    
    FT("ft");

    private String value;

    HeightUnitsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HeightUnitsEnum fromValue(String text) {
      for (HeightUnitsEnum b : HeightUnitsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("heightUnits")
  private HeightUnitsEnum heightUnits = HeightUnitsEnum.M;

  @JsonProperty("location")
  private Location location = null;

  public TideData id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "12345", value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TideData timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * timestamp in ISO8601 format for time at which tide is forecasted.
   * @return timestamp
  **/
  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "timestamp in ISO8601 format for time at which tide is forecasted.")

  @Valid

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public TideData height(Float height) {
    this.height = height;
    return this;
  }

  /**
   * height of tide 
   * @return height
  **/
  @ApiModelProperty(example = "2.2", value = "height of tide ")


  public Float getHeight() {
    return height;
  }

  public void setHeight(Float height) {
    this.height = height;
  }

  public TideData heightUnits(HeightUnitsEnum heightUnits) {
    this.heightUnits = heightUnits;
    return this;
  }

  /**
   * Units of which tide height is provided. Options are 'm' (meters) or 'ft' (feet).
   * @return heightUnits
  **/
  @ApiModelProperty(value = "Units of which tide height is provided. Options are 'm' (meters) or 'ft' (feet).")


  public HeightUnitsEnum getHeightUnits() {
    return heightUnits;
  }

  public void setHeightUnits(HeightUnitsEnum heightUnits) {
    this.heightUnits = heightUnits;
  }

  public TideData location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TideData tideData = (TideData) o;
    return Objects.equals(this.id, tideData.id) &&
        Objects.equals(this.timestamp, tideData.timestamp) &&
        Objects.equals(this.height, tideData.height) &&
        Objects.equals(this.heightUnits, tideData.heightUnits) &&
        Objects.equals(this.location, tideData.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, height, heightUnits, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TideData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    heightUnits: ").append(toIndentedString(heightUnits)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

