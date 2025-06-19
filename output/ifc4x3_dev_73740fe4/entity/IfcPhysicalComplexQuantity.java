package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcPhysicalComplexQuantity extends IfcPhysicalQuantity {

    public IfcLabel Discrimination;
    public IfcLabel Quality; // OPTIONAL
    public IfcLabel Usage; // OPTIONAL
    // INVERSE attributes:
    // NoSelfReference : SIZEOF(QUERY(temp <* HasQuantities | SELF :=: temp)) = 0;
    // UniqueQuantityNames : IfcUniqueQuantityNames(HasQuantities);

    // WHERE constraints:
    // NoSelfReference : SIZEOF(QUERY(temp <* HasQuantities | SELF :=: temp)) = 0;
    // UniqueQuantityNames : IfcUniqueQuantityNames(HasQuantities);
}
