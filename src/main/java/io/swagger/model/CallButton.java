package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets call_button
 */
public enum CallButton {
  UP("UP"),
    DOWN("DOWN");

  private String value;

  CallButton(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CallButton fromValue(String text) {
    for (CallButton b : CallButton.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
