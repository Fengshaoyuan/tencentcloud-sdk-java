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
package com.tencentcloudapi.asw.v20200722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFlowServiceRequest extends AbstractModel{

    /**
    * 定义文本（JSON格式）
    */
    @SerializedName("Definition")
    @Expose
    private String Definition;

    /**
    * 状态机所属服务名
    */
    @SerializedName("FlowServiceName")
    @Expose
    private String FlowServiceName;

    /**
    * 是不是新的角色
    */
    @SerializedName("IsNewRole")
    @Expose
    private Boolean IsNewRole;

    /**
    * 状态机类型（EXPRESS，STANDARD）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 状态机所属服务中文名
    */
    @SerializedName("FlowServiceChineseName")
    @Expose
    private String FlowServiceChineseName;

    /**
    * 角色资源名
    */
    @SerializedName("RoleResource")
    @Expose
    private String RoleResource;

    /**
    * 备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 定义文本（JSON格式） 
     * @return Definition 定义文本（JSON格式）
     */
    public String getDefinition() {
        return this.Definition;
    }

    /**
     * Set 定义文本（JSON格式）
     * @param Definition 定义文本（JSON格式）
     */
    public void setDefinition(String Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 状态机所属服务名 
     * @return FlowServiceName 状态机所属服务名
     */
    public String getFlowServiceName() {
        return this.FlowServiceName;
    }

    /**
     * Set 状态机所属服务名
     * @param FlowServiceName 状态机所属服务名
     */
    public void setFlowServiceName(String FlowServiceName) {
        this.FlowServiceName = FlowServiceName;
    }

    /**
     * Get 是不是新的角色 
     * @return IsNewRole 是不是新的角色
     */
    public Boolean getIsNewRole() {
        return this.IsNewRole;
    }

    /**
     * Set 是不是新的角色
     * @param IsNewRole 是不是新的角色
     */
    public void setIsNewRole(Boolean IsNewRole) {
        this.IsNewRole = IsNewRole;
    }

    /**
     * Get 状态机类型（EXPRESS，STANDARD） 
     * @return Type 状态机类型（EXPRESS，STANDARD）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 状态机类型（EXPRESS，STANDARD）
     * @param Type 状态机类型（EXPRESS，STANDARD）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 状态机所属服务中文名 
     * @return FlowServiceChineseName 状态机所属服务中文名
     */
    public String getFlowServiceChineseName() {
        return this.FlowServiceChineseName;
    }

    /**
     * Set 状态机所属服务中文名
     * @param FlowServiceChineseName 状态机所属服务中文名
     */
    public void setFlowServiceChineseName(String FlowServiceChineseName) {
        this.FlowServiceChineseName = FlowServiceChineseName;
    }

    /**
     * Get 角色资源名 
     * @return RoleResource 角色资源名
     */
    public String getRoleResource() {
        return this.RoleResource;
    }

    /**
     * Set 角色资源名
     * @param RoleResource 角色资源名
     */
    public void setRoleResource(String RoleResource) {
        this.RoleResource = RoleResource;
    }

    /**
     * Get 备注 
     * @return Description 备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注
     * @param Description 备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "FlowServiceName", this.FlowServiceName);
        this.setParamSimple(map, prefix + "IsNewRole", this.IsNewRole);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FlowServiceChineseName", this.FlowServiceChineseName);
        this.setParamSimple(map, prefix + "RoleResource", this.RoleResource);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

