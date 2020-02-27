/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterAdvancedSettings extends AbstractModel{

    /**
    * 是否启用IPVS
    */
    @SerializedName("IPVS")
    @Expose
    private Boolean IPVS;

    /**
    * 是否启用集群节点自动扩缩容(创建集群流程不支持开启此功能)
    */
    @SerializedName("AsEnabled")
    @Expose
    private Boolean AsEnabled;

    /**
    * 集群使用的runtime类型，包括"docker"和"containerd"两种类型，默认为"docker"
    */
    @SerializedName("ContainerRuntime")
    @Expose
    private String ContainerRuntime;

    /**
    * 集群中节点NodeName类型（包括 hostname,lan-ip两种形式，默认为lan-ip。如果开启了hostname模式，创建节点时需要设置HostName参数，并且InstanceName需要和HostName一致）
    */
    @SerializedName("NodeNameType")
    @Expose
    private String NodeNameType;

    /**
    * 集群自定义参数
    */
    @SerializedName("ExtraArgs")
    @Expose
    private ClusterExtraArgs ExtraArgs;

    /**
    * 集群网络类型（包括GR(全局路由)和VPC-CNI两种模式，默认为GR。
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * 集群VPC-CNI模式是否为非固定IP，默认: FALSE 固定IP。
    */
    @SerializedName("IsNonStaticIpMode")
    @Expose
    private Boolean IsNonStaticIpMode;

    /**
     * Get 是否启用IPVS 
     * @return IPVS 是否启用IPVS
     */
    public Boolean getIPVS() {
        return this.IPVS;
    }

    /**
     * Set 是否启用IPVS
     * @param IPVS 是否启用IPVS
     */
    public void setIPVS(Boolean IPVS) {
        this.IPVS = IPVS;
    }

    /**
     * Get 是否启用集群节点自动扩缩容(创建集群流程不支持开启此功能) 
     * @return AsEnabled 是否启用集群节点自动扩缩容(创建集群流程不支持开启此功能)
     */
    public Boolean getAsEnabled() {
        return this.AsEnabled;
    }

    /**
     * Set 是否启用集群节点自动扩缩容(创建集群流程不支持开启此功能)
     * @param AsEnabled 是否启用集群节点自动扩缩容(创建集群流程不支持开启此功能)
     */
    public void setAsEnabled(Boolean AsEnabled) {
        this.AsEnabled = AsEnabled;
    }

    /**
     * Get 集群使用的runtime类型，包括"docker"和"containerd"两种类型，默认为"docker" 
     * @return ContainerRuntime 集群使用的runtime类型，包括"docker"和"containerd"两种类型，默认为"docker"
     */
    public String getContainerRuntime() {
        return this.ContainerRuntime;
    }

    /**
     * Set 集群使用的runtime类型，包括"docker"和"containerd"两种类型，默认为"docker"
     * @param ContainerRuntime 集群使用的runtime类型，包括"docker"和"containerd"两种类型，默认为"docker"
     */
    public void setContainerRuntime(String ContainerRuntime) {
        this.ContainerRuntime = ContainerRuntime;
    }

    /**
     * Get 集群中节点NodeName类型（包括 hostname,lan-ip两种形式，默认为lan-ip。如果开启了hostname模式，创建节点时需要设置HostName参数，并且InstanceName需要和HostName一致） 
     * @return NodeNameType 集群中节点NodeName类型（包括 hostname,lan-ip两种形式，默认为lan-ip。如果开启了hostname模式，创建节点时需要设置HostName参数，并且InstanceName需要和HostName一致）
     */
    public String getNodeNameType() {
        return this.NodeNameType;
    }

    /**
     * Set 集群中节点NodeName类型（包括 hostname,lan-ip两种形式，默认为lan-ip。如果开启了hostname模式，创建节点时需要设置HostName参数，并且InstanceName需要和HostName一致）
     * @param NodeNameType 集群中节点NodeName类型（包括 hostname,lan-ip两种形式，默认为lan-ip。如果开启了hostname模式，创建节点时需要设置HostName参数，并且InstanceName需要和HostName一致）
     */
    public void setNodeNameType(String NodeNameType) {
        this.NodeNameType = NodeNameType;
    }

    /**
     * Get 集群自定义参数 
     * @return ExtraArgs 集群自定义参数
     */
    public ClusterExtraArgs getExtraArgs() {
        return this.ExtraArgs;
    }

    /**
     * Set 集群自定义参数
     * @param ExtraArgs 集群自定义参数
     */
    public void setExtraArgs(ClusterExtraArgs ExtraArgs) {
        this.ExtraArgs = ExtraArgs;
    }

    /**
     * Get 集群网络类型（包括GR(全局路由)和VPC-CNI两种模式，默认为GR。 
     * @return NetworkType 集群网络类型（包括GR(全局路由)和VPC-CNI两种模式，默认为GR。
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 集群网络类型（包括GR(全局路由)和VPC-CNI两种模式，默认为GR。
     * @param NetworkType 集群网络类型（包括GR(全局路由)和VPC-CNI两种模式，默认为GR。
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get 集群VPC-CNI模式是否为非固定IP，默认: FALSE 固定IP。 
     * @return IsNonStaticIpMode 集群VPC-CNI模式是否为非固定IP，默认: FALSE 固定IP。
     */
    public Boolean getIsNonStaticIpMode() {
        return this.IsNonStaticIpMode;
    }

    /**
     * Set 集群VPC-CNI模式是否为非固定IP，默认: FALSE 固定IP。
     * @param IsNonStaticIpMode 集群VPC-CNI模式是否为非固定IP，默认: FALSE 固定IP。
     */
    public void setIsNonStaticIpMode(Boolean IsNonStaticIpMode) {
        this.IsNonStaticIpMode = IsNonStaticIpMode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IPVS", this.IPVS);
        this.setParamSimple(map, prefix + "AsEnabled", this.AsEnabled);
        this.setParamSimple(map, prefix + "ContainerRuntime", this.ContainerRuntime);
        this.setParamSimple(map, prefix + "NodeNameType", this.NodeNameType);
        this.setParamObj(map, prefix + "ExtraArgs.", this.ExtraArgs);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "IsNonStaticIpMode", this.IsNonStaticIpMode);

    }
}

