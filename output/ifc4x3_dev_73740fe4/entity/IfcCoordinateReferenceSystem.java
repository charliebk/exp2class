package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcCoordinateReferenceSystem {

    public IfcLabel Name; // OPTIONAL
    public IfcText Description; // OPTIONAL
    public IfcIdentifier GeodeticDatum; // OPTIONAL
    // INVERSE attributes:
    // HasCoordinateOperation : SET [0:1] OF IfcCoordinateOperation FOR SourceCRS;
    // WellKnownText : SET [0:1] OF IfcWellKnownText FOR CoordinateReferenceSystem;
    // INVERSE attributes:
    // NameOrWKT : (HIINDEX(WellKnownText) = 1) OR EXISTS(Name);

    // SUPERTYPE OF:
    // - IfcGeographicCRS
    // - IfcProjectedCRS

    // WHERE constraints:
    // NameOrWKT : (HIINDEX(WellKnownText) = 1) OR EXISTS(Name);
}
