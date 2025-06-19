package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcProjectedCRS extends IfcCoordinateReferenceSystem {

    public IfcIdentifier VerticalDatum; // OPTIONAL
    public IfcIdentifier MapProjection; // OPTIONAL
    public IfcIdentifier MapZone; // OPTIONAL
    public IfcNamedUnit MapUnit; // OPTIONAL
    // INVERSE attributes:
    // MapUnitIsLength : NOT(EXISTS(SELF.MapUnit)) OR (SELF.MapUnit.UnitType = IfcUnitEnum.LENGTHUNIT);

    // WHERE constraints:
    // MapUnitIsLength : NOT(EXISTS(SELF.MapUnit)) OR (SELF.MapUnit.UnitType = IfcUnitEnum.LENGTHUNIT);
}
