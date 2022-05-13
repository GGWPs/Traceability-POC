package main.java.org.hyperledger.fabric.samples.assettransfer;

import java.util.Objects;

import org.hyperledger.fabric.contract.annotation.DataType;
import org.hyperledger.fabric.contract.annotation.Property;

import com.owlike.genson.annotation.JsonProperty;

@DataType()
public class Supplier {
    @Property()
    private final String id;

    @Property()
    private final String companyName;

    @Property()
    private final String name;

    public String getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getName() {
        return name;
    }

    public Supplier(@JsonProperty("id") final String id, 
                    @JsonProperty("companyName") final String companyName, 
                    @JsonProperty("name") String name) {
        this.id = id;
        this.companyName = companyName;
        this.name = name;
    }


    

    

}
