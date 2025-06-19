package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public abstract class IfcNamedUnit {

    public IfcDimensionalExponents Dimensions;
    public IfcUnitEnum UnitType;
    // INVERSE attributes:
    // WR1 : IfcCorrectDimensions (SELF.UnitType, SELF.Dimensions);

    // SUPERTYPE OF:
    // - IfcContextDependentUnit
    // - IfcConversionBasedUnit
    // - IfcSIUnit

    // WHERE constraints:
    // WR1 : IfcCorrectDimensions (SELF.UnitType, SELF.Dimensions);
}
