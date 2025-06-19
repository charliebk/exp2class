package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcPropertyTableValue extends IfcSimpleProperty {

    public IfcText Expression; // OPTIONAL
    public IfcUnit DefiningUnit; // OPTIONAL
    public IfcUnit DefinedUnit; // OPTIONAL
    public IfcCurveInterpolationEnum CurveInterpolation; // OPTIONAL
    // INVERSE attributes:
    // WR21 : (NOT(EXISTS(DefiningValues)) AND NOT(EXISTS(DefinedValues)))
    // OR (SIZEOF(DefiningValues) = SIZEOF(DefinedValues));
    // WR22 : NOT(EXISTS(DefiningValues)) OR
    // (SIZEOF(QUERY(temp <* SELF.DefiningValues | TYPEOF(temp) <> TYPEOF(SELF.DefiningValues[1])
    // )) = 0);
    // WR23 : NOT(EXISTS(DefinedValues)) OR
    // (SIZEOF(QUERY(temp <* SELF.DefinedValues | TYPEOF(temp) <> TYPEOF(SELF.DefinedValues[1])
    // )) = 0);

    // WHERE constraints:
    // WR21 : (NOT(EXISTS(DefiningValues)) AND NOT(EXISTS(DefinedValues)))
    // OR (SIZEOF(DefiningValues) = SIZEOF(DefinedValues));
    // WR22 : NOT(EXISTS(DefiningValues)) OR
    // (SIZEOF(QUERY(temp <* SELF.DefiningValues | TYPEOF(temp) <> TYPEOF(SELF.DefiningValues[1])
    // )) = 0);
    // WR23 : NOT(EXISTS(DefinedValues)) OR
    // (SIZEOF(QUERY(temp <* SELF.DefinedValues | TYPEOF(temp) <> TYPEOF(SELF.DefinedValues[1])
    // )) = 0);
}
