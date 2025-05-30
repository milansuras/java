package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta2ResourceClaimSpecFluent<A extends V1beta2ResourceClaimSpecFluent<A>> extends BaseFluent<A>{
  public V1beta2ResourceClaimSpecFluent() {
  }
  
  public V1beta2ResourceClaimSpecFluent(V1beta2ResourceClaimSpec instance) {
    this.copyInstance(instance);
  }
  private V1beta2DeviceClaimBuilder devices;
  
  protected void copyInstance(V1beta2ResourceClaimSpec instance) {
    instance = (instance != null ? instance : new V1beta2ResourceClaimSpec());
    if (instance != null) {
          this.withDevices(instance.getDevices());
        }
  }
  
  public V1beta2DeviceClaim buildDevices() {
    return this.devices != null ? this.devices.build() : null;
  }
  
  public A withDevices(V1beta2DeviceClaim devices) {
    this._visitables.remove("devices");
    if (devices != null) {
        this.devices = new V1beta2DeviceClaimBuilder(devices);
        this._visitables.get("devices").add(this.devices);
    } else {
        this.devices = null;
        this._visitables.get("devices").remove(this.devices);
    }
    return (A) this;
  }
  
  public boolean hasDevices() {
    return this.devices != null;
  }
  
  public DevicesNested<A> withNewDevices() {
    return new DevicesNested(null);
  }
  
  public DevicesNested<A> withNewDevicesLike(V1beta2DeviceClaim item) {
    return new DevicesNested(item);
  }
  
  public DevicesNested<A> editDevices() {
    return withNewDevicesLike(java.util.Optional.ofNullable(buildDevices()).orElse(null));
  }
  
  public DevicesNested<A> editOrNewDevices() {
    return withNewDevicesLike(java.util.Optional.ofNullable(buildDevices()).orElse(new V1beta2DeviceClaimBuilder().build()));
  }
  
  public DevicesNested<A> editOrNewDevicesLike(V1beta2DeviceClaim item) {
    return withNewDevicesLike(java.util.Optional.ofNullable(buildDevices()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2ResourceClaimSpecFluent that = (V1beta2ResourceClaimSpecFluent) o;
    if (!java.util.Objects.equals(devices, that.devices)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(devices,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (devices != null) { sb.append("devices:"); sb.append(devices); }
    sb.append("}");
    return sb.toString();
  }
  public class DevicesNested<N> extends V1beta2DeviceClaimFluent<DevicesNested<N>> implements Nested<N>{
    DevicesNested(V1beta2DeviceClaim item) {
      this.builder = new V1beta2DeviceClaimBuilder(this, item);
    }
    V1beta2DeviceClaimBuilder builder;
    
    public N and() {
      return (N) V1beta2ResourceClaimSpecFluent.this.withDevices(builder.build());
    }
    
    public N endDevices() {
      return and();
    }
    
  
  }

}