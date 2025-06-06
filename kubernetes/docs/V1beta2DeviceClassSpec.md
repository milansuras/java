

# V1beta2DeviceClassSpec

DeviceClassSpec is used in a [DeviceClass] to define what can be allocated and how to configure it.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**config** | [**List&lt;V1beta2DeviceClassConfiguration&gt;**](V1beta2DeviceClassConfiguration.md) | Config defines configuration parameters that apply to each device that is claimed via this class. Some classses may potentially be satisfied by multiple drivers, so each instance of a vendor configuration applies to exactly one driver.  They are passed to the driver, but are not considered while allocating the claim. |  [optional] |
|**selectors** | [**List&lt;V1beta2DeviceSelector&gt;**](V1beta2DeviceSelector.md) | Each selector must be satisfied by a device which is claimed via this class. |  [optional] |



