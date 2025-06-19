package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public abstract class IfcSegment extends IfcGeometricRepresentationItem {

    public IfcTransitionCode Transition;
    // INVERSE attributes:
    // Dim : IfcDimensionCount := IfcSegmentDim(SELF);
    // INVERSE attributes:
    // UsingCurves : SET [1:?] OF IfcCompositeCurve FOR Segments;

    // SUPERTYPE OF:
    // - IfcCompositeCurveSegment
    // - IfcCurveSegment SUBTYPE OF IfcGeometricRepresentationItem
}
