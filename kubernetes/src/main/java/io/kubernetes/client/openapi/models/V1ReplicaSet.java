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
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1ReplicaSetSpec;
import io.kubernetes.client.openapi.models.V1ReplicaSetStatus;
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
 * ReplicaSet ensures that a specified number of pod replicas are running at any given time.
 */
@ApiModel(description = "ReplicaSet ensures that a specified number of pod replicas are running at any given time.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-20T20:47:13.890592Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1ReplicaSet implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  @jakarta.annotation.Nullable
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  @jakarta.annotation.Nullable
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  @jakarta.annotation.Nullable
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_SPEC = "spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  @jakarta.annotation.Nullable
  private V1ReplicaSetSpec spec;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @jakarta.annotation.Nullable
  private V1ReplicaSetStatus status;

  public V1ReplicaSet() {
  }

  public V1ReplicaSet apiVersion(@jakarta.annotation.Nullable String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(@jakarta.annotation.Nullable String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1ReplicaSet kind(@jakarta.annotation.Nullable String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(@jakarta.annotation.Nullable String kind) {
    this.kind = kind;
  }


  public V1ReplicaSet metadata(@jakarta.annotation.Nullable V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(@jakarta.annotation.Nullable V1ObjectMeta metadata) {
    this.metadata = metadata;
  }


  public V1ReplicaSet spec(@jakarta.annotation.Nullable V1ReplicaSetSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Get spec
   * @return spec
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ReplicaSetSpec getSpec() {
    return spec;
  }

  public void setSpec(@jakarta.annotation.Nullable V1ReplicaSetSpec spec) {
    this.spec = spec;
  }


  public V1ReplicaSet status(@jakarta.annotation.Nullable V1ReplicaSetStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ReplicaSetStatus getStatus() {
    return status;
  }

  public void setStatus(@jakarta.annotation.Nullable V1ReplicaSetStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ReplicaSet v1ReplicaSet = (V1ReplicaSet) o;
    return Objects.equals(this.apiVersion, v1ReplicaSet.apiVersion) &&
        Objects.equals(this.kind, v1ReplicaSet.kind) &&
        Objects.equals(this.metadata, v1ReplicaSet.metadata) &&
        Objects.equals(this.spec, v1ReplicaSet.spec) &&
        Objects.equals(this.status, v1ReplicaSet.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ReplicaSet {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("apiVersion");
    openapiFields.add("kind");
    openapiFields.add("metadata");
    openapiFields.add("spec");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ReplicaSet
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ReplicaSet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ReplicaSet is not found in the empty JSON string", V1ReplicaSet.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ReplicaSet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ReplicaSet` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("apiVersion") != null && !jsonObj.get("apiVersion").isJsonNull()) && !jsonObj.get("apiVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiVersion").toString()));
      }
      if ((jsonObj.get("kind") != null && !jsonObj.get("kind").isJsonNull()) && !jsonObj.get("kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kind").toString()));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        V1ObjectMeta.validateJsonElement(jsonObj.get("metadata"));
      }
      // validate the optional field `spec`
      if (jsonObj.get("spec") != null && !jsonObj.get("spec").isJsonNull()) {
        V1ReplicaSetSpec.validateJsonElement(jsonObj.get("spec"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        V1ReplicaSetStatus.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ReplicaSet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ReplicaSet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ReplicaSet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ReplicaSet.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ReplicaSet>() {
           @Override
           public void write(JsonWriter out, V1ReplicaSet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ReplicaSet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ReplicaSet given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ReplicaSet
   * @throws IOException if the JSON string is invalid with respect to V1ReplicaSet
   */
  public static V1ReplicaSet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ReplicaSet.class);
  }

  /**
   * Convert an instance of V1ReplicaSet to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
