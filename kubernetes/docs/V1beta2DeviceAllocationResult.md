

# V1beta2DeviceAllocationResult

DeviceAllocationResult is the result of allocating devices.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**config** | [**List&lt;V1beta2DeviceAllocationConfiguration&gt;**](V1beta2DeviceAllocationConfiguration.md) | This field is a combination of all the claim and class configuration parameters. Drivers can distinguish between those based on a flag.  This includes configuration parameters for drivers which have no allocated devices in the result because it is up to the drivers which configuration parameters they support. They can silently ignore unknown configuration parameters. |  [optional] |
|**results** | [**List&lt;V1beta2DeviceRequestAllocationResult&gt;**](V1beta2DeviceRequestAllocationResult.md) | Results lists all allocated devices. |  [optional] |



