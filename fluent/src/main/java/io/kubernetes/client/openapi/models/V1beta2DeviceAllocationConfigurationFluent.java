package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta2DeviceAllocationConfigurationFluent<A extends V1beta2DeviceAllocationConfigurationFluent<A>> extends BaseFluent<A>{
  public V1beta2DeviceAllocationConfigurationFluent() {
  }
  
  public V1beta2DeviceAllocationConfigurationFluent(V1beta2DeviceAllocationConfiguration instance) {
    this.copyInstance(instance);
  }
  private V1beta2OpaqueDeviceConfigurationBuilder opaque;
  private List<String> requests;
  private String source;
  
  protected void copyInstance(V1beta2DeviceAllocationConfiguration instance) {
    instance = (instance != null ? instance : new V1beta2DeviceAllocationConfiguration());
    if (instance != null) {
          this.withOpaque(instance.getOpaque());
          this.withRequests(instance.getRequests());
          this.withSource(instance.getSource());
        }
  }
  
  public V1beta2OpaqueDeviceConfiguration buildOpaque() {
    return this.opaque != null ? this.opaque.build() : null;
  }
  
  public A withOpaque(V1beta2OpaqueDeviceConfiguration opaque) {
    this._visitables.remove("opaque");
    if (opaque != null) {
        this.opaque = new V1beta2OpaqueDeviceConfigurationBuilder(opaque);
        this._visitables.get("opaque").add(this.opaque);
    } else {
        this.opaque = null;
        this._visitables.get("opaque").remove(this.opaque);
    }
    return (A) this;
  }
  
  public boolean hasOpaque() {
    return this.opaque != null;
  }
  
  public OpaqueNested<A> withNewOpaque() {
    return new OpaqueNested(null);
  }
  
  public OpaqueNested<A> withNewOpaqueLike(V1beta2OpaqueDeviceConfiguration item) {
    return new OpaqueNested(item);
  }
  
  public OpaqueNested<A> editOpaque() {
    return withNewOpaqueLike(java.util.Optional.ofNullable(buildOpaque()).orElse(null));
  }
  
  public OpaqueNested<A> editOrNewOpaque() {
    return withNewOpaqueLike(java.util.Optional.ofNullable(buildOpaque()).orElse(new V1beta2OpaqueDeviceConfigurationBuilder().build()));
  }
  
  public OpaqueNested<A> editOrNewOpaqueLike(V1beta2OpaqueDeviceConfiguration item) {
    return withNewOpaqueLike(java.util.Optional.ofNullable(buildOpaque()).orElse(item));
  }
  
  public A addToRequests(int index,String item) {
    if (this.requests == null) {this.requests = new ArrayList<String>();}
    this.requests.add(index, item);
    return (A)this;
  }
  
  public A setToRequests(int index,String item) {
    if (this.requests == null) {this.requests = new ArrayList<String>();}
    this.requests.set(index, item); return (A)this;
  }
  
  public A addToRequests(java.lang.String... items) {
    if (this.requests == null) {this.requests = new ArrayList<String>();}
    for (String item : items) {this.requests.add(item);} return (A)this;
  }
  
  public A addAllToRequests(Collection<String> items) {
    if (this.requests == null) {this.requests = new ArrayList<String>();}
    for (String item : items) {this.requests.add(item);} return (A)this;
  }
  
  public A removeFromRequests(java.lang.String... items) {
    if (this.requests == null) return (A)this;
    for (String item : items) { this.requests.remove(item);} return (A)this;
  }
  
  public A removeAllFromRequests(Collection<String> items) {
    if (this.requests == null) return (A)this;
    for (String item : items) { this.requests.remove(item);} return (A)this;
  }
  
  public List<String> getRequests() {
    return this.requests;
  }
  
  public String getRequest(int index) {
    return this.requests.get(index);
  }
  
  public String getFirstRequest() {
    return this.requests.get(0);
  }
  
  public String getLastRequest() {
    return this.requests.get(requests.size() - 1);
  }
  
  public String getMatchingRequest(Predicate<String> predicate) {
      for (String item : requests) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingRequest(Predicate<String> predicate) {
      for (String item : requests) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withRequests(List<String> requests) {
    if (requests != null) {
        this.requests = new ArrayList();
        for (String item : requests) {
          this.addToRequests(item);
        }
    } else {
      this.requests = null;
    }
    return (A) this;
  }
  
  public A withRequests(java.lang.String... requests) {
    if (this.requests != null) {
        this.requests.clear();
        _visitables.remove("requests");
    }
    if (requests != null) {
      for (String item : requests) {
        this.addToRequests(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasRequests() {
    return this.requests != null && !this.requests.isEmpty();
  }
  
  public String getSource() {
    return this.source;
  }
  
  public A withSource(String source) {
    this.source = source;
    return (A) this;
  }
  
  public boolean hasSource() {
    return this.source != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2DeviceAllocationConfigurationFluent that = (V1beta2DeviceAllocationConfigurationFluent) o;
    if (!java.util.Objects.equals(opaque, that.opaque)) return false;
    if (!java.util.Objects.equals(requests, that.requests)) return false;
    if (!java.util.Objects.equals(source, that.source)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(opaque,  requests,  source,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (opaque != null) { sb.append("opaque:"); sb.append(opaque + ","); }
    if (requests != null && !requests.isEmpty()) { sb.append("requests:"); sb.append(requests + ","); }
    if (source != null) { sb.append("source:"); sb.append(source); }
    sb.append("}");
    return sb.toString();
  }
  public class OpaqueNested<N> extends V1beta2OpaqueDeviceConfigurationFluent<OpaqueNested<N>> implements Nested<N>{
    OpaqueNested(V1beta2OpaqueDeviceConfiguration item) {
      this.builder = new V1beta2OpaqueDeviceConfigurationBuilder(this, item);
    }
    V1beta2OpaqueDeviceConfigurationBuilder builder;
    
    public N and() {
      return (N) V1beta2DeviceAllocationConfigurationFluent.this.withOpaque(builder.build());
    }
    
    public N endOpaque() {
      return and();
    }
    
  
  }

}