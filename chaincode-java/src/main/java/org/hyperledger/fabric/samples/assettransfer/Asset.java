/*
 * SPDX-License-Identifier: Apache-2.0
 */

package org.hyperledger.fabric.samples.assettransfer;

import java.util.Objects;

import org.hyperledger.fabric.contract.annotation.DataType;
import org.hyperledger.fabric.contract.annotation.Property;

import com.owlike.genson.annotation.JsonProperty;

@DataType()
public final class Product {

    @Property()
    private final String productID;

    @Property()
    private final String origin;

    @Property()
    private final String ownerId;


    public String getProductID() {
        return productID;
    }

    public String getOrigin() {
        return origin;
    }

    public String getOwner() {
        return ownerId;
    }


    public Asset(@JsonProperty("productID") final String productID, @JsonProperty("origin") final String origin,
            @JsonProperty("ownerId") final String ownerId) {
        this.productID = productID;
        this.origin = origin;
        this.ownerId = ownerId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((origin == null) ? 0 : origin.hashCode());
        result = prime * result + ((owner == null) ? 0 : owner.hashCode());
        result = prime * result + ((productID == null) ? 0 : productID.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (origin == null) {
            if (other.origin != null)
                return false;
        } else if (!origin.equals(other.origin))
            return false;
        if (owner == null) {
            if (other.owner != null)
                return false;
        } else if (!owner.equals(other.owner))
            return false;
        if (productID == null) {
            if (other.productID != null)
                return false;
        } else if (!productID.equals(other.productID))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Product {origin=" + origin + ", owner=" + owner + ", productID=" + productID + "}";
    }
}
