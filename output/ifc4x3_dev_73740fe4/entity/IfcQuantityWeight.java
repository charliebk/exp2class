package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcQuantityWeight extends IfcPhysicalSimpleQuantity {

    public IfcMassMeasure WeightValue;
    public IfcLabel Formula; // OPTIONAL
    // INVERSE attributes:
    // WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR
    // (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.MASSUNIT);
    // WR22 : WeightValue >= 0.;

    // WHERE constraints:
    // WR21 : NOT(EXISTS(SELF\IfcPhysicalSimpleQuantity.Unit)) OR
    // (SELF\IfcPhysicalSimpleQuantity.Unit.UnitType = IfcUnitEnum.MASSUNIT);
    // WR22 : WeightValue >= 0.;
}
