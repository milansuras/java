/*
Copyright 2025 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * ServiceReference holds a reference to Service.legacy.k8s.io
 */
@ApiModel(description = "ServiceReference holds a reference to Service.legacy.k8s.io")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-20T20:47:13.890592Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class ApiregistrationV1ServiceReference {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  @jakarta.annotation.Nullable
  private String namespace;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  @jakarta.annotation.Nullable
  private Integer port;

  public ApiregistrationV1ServiceReference() {
  }

  public ApiregistrationV1ServiceReference name(@jakarta.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name is the name of the service
   * @return name
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name is the name of the service")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nullable String name) {
    this.name = name;
  }


  public ApiregistrationV1ServiceReference namespace(@jakarta.annotation.Nullable String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Namespace is the namespace of the service
   * @return namespace
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Namespace is the namespace of the service")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(@jakarta.annotation.Nullable String namespace) {
    this.namespace = namespace;
  }


  public ApiregistrationV1ServiceReference port(@jakarta.annotation.Nullable Integer port) {
    this.port = port;
    return this;
  }

  /**
   * If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. &#x60;port&#x60; should be a valid port number (1-65535, inclusive).
   * @return port
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).")
  public Integer getPort() {
    return port;
  }

  public void setPort(@jakarta.annotation.Nullable Integer port) {
    this.port = port;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiregistrationV1ServiceReference apiregistrationV1ServiceReference = (ApiregistrationV1ServiceReference) o;
    return Objects.equals(this.name, apiregistrationV1ServiceReference.name) &&
        Objects.equals(this.namespace, apiregistrationV1ServiceReference.namespace) &&
        Objects.equals(this.port, apiregistrationV1ServiceReference.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiregistrationV1ServiceReference {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("namespace");
    openapiFields.add("port");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiregistrationV1ServiceReference
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiregistrationV1ServiceReference.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiregistrationV1ServiceReference is not found in the empty JSON string", ApiregistrationV1ServiceReference.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiregistrationV1ServiceReference.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiregistrationV1ServiceReference` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiregistrationV1ServiceReference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiregistrationV1ServiceReference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiregistrationV1ServiceReference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiregistrationV1ServiceReference.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiregistrationV1ServiceReference>() {
           @Override
           public void write(JsonWriter out, ApiregistrationV1ServiceReference value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiregistrationV1ServiceReference read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiregistrationV1ServiceReference given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiregistrationV1ServiceReference
   * @throws IOException if the JSON string is invalid with respect to ApiregistrationV1ServiceReference
   */
  public static ApiregistrationV1ServiceReference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiregistrationV1ServiceReference.class);
  }

  /**
   * Convert an instance of ApiregistrationV1ServiceReference to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
