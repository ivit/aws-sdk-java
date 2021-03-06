/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.kms.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.kms.AWSKMS#revokeGrant(RevokeGrantRequest) RevokeGrant operation}.
 * <p>
 * Revokes a grant. You can revoke a grant to actively deny operations
 * that depend on it.
 * </p>
 *
 * @see com.amazonaws.services.kms.AWSKMS#revokeGrant(RevokeGrantRequest)
 */
public class RevokeGrantRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Unique identifier of the key associated with the grant.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String keyId;

    /**
     * Identifier of the grant to be revoked.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String grantId;

    /**
     * Unique identifier of the key associated with the grant.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return Unique identifier of the key associated with the grant.
     */
    public String getKeyId() {
        return keyId;
    }
    
    /**
     * Unique identifier of the key associated with the grant.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId Unique identifier of the key associated with the grant.
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
    
    /**
     * Unique identifier of the key associated with the grant.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId Unique identifier of the key associated with the grant.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RevokeGrantRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Identifier of the grant to be revoked.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return Identifier of the grant to be revoked.
     */
    public String getGrantId() {
        return grantId;
    }
    
    /**
     * Identifier of the grant to be revoked.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param grantId Identifier of the grant to be revoked.
     */
    public void setGrantId(String grantId) {
        this.grantId = grantId;
    }
    
    /**
     * Identifier of the grant to be revoked.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param grantId Identifier of the grant to be revoked.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RevokeGrantRequest withGrantId(String grantId) {
        this.grantId = grantId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKeyId() != null) sb.append("KeyId: " + getKeyId() + ",");
        if (getGrantId() != null) sb.append("GrantId: " + getGrantId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode()); 
        hashCode = prime * hashCode + ((getGrantId() == null) ? 0 : getGrantId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RevokeGrantRequest == false) return false;
        RevokeGrantRequest other = (RevokeGrantRequest)obj;
        
        if (other.getKeyId() == null ^ this.getKeyId() == null) return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false) return false; 
        if (other.getGrantId() == null ^ this.getGrantId() == null) return false;
        if (other.getGrantId() != null && other.getGrantId().equals(this.getGrantId()) == false) return false; 
        return true;
    }
    
}
    