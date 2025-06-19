package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcTrimmedCurve extends IfcBoundedCurve {

    public IfcCurve BasisCurve;
    public IfcBoolean SenseAgreement;
    public IfcTrimmingPreference MasterRepresentation;
    // INVERSE attributes:
    // NoTrimOfBoundedCurves : NOT('IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE' IN TYPEOF(BasisCurve));
    // Trim1ValuesConsistent : (HIINDEX(Trim1) = 1) OR (TYPEOF(Trim1[1]) <> TYPEOF(Trim1[2]));
    // Trim2ValuesConsistent : (HIINDEX(Trim2) = 1) OR (TYPEOF(Trim2[1]) <> TYPEOF(Trim2[2]));

    // WHERE constraints:
    // NoTrimOfBoundedCurves : NOT('IFC4X3_DEV_73740fe4.IFCBOUNDEDCURVE' IN TYPEOF(BasisCurve));
    // Trim1ValuesConsistent : (HIINDEX(Trim1) = 1) OR (TYPEOF(Trim1[1]) <> TYPEOF(Trim1[2]));
    // Trim2ValuesConsistent : (HIINDEX(Trim2) = 1) OR (TYPEOF(Trim2[1]) <> TYPEOF(Trim2[2]));
}
