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


package merge_hris_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets MaritalStatusEnum
 */
@JsonAdapter(MaritalStatusEnum.Adapter.class)
public enum MaritalStatusEnum {
  
  SINGLE("SINGLE"),
  
  MARRIED_FILING_JOINTLY("MARRIED_FILING_JOINTLY"),
  
  MARRIED_FILING_SEPARATELY("MARRIED_FILING_SEPARATELY"),
  
  HEAD_OF_HOUSEHOLD("HEAD_OF_HOUSEHOLD"),
  
  QUALIFYING_WIDOW_OR_WIDOWER_WITH_DEPENDENT_CHILD("QUALIFYING_WIDOW_OR_WIDOWER_WITH_DEPENDENT_CHILD");

  private String value;

  MaritalStatusEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MaritalStatusEnum fromValue(String value) {
    for (MaritalStatusEnum b : MaritalStatusEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MaritalStatusEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final MaritalStatusEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MaritalStatusEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MaritalStatusEnum.fromValue(value);
    }
  }
}

