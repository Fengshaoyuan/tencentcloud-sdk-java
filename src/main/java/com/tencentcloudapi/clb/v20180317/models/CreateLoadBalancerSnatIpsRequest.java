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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLoadBalancerSnatIpsRequest extends AbstractModel{

    /**
    * 负载均衡唯一性Id，如lb-12345678
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 添加SnatIp信息，可指定Ip申请，或者指定子网自动申请
    */
    @SerializedName("SnatIps")
    @Expose
    private SnatIp [] SnatIps;

    /**
     * Get 负载均衡唯一性Id，如lb-12345678 
     * @return LoadBalancerId 负载均衡唯一性Id，如lb-12345678
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡唯一性Id，如lb-12345678
     * @param LoadBalancerId 负载均衡唯一性Id，如lb-12345678
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 添加SnatIp信息，可指定Ip申请，或者指定子网自动申请 
     * @return SnatIps 添加SnatIp信息，可指定Ip申请，或者指定子网自动申请
     */
    public SnatIp [] getSnatIps() {
        return this.SnatIps;
    }

    /**
     * Set 添加SnatIp信息，可指定Ip申请，或者指定子网自动申请
     * @param SnatIps 添加SnatIp信息，可指定Ip申请，或者指定子网自动申请
     */
    public void setSnatIps(SnatIp [] SnatIps) {
        this.SnatIps = SnatIps;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArrayObj(map, prefix + "SnatIps.", this.SnatIps);

    }
}

