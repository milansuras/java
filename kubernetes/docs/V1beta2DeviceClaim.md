

# V1beta2DeviceClaim

DeviceClaim defines how to request devices with a ResourceClaim.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**config** | [**List&lt;V1beta2DeviceClaimConfiguration&gt;**](V1beta2DeviceClaimConfiguration.md) | This field holds configuration for multiple potential drivers which could satisfy requests in this claim. It is ignored while allocating the claim. |  [optional] |
|**constraints** | [**List&lt;V1beta2DeviceConstraint&gt;**](V1beta2DeviceConstraint.md) | These constraints must be satisfied by the set of devices that get allocated for the claim. |  [optional] |
|**requests** | [**List&lt;V1beta2DeviceRequest&gt;**](V1beta2DeviceRequest.md) | Requests represent individual requests for distinct devices which must all be satisfied. If empty, nothing needs to be allocated. |  [optional] |



