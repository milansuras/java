

# V1PodFailurePolicyRule

PodFailurePolicyRule describes how a pod failure is handled when the requirements are met. One of onExitCodes and onPodConditions, but not both, can be used in each rule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | **String** | Specifies the action taken on a pod failure when the requirements are satisfied. Possible values are:  - FailJob: indicates that the pod&#39;s job is marked as Failed and all   running pods are terminated. - FailIndex: indicates that the pod&#39;s index is marked as Failed and will   not be restarted. - Ignore: indicates that the counter towards the .backoffLimit is not   incremented and a replacement pod is created. - Count: indicates that the pod is handled in the default way - the   counter towards the .backoffLimit is incremented. Additional values are considered to be added in the future. Clients should react to an unknown action by skipping the rule. |  |
|**onExitCodes** | [**V1PodFailurePolicyOnExitCodesRequirement**](V1PodFailurePolicyOnExitCodesRequirement.md) |  |  [optional] |
|**onPodConditions** | [**List&lt;V1PodFailurePolicyOnPodConditionsPattern&gt;**](V1PodFailurePolicyOnPodConditionsPattern.md) | Represents the requirement on the pod conditions. The requirement is represented as a list of pod condition patterns. The requirement is satisfied if at least one pattern matches an actual pod condition. At most 20 elements are allowed. |  [optional] |



