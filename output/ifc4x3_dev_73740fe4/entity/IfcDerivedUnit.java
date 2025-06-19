package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcDerivedUnit {

    public IfcDerivedUnitEnum UnitType;
    public IfcLabel UserDefinedType; // OPTIONAL
    public IfcLabel Name; // OPTIONAL
    // INVERSE attributes:
    // Dimensions : IfcDimensionalExponents := IfcDeriveDimensionalExponents(Elements);
    // INVERSE attributes:
    // WR1 : (SIZEOF (Elements) > 1) OR ((SIZEOF (Elements) = 1) AND (Elements[1].Exponent <> 1 ));
    // WR2 : (UnitType <> IfcDerivedUnitEnum.USERDEFINED) OR
    // ((UnitType = IfcDerivedUnitEnum.USERDEFINED) AND
    // (EXISTS(SELF.UserDefinedType)));

    // WHERE constraints:
    // WR1 : (SIZEOF (Elements) > 1) OR ((SIZEOF (Elements) = 1) AND (Elements[1].Exponent <> 1 ));
    // WR2 : (UnitType <> IfcDerivedUnitEnum.USERDEFINED) OR
    // ((UnitType = IfcDerivedUnitEnum.USERDEFINED) AND
    // (EXISTS(SELF.UserDefinedType)));
}
