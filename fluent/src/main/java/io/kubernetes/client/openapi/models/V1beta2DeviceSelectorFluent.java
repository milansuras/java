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
public class V1beta2DeviceSelectorFluent<A extends V1beta2DeviceSelectorFluent<A>> extends BaseFluent<A>{
  public V1beta2DeviceSelectorFluent() {
  }
  
  public V1beta2DeviceSelectorFluent(V1beta2DeviceSelector instance) {
    this.copyInstance(instance);
  }
  private V1beta2CELDeviceSelectorBuilder cel;
  
  protected void copyInstance(V1beta2DeviceSelector instance) {
    instance = (instance != null ? instance : new V1beta2DeviceSelector());
    if (instance != null) {
          this.withCel(instance.getCel());
        }
  }
  
  public V1beta2CELDeviceSelector buildCel() {
    return this.cel != null ? this.cel.build() : null;
  }
  
  public A withCel(V1beta2CELDeviceSelector cel) {
    this._visitables.remove("cel");
    if (cel != null) {
        this.cel = new V1beta2CELDeviceSelectorBuilder(cel);
        this._visitables.get("cel").add(this.cel);
    } else {
        this.cel = null;
        this._visitables.get("cel").remove(this.cel);
    }
    return (A) this;
  }
  
  public boolean hasCel() {
    return this.cel != null;
  }
  
  public CelNested<A> withNewCel() {
    return new CelNested(null);
  }
  
  public CelNested<A> withNewCelLike(V1beta2CELDeviceSelector item) {
    return new CelNested(item);
  }
  
  public CelNested<A> editCel() {
    return withNewCelLike(java.util.Optional.ofNullable(buildCel()).orElse(null));
  }
  
  public CelNested<A> editOrNewCel() {
    return withNewCelLike(java.util.Optional.ofNullable(buildCel()).orElse(new V1beta2CELDeviceSelectorBuilder().build()));
  }
  
  public CelNested<A> editOrNewCelLike(V1beta2CELDeviceSelector item) {
    return withNewCelLike(java.util.Optional.ofNullable(buildCel()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2DeviceSelectorFluent that = (V1beta2DeviceSelectorFluent) o;
    if (!java.util.Objects.equals(cel, that.cel)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(cel,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (cel != null) { sb.append("cel:"); sb.append(cel); }
    sb.append("}");
    return sb.toString();
  }
  public class CelNested<N> extends V1beta2CELDeviceSelectorFluent<CelNested<N>> implements Nested<N>{
    CelNested(V1beta2CELDeviceSelector item) {
      this.builder = new V1beta2CELDeviceSelectorBuilder(this, item);
    }
    V1beta2CELDeviceSelectorBuilder builder;
    
    public N and() {
      return (N) V1beta2DeviceSelectorFluent.this.withCel(builder.build());
    }
    
    public N endCel() {
      return and();
    }
    
  
  }

}