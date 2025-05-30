package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha3ResourceClaimStatusFluent<A extends V1alpha3ResourceClaimStatusFluent<A>> extends BaseFluent<A>{
  public V1alpha3ResourceClaimStatusFluent() {
  }
  
  public V1alpha3ResourceClaimStatusFluent(V1alpha3ResourceClaimStatus instance) {
    this.copyInstance(instance);
  }
  private V1alpha3AllocationResultBuilder allocation;
  private ArrayList<V1alpha3AllocatedDeviceStatusBuilder> devices;
  private ArrayList<V1alpha3ResourceClaimConsumerReferenceBuilder> reservedFor;
  
  protected void copyInstance(V1alpha3ResourceClaimStatus instance) {
    instance = (instance != null ? instance : new V1alpha3ResourceClaimStatus());
    if (instance != null) {
          this.withAllocation(instance.getAllocation());
          this.withDevices(instance.getDevices());
          this.withReservedFor(instance.getReservedFor());
        }
  }
  
  public V1alpha3AllocationResult buildAllocation() {
    return this.allocation != null ? this.allocation.build() : null;
  }
  
  public A withAllocation(V1alpha3AllocationResult allocation) {
    this._visitables.remove("allocation");
    if (allocation != null) {
        this.allocation = new V1alpha3AllocationResultBuilder(allocation);
        this._visitables.get("allocation").add(this.allocation);
    } else {
        this.allocation = null;
        this._visitables.get("allocation").remove(this.allocation);
    }
    return (A) this;
  }
  
  public boolean hasAllocation() {
    return this.allocation != null;
  }
  
  public AllocationNested<A> withNewAllocation() {
    return new AllocationNested(null);
  }
  
  public AllocationNested<A> withNewAllocationLike(V1alpha3AllocationResult item) {
    return new AllocationNested(item);
  }
  
  public AllocationNested<A> editAllocation() {
    return withNewAllocationLike(java.util.Optional.ofNullable(buildAllocation()).orElse(null));
  }
  
  public AllocationNested<A> editOrNewAllocation() {
    return withNewAllocationLike(java.util.Optional.ofNullable(buildAllocation()).orElse(new V1alpha3AllocationResultBuilder().build()));
  }
  
  public AllocationNested<A> editOrNewAllocationLike(V1alpha3AllocationResult item) {
    return withNewAllocationLike(java.util.Optional.ofNullable(buildAllocation()).orElse(item));
  }
  
  public A addToDevices(int index,V1alpha3AllocatedDeviceStatus item) {
    if (this.devices == null) {this.devices = new ArrayList<V1alpha3AllocatedDeviceStatusBuilder>();}
    V1alpha3AllocatedDeviceStatusBuilder builder = new V1alpha3AllocatedDeviceStatusBuilder(item);
    if (index < 0 || index >= devices.size()) {
        _visitables.get("devices").add(builder);
        devices.add(builder);
    } else {
        _visitables.get("devices").add(builder);
        devices.add(index, builder);
    }
    return (A)this;
  }
  
  public A setToDevices(int index,V1alpha3AllocatedDeviceStatus item) {
    if (this.devices == null) {this.devices = new ArrayList<V1alpha3AllocatedDeviceStatusBuilder>();}
    V1alpha3AllocatedDeviceStatusBuilder builder = new V1alpha3AllocatedDeviceStatusBuilder(item);
    if (index < 0 || index >= devices.size()) {
        _visitables.get("devices").add(builder);
        devices.add(builder);
    } else {
        _visitables.get("devices").add(builder);
        devices.set(index, builder);
    }
    return (A)this;
  }
  
  public A addToDevices(io.kubernetes.client.openapi.models.V1alpha3AllocatedDeviceStatus... items) {
    if (this.devices == null) {this.devices = new ArrayList<V1alpha3AllocatedDeviceStatusBuilder>();}
    for (V1alpha3AllocatedDeviceStatus item : items) {V1alpha3AllocatedDeviceStatusBuilder builder = new V1alpha3AllocatedDeviceStatusBuilder(item);_visitables.get("devices").add(builder);this.devices.add(builder);} return (A)this;
  }
  
  public A addAllToDevices(Collection<V1alpha3AllocatedDeviceStatus> items) {
    if (this.devices == null) {this.devices = new ArrayList<V1alpha3AllocatedDeviceStatusBuilder>();}
    for (V1alpha3AllocatedDeviceStatus item : items) {V1alpha3AllocatedDeviceStatusBuilder builder = new V1alpha3AllocatedDeviceStatusBuilder(item);_visitables.get("devices").add(builder);this.devices.add(builder);} return (A)this;
  }
  
  public A removeFromDevices(io.kubernetes.client.openapi.models.V1alpha3AllocatedDeviceStatus... items) {
    if (this.devices == null) return (A)this;
    for (V1alpha3AllocatedDeviceStatus item : items) {V1alpha3AllocatedDeviceStatusBuilder builder = new V1alpha3AllocatedDeviceStatusBuilder(item);_visitables.get("devices").remove(builder); this.devices.remove(builder);} return (A)this;
  }
  
  public A removeAllFromDevices(Collection<V1alpha3AllocatedDeviceStatus> items) {
    if (this.devices == null) return (A)this;
    for (V1alpha3AllocatedDeviceStatus item : items) {V1alpha3AllocatedDeviceStatusBuilder builder = new V1alpha3AllocatedDeviceStatusBuilder(item);_visitables.get("devices").remove(builder); this.devices.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromDevices(Predicate<V1alpha3AllocatedDeviceStatusBuilder> predicate) {
    if (devices == null) return (A) this;
    final Iterator<V1alpha3AllocatedDeviceStatusBuilder> each = devices.iterator();
    final List visitables = _visitables.get("devices");
    while (each.hasNext()) {
      V1alpha3AllocatedDeviceStatusBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1alpha3AllocatedDeviceStatus> buildDevices() {
    return this.devices != null ? build(devices) : null;
  }
  
  public V1alpha3AllocatedDeviceStatus buildDevice(int index) {
    return this.devices.get(index).build();
  }
  
  public V1alpha3AllocatedDeviceStatus buildFirstDevice() {
    return this.devices.get(0).build();
  }
  
  public V1alpha3AllocatedDeviceStatus buildLastDevice() {
    return this.devices.get(devices.size() - 1).build();
  }
  
  public V1alpha3AllocatedDeviceStatus buildMatchingDevice(Predicate<V1alpha3AllocatedDeviceStatusBuilder> predicate) {
      for (V1alpha3AllocatedDeviceStatusBuilder item : devices) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingDevice(Predicate<V1alpha3AllocatedDeviceStatusBuilder> predicate) {
      for (V1alpha3AllocatedDeviceStatusBuilder item : devices) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withDevices(List<V1alpha3AllocatedDeviceStatus> devices) {
    if (this.devices != null) {
      this._visitables.get("devices").clear();
    }
    if (devices != null) {
        this.devices = new ArrayList();
        for (V1alpha3AllocatedDeviceStatus item : devices) {
          this.addToDevices(item);
        }
    } else {
      this.devices = null;
    }
    return (A) this;
  }
  
  public A withDevices(io.kubernetes.client.openapi.models.V1alpha3AllocatedDeviceStatus... devices) {
    if (this.devices != null) {
        this.devices.clear();
        _visitables.remove("devices");
    }
    if (devices != null) {
      for (V1alpha3AllocatedDeviceStatus item : devices) {
        this.addToDevices(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasDevices() {
    return this.devices != null && !this.devices.isEmpty();
  }
  
  public DevicesNested<A> addNewDevice() {
    return new DevicesNested(-1, null);
  }
  
  public DevicesNested<A> addNewDeviceLike(V1alpha3AllocatedDeviceStatus item) {
    return new DevicesNested(-1, item);
  }
  
  public DevicesNested<A> setNewDeviceLike(int index,V1alpha3AllocatedDeviceStatus item) {
    return new DevicesNested(index, item);
  }
  
  public DevicesNested<A> editDevice(int index) {
    if (devices.size() <= index) throw new RuntimeException("Can't edit devices. Index exceeds size.");
    return setNewDeviceLike(index, buildDevice(index));
  }
  
  public DevicesNested<A> editFirstDevice() {
    if (devices.size() == 0) throw new RuntimeException("Can't edit first devices. The list is empty.");
    return setNewDeviceLike(0, buildDevice(0));
  }
  
  public DevicesNested<A> editLastDevice() {
    int index = devices.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last devices. The list is empty.");
    return setNewDeviceLike(index, buildDevice(index));
  }
  
  public DevicesNested<A> editMatchingDevice(Predicate<V1alpha3AllocatedDeviceStatusBuilder> predicate) {
    int index = -1;
    for (int i=0;i<devices.size();i++) { 
    if (predicate.test(devices.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching devices. No match found.");
    return setNewDeviceLike(index, buildDevice(index));
  }
  
  public A addToReservedFor(int index,V1alpha3ResourceClaimConsumerReference item) {
    if (this.reservedFor == null) {this.reservedFor = new ArrayList<V1alpha3ResourceClaimConsumerReferenceBuilder>();}
    V1alpha3ResourceClaimConsumerReferenceBuilder builder = new V1alpha3ResourceClaimConsumerReferenceBuilder(item);
    if (index < 0 || index >= reservedFor.size()) {
        _visitables.get("reservedFor").add(builder);
        reservedFor.add(builder);
    } else {
        _visitables.get("reservedFor").add(builder);
        reservedFor.add(index, builder);
    }
    return (A)this;
  }
  
  public A setToReservedFor(int index,V1alpha3ResourceClaimConsumerReference item) {
    if (this.reservedFor == null) {this.reservedFor = new ArrayList<V1alpha3ResourceClaimConsumerReferenceBuilder>();}
    V1alpha3ResourceClaimConsumerReferenceBuilder builder = new V1alpha3ResourceClaimConsumerReferenceBuilder(item);
    if (index < 0 || index >= reservedFor.size()) {
        _visitables.get("reservedFor").add(builder);
        reservedFor.add(builder);
    } else {
        _visitables.get("reservedFor").add(builder);
        reservedFor.set(index, builder);
    }
    return (A)this;
  }
  
  public A addToReservedFor(io.kubernetes.client.openapi.models.V1alpha3ResourceClaimConsumerReference... items) {
    if (this.reservedFor == null) {this.reservedFor = new ArrayList<V1alpha3ResourceClaimConsumerReferenceBuilder>();}
    for (V1alpha3ResourceClaimConsumerReference item : items) {V1alpha3ResourceClaimConsumerReferenceBuilder builder = new V1alpha3ResourceClaimConsumerReferenceBuilder(item);_visitables.get("reservedFor").add(builder);this.reservedFor.add(builder);} return (A)this;
  }
  
  public A addAllToReservedFor(Collection<V1alpha3ResourceClaimConsumerReference> items) {
    if (this.reservedFor == null) {this.reservedFor = new ArrayList<V1alpha3ResourceClaimConsumerReferenceBuilder>();}
    for (V1alpha3ResourceClaimConsumerReference item : items) {V1alpha3ResourceClaimConsumerReferenceBuilder builder = new V1alpha3ResourceClaimConsumerReferenceBuilder(item);_visitables.get("reservedFor").add(builder);this.reservedFor.add(builder);} return (A)this;
  }
  
  public A removeFromReservedFor(io.kubernetes.client.openapi.models.V1alpha3ResourceClaimConsumerReference... items) {
    if (this.reservedFor == null) return (A)this;
    for (V1alpha3ResourceClaimConsumerReference item : items) {V1alpha3ResourceClaimConsumerReferenceBuilder builder = new V1alpha3ResourceClaimConsumerReferenceBuilder(item);_visitables.get("reservedFor").remove(builder); this.reservedFor.remove(builder);} return (A)this;
  }
  
  public A removeAllFromReservedFor(Collection<V1alpha3ResourceClaimConsumerReference> items) {
    if (this.reservedFor == null) return (A)this;
    for (V1alpha3ResourceClaimConsumerReference item : items) {V1alpha3ResourceClaimConsumerReferenceBuilder builder = new V1alpha3ResourceClaimConsumerReferenceBuilder(item);_visitables.get("reservedFor").remove(builder); this.reservedFor.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromReservedFor(Predicate<V1alpha3ResourceClaimConsumerReferenceBuilder> predicate) {
    if (reservedFor == null) return (A) this;
    final Iterator<V1alpha3ResourceClaimConsumerReferenceBuilder> each = reservedFor.iterator();
    final List visitables = _visitables.get("reservedFor");
    while (each.hasNext()) {
      V1alpha3ResourceClaimConsumerReferenceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1alpha3ResourceClaimConsumerReference> buildReservedFor() {
    return this.reservedFor != null ? build(reservedFor) : null;
  }
  
  public V1alpha3ResourceClaimConsumerReference buildReservedFor(int index) {
    return this.reservedFor.get(index).build();
  }
  
  public V1alpha3ResourceClaimConsumerReference buildFirstReservedFor() {
    return this.reservedFor.get(0).build();
  }
  
  public V1alpha3ResourceClaimConsumerReference buildLastReservedFor() {
    return this.reservedFor.get(reservedFor.size() - 1).build();
  }
  
  public V1alpha3ResourceClaimConsumerReference buildMatchingReservedFor(Predicate<V1alpha3ResourceClaimConsumerReferenceBuilder> predicate) {
      for (V1alpha3ResourceClaimConsumerReferenceBuilder item : reservedFor) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingReservedFor(Predicate<V1alpha3ResourceClaimConsumerReferenceBuilder> predicate) {
      for (V1alpha3ResourceClaimConsumerReferenceBuilder item : reservedFor) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withReservedFor(List<V1alpha3ResourceClaimConsumerReference> reservedFor) {
    if (this.reservedFor != null) {
      this._visitables.get("reservedFor").clear();
    }
    if (reservedFor != null) {
        this.reservedFor = new ArrayList();
        for (V1alpha3ResourceClaimConsumerReference item : reservedFor) {
          this.addToReservedFor(item);
        }
    } else {
      this.reservedFor = null;
    }
    return (A) this;
  }
  
  public A withReservedFor(io.kubernetes.client.openapi.models.V1alpha3ResourceClaimConsumerReference... reservedFor) {
    if (this.reservedFor != null) {
        this.reservedFor.clear();
        _visitables.remove("reservedFor");
    }
    if (reservedFor != null) {
      for (V1alpha3ResourceClaimConsumerReference item : reservedFor) {
        this.addToReservedFor(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasReservedFor() {
    return this.reservedFor != null && !this.reservedFor.isEmpty();
  }
  
  public ReservedForNested<A> addNewReservedFor() {
    return new ReservedForNested(-1, null);
  }
  
  public ReservedForNested<A> addNewReservedForLike(V1alpha3ResourceClaimConsumerReference item) {
    return new ReservedForNested(-1, item);
  }
  
  public ReservedForNested<A> setNewReservedForLike(int index,V1alpha3ResourceClaimConsumerReference item) {
    return new ReservedForNested(index, item);
  }
  
  public ReservedForNested<A> editReservedFor(int index) {
    if (reservedFor.size() <= index) throw new RuntimeException("Can't edit reservedFor. Index exceeds size.");
    return setNewReservedForLike(index, buildReservedFor(index));
  }
  
  public ReservedForNested<A> editFirstReservedFor() {
    if (reservedFor.size() == 0) throw new RuntimeException("Can't edit first reservedFor. The list is empty.");
    return setNewReservedForLike(0, buildReservedFor(0));
  }
  
  public ReservedForNested<A> editLastReservedFor() {
    int index = reservedFor.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last reservedFor. The list is empty.");
    return setNewReservedForLike(index, buildReservedFor(index));
  }
  
  public ReservedForNested<A> editMatchingReservedFor(Predicate<V1alpha3ResourceClaimConsumerReferenceBuilder> predicate) {
    int index = -1;
    for (int i=0;i<reservedFor.size();i++) { 
    if (predicate.test(reservedFor.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching reservedFor. No match found.");
    return setNewReservedForLike(index, buildReservedFor(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha3ResourceClaimStatusFluent that = (V1alpha3ResourceClaimStatusFluent) o;
    if (!java.util.Objects.equals(allocation, that.allocation)) return false;
    if (!java.util.Objects.equals(devices, that.devices)) return false;
    if (!java.util.Objects.equals(reservedFor, that.reservedFor)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(allocation,  devices,  reservedFor,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (allocation != null) { sb.append("allocation:"); sb.append(allocation + ","); }
    if (devices != null && !devices.isEmpty()) { sb.append("devices:"); sb.append(devices + ","); }
    if (reservedFor != null && !reservedFor.isEmpty()) { sb.append("reservedFor:"); sb.append(reservedFor); }
    sb.append("}");
    return sb.toString();
  }
  public class AllocationNested<N> extends V1alpha3AllocationResultFluent<AllocationNested<N>> implements Nested<N>{
    AllocationNested(V1alpha3AllocationResult item) {
      this.builder = new V1alpha3AllocationResultBuilder(this, item);
    }
    V1alpha3AllocationResultBuilder builder;
    
    public N and() {
      return (N) V1alpha3ResourceClaimStatusFluent.this.withAllocation(builder.build());
    }
    
    public N endAllocation() {
      return and();
    }
    
  
  }
  public class DevicesNested<N> extends V1alpha3AllocatedDeviceStatusFluent<DevicesNested<N>> implements Nested<N>{
    DevicesNested(int index,V1alpha3AllocatedDeviceStatus item) {
      this.index = index;
      this.builder = new V1alpha3AllocatedDeviceStatusBuilder(this, item);
    }
    V1alpha3AllocatedDeviceStatusBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha3ResourceClaimStatusFluent.this.setToDevices(index,builder.build());
    }
    
    public N endDevice() {
      return and();
    }
    
  
  }
  public class ReservedForNested<N> extends V1alpha3ResourceClaimConsumerReferenceFluent<ReservedForNested<N>> implements Nested<N>{
    ReservedForNested(int index,V1alpha3ResourceClaimConsumerReference item) {
      this.index = index;
      this.builder = new V1alpha3ResourceClaimConsumerReferenceBuilder(this, item);
    }
    V1alpha3ResourceClaimConsumerReferenceBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha3ResourceClaimStatusFluent.this.setToReservedFor(index,builder.build());
    }
    
    public N endReservedFor() {
      return and();
    }
    
  
  }

}