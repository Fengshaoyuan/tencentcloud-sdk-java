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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVerContentRequest extends AbstractModel{

    /**
    * 产品id,大于0的有符号长整型
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * 需要修改的版本号
    */
    @SerializedName("OtaVersion")
    @Expose
    private String OtaVersion;

    /**
    * 操作人,字符长度<=64
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 版本发布的描述信息，需要国际化，可以为空
    */
    @SerializedName("Contents")
    @Expose
    private Contents Contents;

    /**
     * Get 产品id,大于0的有符号长整型 
     * @return ProductId 产品id,大于0的有符号长整型
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品id,大于0的有符号长整型
     * @param ProductId 产品id,大于0的有符号长整型
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 需要修改的版本号 
     * @return OtaVersion 需要修改的版本号
     */
    public String getOtaVersion() {
        return this.OtaVersion;
    }

    /**
     * Set 需要修改的版本号
     * @param OtaVersion 需要修改的版本号
     */
    public void setOtaVersion(String OtaVersion) {
        this.OtaVersion = OtaVersion;
    }

    /**
     * Get 操作人,字符长度<=64 
     * @return Operator 操作人,字符长度<=64
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人,字符长度<=64
     * @param Operator 操作人,字符长度<=64
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 备注信息 
     * @return Remark 备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
     * @param Remark 备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 版本发布的描述信息，需要国际化，可以为空 
     * @return Contents 版本发布的描述信息，需要国际化，可以为空
     */
    public Contents getContents() {
        return this.Contents;
    }

    /**
     * Set 版本发布的描述信息，需要国际化，可以为空
     * @param Contents 版本发布的描述信息，需要国际化，可以为空
     */
    public void setContents(Contents Contents) {
        this.Contents = Contents;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "OtaVersion", this.OtaVersion);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamObj(map, prefix + "Contents.", this.Contents);

    }
}

