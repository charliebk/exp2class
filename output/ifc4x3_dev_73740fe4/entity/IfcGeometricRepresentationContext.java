package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcGeometricRepresentationContext extends IfcRepresentationContext {

    public IfcDimensionCount CoordinateSpaceDimension;
    public IfcReal Precision; // OPTIONAL
    public IfcAxis2Placement WorldCoordinateSystem;
    public IfcDirection TrueNorth; // OPTIONAL
    // INVERSE attributes:
    // HasSubContexts : SET [0:?] OF IfcGeometricRepresentationSubContext FOR ParentContext;
    // HasCoordinateOperation : SET [0:1] OF IfcCoordinateOperation FOR SourceCRS;
    // INVERSE attributes:
    // North2D : NOT(EXISTS(TrueNorth)) OR (HIINDEX(TrueNorth.DirectionRatios) = 2);

    // SUPERTYPE OF:
    // - IfcGeometricRepresentationSubContext SUBTYPE OF IfcRepresentationContext

    // WHERE constraints:
    // North2D : NOT(EXISTS(TrueNorth)) OR (HIINDEX(TrueNorth.DirectionRatios) = 2);
}
