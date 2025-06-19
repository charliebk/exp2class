package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcSIUnit extends IfcNamedUnit {

    public IfcSIPrefix Prefix; // OPTIONAL
    public IfcSIUnitName Name;
    // INVERSE attributes:
    // SELF\IfcNamedUnit.Dimensions : IfcDimensionalExponents := IfcDimensionsForSIUnit (SELF.Name);
}
