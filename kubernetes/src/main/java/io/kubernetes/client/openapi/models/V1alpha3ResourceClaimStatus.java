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
import io.kubernetes.client.openapi.models.V1alpha3AllocatedDeviceStatus;
import io.kubernetes.client.openapi.models.V1alpha3AllocationResult;
import io.kubernetes.client.openapi.models.V1alpha3ResourceClaimConsumerReference;
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
 * ResourceClaimStatus tracks whether the resource has been allocated and what the result of that was.
 */
@ApiModel(description = "ResourceClaimStatus tracks whether the resource has been allocated and what the result of that was.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-20T20:47:13.890592Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1alpha3ResourceClaimStatus {
  public static final String SERIALIZED_NAME_ALLOCATION = "allocation";
  @SerializedName(SERIALIZED_NAME_ALLOCATION)
  @jakarta.annotation.Nullable
  private V1alpha3AllocationResult allocation;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  @jakarta.annotation.Nullable
  private List<V1alpha3AllocatedDeviceStatus> devices = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESERVED_FOR = "reservedFor";
  @SerializedName(SERIALIZED_NAME_RESERVED_FOR)
  @jakarta.annotation.Nullable
  private List<V1alpha3ResourceClaimConsumerReference> reservedFor = new ArrayList<>();

  public V1alpha3ResourceClaimStatus() {
  }

  public V1alpha3ResourceClaimStatus allocation(@jakarta.annotation.Nullable V1alpha3AllocationResult allocation) {
    this.allocation = allocation;
    return this;
  }

  /**
   * Get allocation
   * @return allocation
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha3AllocationResult getAllocation() {
    return allocation;
  }

  public void setAllocation(@jakarta.annotation.Nullable V1alpha3AllocationResult allocation) {
    this.allocation = allocation;
  }


  public V1alpha3ResourceClaimStatus devices(@jakarta.annotation.Nullable List<V1alpha3AllocatedDeviceStatus> devices) {
    this.devices = devices;
    return this;
  }

  public V1alpha3ResourceClaimStatus addDevicesItem(V1alpha3AllocatedDeviceStatus devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }
    this.devices.add(devicesItem);
    return this;
  }

  /**
   * Devices contains the status of each device allocated for this claim, as reported by the driver. This can include driver-specific information. Entries are owned by their respective drivers.
   * @return devices
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Devices contains the status of each device allocated for this claim, as reported by the driver. This can include driver-specific information. Entries are owned by their respective drivers.")
  public List<V1alpha3AllocatedDeviceStatus> getDevices() {
    return devices;
  }

  public void setDevices(@jakarta.annotation.Nullable List<V1alpha3AllocatedDeviceStatus> devices) {
    this.devices = devices;
  }


  public V1alpha3ResourceClaimStatus reservedFor(@jakarta.annotation.Nullable List<V1alpha3ResourceClaimConsumerReference> reservedFor) {
    this.reservedFor = reservedFor;
    return this;
  }

  public V1alpha3ResourceClaimStatus addReservedForItem(V1alpha3ResourceClaimConsumerReference reservedForItem) {
    if (this.reservedFor == null) {
      this.reservedFor = new ArrayList<>();
    }
    this.reservedFor.add(reservedForItem);
    return this;
  }

  /**
   * ReservedFor indicates which entities are currently allowed to use the claim. A Pod which references a ResourceClaim which is not reserved for that Pod will not be started. A claim that is in use or might be in use because it has been reserved must not get deallocated.  In a cluster with multiple scheduler instances, two pods might get scheduled concurrently by different schedulers. When they reference the same ResourceClaim which already has reached its maximum number of consumers, only one pod can be scheduled.  Both schedulers try to add their pod to the claim.status.reservedFor field, but only the update that reaches the API server first gets stored. The other one fails with an error and the scheduler which issued it knows that it must put the pod back into the queue, waiting for the ResourceClaim to become usable again.  There can be at most 256 such reservations. This may get increased in the future, but not reduced.
   * @return reservedFor
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "ReservedFor indicates which entities are currently allowed to use the claim. A Pod which references a ResourceClaim which is not reserved for that Pod will not be started. A claim that is in use or might be in use because it has been reserved must not get deallocated.  In a cluster with multiple scheduler instances, two pods might get scheduled concurrently by different schedulers. When they reference the same ResourceClaim which already has reached its maximum number of consumers, only one pod can be scheduled.  Both schedulers try to add their pod to the claim.status.reservedFor field, but only the update that reaches the API server first gets stored. The other one fails with an error and the scheduler which issued it knows that it must put the pod back into the queue, waiting for the ResourceClaim to become usable again.  There can be at most 256 such reservations. This may get increased in the future, but not reduced.")
  public List<V1alpha3ResourceClaimConsumerReference> getReservedFor() {
    return reservedFor;
  }

  public void setReservedFor(@jakarta.annotation.Nullable List<V1alpha3ResourceClaimConsumerReference> reservedFor) {
    this.reservedFor = reservedFor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha3ResourceClaimStatus v1alpha3ResourceClaimStatus = (V1alpha3ResourceClaimStatus) o;
    return Objects.equals(this.allocation, v1alpha3ResourceClaimStatus.allocation) &&
        Objects.equals(this.devices, v1alpha3ResourceClaimStatus.devices) &&
        Objects.equals(this.reservedFor, v1alpha3ResourceClaimStatus.reservedFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocation, devices, reservedFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha3ResourceClaimStatus {\n");
    sb.append("    allocation: ").append(toIndentedString(allocation)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    reservedFor: ").append(toIndentedString(reservedFor)).append("\n");
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
    openapiFields.add("allocation");
    openapiFields.add("devices");
    openapiFields.add("reservedFor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1alpha3ResourceClaimStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha3ResourceClaimStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha3ResourceClaimStatus is not found in the empty JSON string", V1alpha3ResourceClaimStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha3ResourceClaimStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha3ResourceClaimStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `allocation`
      if (jsonObj.get("allocation") != null && !jsonObj.get("allocation").isJsonNull()) {
        V1alpha3AllocationResult.validateJsonElement(jsonObj.get("allocation"));
      }
      if (jsonObj.get("devices") != null && !jsonObj.get("devices").isJsonNull()) {
        JsonArray jsonArraydevices = jsonObj.getAsJsonArray("devices");
        if (jsonArraydevices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("devices").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `devices` to be an array in the JSON string but got `%s`", jsonObj.get("devices").toString()));
          }

          // validate the optional field `devices` (array)
          for (int i = 0; i < jsonArraydevices.size(); i++) {
            V1alpha3AllocatedDeviceStatus.validateJsonElement(jsonArraydevices.get(i));
          };
        }
      }
      if (jsonObj.get("reservedFor") != null && !jsonObj.get("reservedFor").isJsonNull()) {
        JsonArray jsonArrayreservedFor = jsonObj.getAsJsonArray("reservedFor");
        if (jsonArrayreservedFor != null) {
          // ensure the json data is an array
          if (!jsonObj.get("reservedFor").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `reservedFor` to be an array in the JSON string but got `%s`", jsonObj.get("reservedFor").toString()));
          }

          // validate the optional field `reservedFor` (array)
          for (int i = 0; i < jsonArrayreservedFor.size(); i++) {
            V1alpha3ResourceClaimConsumerReference.validateJsonElement(jsonArrayreservedFor.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha3ResourceClaimStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha3ResourceClaimStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha3ResourceClaimStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha3ResourceClaimStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha3ResourceClaimStatus>() {
           @Override
           public void write(JsonWriter out, V1alpha3ResourceClaimStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha3ResourceClaimStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1alpha3ResourceClaimStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1alpha3ResourceClaimStatus
   * @throws IOException if the JSON string is invalid with respect to V1alpha3ResourceClaimStatus
   */
  public static V1alpha3ResourceClaimStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha3ResourceClaimStatus.class);
  }

  /**
   * Convert an instance of V1alpha3ResourceClaimStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
