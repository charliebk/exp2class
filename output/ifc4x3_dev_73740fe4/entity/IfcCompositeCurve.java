package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcCompositeCurve extends IfcBoundedCurve {

    public IfcLogical SelfIntersect;
    // INVERSE attributes:
    // NSegments : IfcInteger := SIZEOF(Segments);
    // ClosedCurve : IfcLogical := Segments[NSegments].Transition <> Discontinuous;
    // INVERSE attributes:
    // CurveContinuous : ((NOT ClosedCurve) AND (SIZEOF(QUERY(Temp <* Segments | Temp.Transition = Discontinuous)) = 1)) OR ((ClosedCurve) AND (SIZEOF(QUERY(Temp <* Segments | Temp.Transition = Discontinuous)) = 0));
    // SameDim : SIZEOF( QUERY( Temp <* Segments | Temp.Dim <> Segments[1].Dim)) = 0;

    // SUPERTYPE OF:
    // - IfcCompositeCurveOnSurface
    // - IfcGradientCurve
    // - IfcSegmentedReferenceCurve SUBTYPE OF IfcBoundedCurve

    // WHERE constraints:
    // CurveContinuous : ((NOT ClosedCurve) AND (SIZEOF(QUERY(Temp <* Segments | Temp.Transition = Discontinuous)) = 1)) OR ((ClosedCurve) AND (SIZEOF(QUERY(Temp <* Segments | Temp.Transition = Discontinuous)) = 0));
    // SameDim : SIZEOF( QUERY( Temp <* Segments | Temp.Dim <> Segments[1].Dim)) = 0;
}
