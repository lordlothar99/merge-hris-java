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
 * Gets or Sets EthnicityEnum
 */
@JsonAdapter(EthnicityEnum.Adapter.class)
public enum EthnicityEnum {
  
  AMERICAN_INDIAN_OR_ALASKA_NATIVE("AMERICAN_INDIAN_OR_ALASKA_NATIVE"),
  
  ASIAN_OR_INDIAN_SUBCONTINENT("ASIAN_OR_INDIAN_SUBCONTINENT"),
  
  BLACK_OR_AFRICAN_AMERICAN("BLACK_OR_AFRICAN_AMERICAN"),
  
  HISPANIC_OR_LATINO("HISPANIC_OR_LATINO"),
  
  NATIVE_HAWAIIAN_OR_OTHER_PACIFIC_ISLANDER("NATIVE_HAWAIIAN_OR_OTHER_PACIFIC_ISLANDER"),
  
  TWO_OR_MORE_RACES("TWO_OR_MORE_RACES"),
  
  WHITE("WHITE"),
  
  PREFER_NOT_TO_DISCLOSE("PREFER_NOT_TO_DISCLOSE");

  private String value;

  EthnicityEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EthnicityEnum fromValue(String value) {
    for (EthnicityEnum b : EthnicityEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EthnicityEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final EthnicityEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EthnicityEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EthnicityEnum.fromValue(value);
    }
  }
}

