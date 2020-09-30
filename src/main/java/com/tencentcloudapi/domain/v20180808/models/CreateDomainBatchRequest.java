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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDomainBatchRequest extends AbstractModel{

    /**
    * 模板ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 购买域名的年限，可选值：[1-10]
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 批量购买的域名,最多为4000个
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 付费模式 0手动在线付费，1使用余额付费
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
     * Get 模板ID 
     * @return TemplateId 模板ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID
     * @param TemplateId 模板ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 购买域名的年限，可选值：[1-10] 
     * @return Period 购买域名的年限，可选值：[1-10]
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 购买域名的年限，可选值：[1-10]
     * @param Period 购买域名的年限，可选值：[1-10]
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 批量购买的域名,最多为4000个 
     * @return Domains 批量购买的域名,最多为4000个
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 批量购买的域名,最多为4000个
     * @param Domains 批量购买的域名,最多为4000个
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 付费模式 0手动在线付费，1使用余额付费 
     * @return PayMode 付费模式 0手动在线付费，1使用余额付费
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式 0手动在线付费，1使用余额付费
     * @param PayMode 付费模式 0手动在线付费，1使用余额付费
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);

    }
}

