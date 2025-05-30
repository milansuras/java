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
import io.kubernetes.client.openapi.models.V1alpha3DeviceToleration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * DeviceRequestAllocationResult contains the allocation result for one request.
 */
@ApiModel(description = "DeviceRequestAllocationResult contains the allocation result for one request.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-20T20:47:13.890592Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1alpha3DeviceRequestAllocationResult {
  public static final String SERIALIZED_NAME_ADMIN_ACCESS = "adminAccess";
  @SerializedName(SERIALIZED_NAME_ADMIN_ACCESS)
  @jakarta.annotation.Nullable
  private Boolean adminAccess;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  @jakarta.annotation.Nonnull
  private String device;

  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  @jakarta.annotation.Nonnull
  private String driver;

  public static final String SERIALIZED_NAME_POOL = "pool";
  @SerializedName(SERIALIZED_NAME_POOL)
  @jakarta.annotation.Nonnull
  private String pool;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  @jakarta.annotation.Nonnull
  private String request;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  @jakarta.annotation.Nullable
  private List<V1alpha3DeviceToleration> tolerations = new ArrayList<>();

  public V1alpha3DeviceRequestAllocationResult() {
  }

  public V1alpha3DeviceRequestAllocationResult adminAccess(@jakarta.annotation.Nullable Boolean adminAccess) {
    this.adminAccess = adminAccess;
    return this;
  }

  /**
   * AdminAccess indicates that this device was allocated for administrative access. See the corresponding request field for a definition of mode.  This is an alpha field and requires enabling the DRAAdminAccess feature gate. Admin access is disabled if this field is unset or set to false, otherwise it is enabled.
   * @return adminAccess
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "AdminAccess indicates that this device was allocated for administrative access. See the corresponding request field for a definition of mode.  This is an alpha field and requires enabling the DRAAdminAccess feature gate. Admin access is disabled if this field is unset or set to false, otherwise it is enabled.")
  public Boolean getAdminAccess() {
    return adminAccess;
  }

  public void setAdminAccess(@jakarta.annotation.Nullable Boolean adminAccess) {
    this.adminAccess = adminAccess;
  }


  public V1alpha3DeviceRequestAllocationResult device(@jakarta.annotation.Nonnull String device) {
    this.device = device;
    return this;
  }

  /**
   * Device references one device instance via its name in the driver&#39;s resource pool. It must be a DNS label.
   * @return device
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Device references one device instance via its name in the driver's resource pool. It must be a DNS label.")
  public String getDevice() {
    return device;
  }

  public void setDevice(@jakarta.annotation.Nonnull String device) {
    this.device = device;
  }


  public V1alpha3DeviceRequestAllocationResult driver(@jakarta.annotation.Nonnull String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Driver specifies the name of the DRA driver whose kubelet plugin should be invoked to process the allocation once the claim is needed on a node.  Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver.
   * @return driver
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Driver specifies the name of the DRA driver whose kubelet plugin should be invoked to process the allocation once the claim is needed on a node.  Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver.")
  public String getDriver() {
    return driver;
  }

  public void setDriver(@jakarta.annotation.Nonnull String driver) {
    this.driver = driver;
  }


  public V1alpha3DeviceRequestAllocationResult pool(@jakarta.annotation.Nonnull String pool) {
    this.pool = pool;
    return this;
  }

  /**
   * This name together with the driver name and the device name field identify which device was allocated (&#x60;&lt;driver name&gt;/&lt;pool name&gt;/&lt;device name&gt;&#x60;).  Must not be longer than 253 characters and may contain one or more DNS sub-domains separated by slashes.
   * @return pool
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "This name together with the driver name and the device name field identify which device was allocated (`<driver name>/<pool name>/<device name>`).  Must not be longer than 253 characters and may contain one or more DNS sub-domains separated by slashes.")
  public String getPool() {
    return pool;
  }

  public void setPool(@jakarta.annotation.Nonnull String pool) {
    this.pool = pool;
  }


  public V1alpha3DeviceRequestAllocationResult request(@jakarta.annotation.Nonnull String request) {
    this.request = request;
    return this;
  }

  /**
   * Request is the name of the request in the claim which caused this device to be allocated. If it references a subrequest in the firstAvailable list on a DeviceRequest, this field must include both the name of the main request and the subrequest using the format &lt;main request&gt;/&lt;subrequest&gt;.  Multiple devices may have been allocated per request.
   * @return request
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Request is the name of the request in the claim which caused this device to be allocated. If it references a subrequest in the firstAvailable list on a DeviceRequest, this field must include both the name of the main request and the subrequest using the format <main request>/<subrequest>.  Multiple devices may have been allocated per request.")
  public String getRequest() {
    return request;
  }

  public void setRequest(@jakarta.annotation.Nonnull String request) {
    this.request = request;
  }


  public V1alpha3DeviceRequestAllocationResult tolerations(@jakarta.annotation.Nullable List<V1alpha3DeviceToleration> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  public V1alpha3DeviceRequestAllocationResult addTolerationsItem(V1alpha3DeviceToleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

  /**
   * A copy of all tolerations specified in the request at the time when the device got allocated.  The maximum number of tolerations is 16.  This is an alpha field and requires enabling the DRADeviceTaints feature gate.
   * @return tolerations
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A copy of all tolerations specified in the request at the time when the device got allocated.  The maximum number of tolerations is 16.  This is an alpha field and requires enabling the DRADeviceTaints feature gate.")
  public List<V1alpha3DeviceToleration> getTolerations() {
    return tolerations;
  }

  public void setTolerations(@jakarta.annotation.Nullable List<V1alpha3DeviceToleration> tolerations) {
    this.tolerations = tolerations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3DeviceRequestAllocationResult v1alpha3DeviceRequestAllocationResult = (V1alpha3DeviceRequestAllocationResult) o;
    return Objects.equals(this.adminAccess, v1alpha3DeviceRequestAllocationResult.adminAccess) &&
        Objects.equals(this.device, v1alpha3DeviceRequestAllocationResult.device) &&
        Objects.equals(this.driver, v1alpha3DeviceRequestAllocationResult.driver) &&
        Objects.equals(this.pool, v1alpha3DeviceRequestAllocationResult.pool) &&
        Objects.equals(this.request, v1alpha3DeviceRequestAllocationResult.request) &&
        Objects.equals(this.tolerations, v1alpha3DeviceRequestAllocationResult.tolerations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminAccess, device, driver, pool, request, tolerations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3DeviceRequestAllocationResult {\n");
    sb.append("    adminAccess: ").append(toIndentedString(adminAccess)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
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
    openapiFields.add("adminAccess");
    openapiFields.add("device");
    openapiFields.add("driver");
    openapiFields.add("pool");
    openapiFields.add("request");
    openapiFields.add("tolerations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("device");
    openapiRequiredFields.add("driver");
    openapiRequiredFields.add("pool");
    openapiRequiredFields.add("request");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1alpha3DeviceRequestAllocationResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha3DeviceRequestAllocationResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha3DeviceRequestAllocationResult is not found in the empty JSON string", V1alpha3DeviceRequestAllocationResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha3DeviceRequestAllocationResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha3DeviceRequestAllocationResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha3DeviceRequestAllocationResult.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("device").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device").toString()));
      }
      if (!jsonObj.get("driver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `driver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driver").toString()));
      }
      if (!jsonObj.get("pool").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pool` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pool").toString()));
      }
      if (!jsonObj.get("request").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request").toString()));
      }
      if (jsonObj.get("tolerations") != null && !jsonObj.get("tolerations").isJsonNull()) {
        JsonArray jsonArraytolerations = jsonObj.getAsJsonArray("tolerations");
        if (jsonArraytolerations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tolerations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tolerations` to be an array in the JSON string but got `%s`", jsonObj.get("tolerations").toString()));
          }

          // validate the optional field `tolerations` (array)
          for (int i = 0; i < jsonArraytolerations.size(); i++) {
            V1alpha3DeviceToleration.validateJsonElement(jsonArraytolerations.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha3DeviceRequestAllocationResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha3DeviceRequestAllocationResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha3DeviceRequestAllocationResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha3DeviceRequestAllocationResult.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha3DeviceRequestAllocationResult>() {
           @Override
           public void write(JsonWriter out, V1alpha3DeviceRequestAllocationResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha3DeviceRequestAllocationResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1alpha3DeviceRequestAllocationResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1alpha3DeviceRequestAllocationResult
   * @throws IOException if the JSON string is invalid with respect to V1alpha3DeviceRequestAllocationResult
   */
  public static V1alpha3DeviceRequestAllocationResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha3DeviceRequestAllocationResult.class);
  }

  /**
   * Convert an instance of V1alpha3DeviceRequestAllocationResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
