package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcGeographicCRS extends IfcCoordinateReferenceSystem {

    public IfcIdentifier PrimeMeridian; // OPTIONAL
    public IfcNamedUnit AngleUnit; // OPTIONAL
    public IfcNamedUnit HeightUnit; // OPTIONAL
    // INVERSE attributes:
    // AngleUnitIsPlaneAngle : NOT(EXISTS(SELF.AngleUnit)) OR (SELF.AngleUnit.UnitType=IfcUnitEnum.PLANEANGLEUNIT);
    // HeightUnitIsLength : NOT(EXISTS(SELF.HeightUnit)) OR (SELF.HeightUnit.UnitType=IfcUnitEnum.LENGTHUNIT);

    // WHERE constraints:
    // AngleUnitIsPlaneAngle : NOT(EXISTS(SELF.AngleUnit)) OR (SELF.AngleUnit.UnitType=IfcUnitEnum.PLANEANGLEUNIT);
    // HeightUnitIsLength : NOT(EXISTS(SELF.HeightUnit)) OR (SELF.HeightUnit.UnitType=IfcUnitEnum.LENGTHUNIT);
}
