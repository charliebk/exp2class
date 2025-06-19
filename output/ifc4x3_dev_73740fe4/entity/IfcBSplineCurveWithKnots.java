package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcBSplineCurveWithKnots extends IfcBSplineCurve {

    public IfcKnotType KnotSpec;
    // INVERSE attributes:
    // UpperIndexOnKnots : IfcInteger := SIZEOF(Knots);
    // INVERSE attributes:
    // ConsistentBSpline : IfcConstraintsParamBSpline(Degree, UpperIndexOnKnots,
    // UpperIndexOnControlPoints, KnotMultiplicities, Knots);
    // CorrespondingKnotLists : SIZEOF(KnotMultiplicities) = UpperIndexOnKnots;

    // SUPERTYPE OF:
    // - IfcRationalBSplineCurveWithKnots SUBTYPE OF IfcBSplineCurve

    // WHERE constraints:
    // ConsistentBSpline : IfcConstraintsParamBSpline(Degree, UpperIndexOnKnots,
    // UpperIndexOnControlPoints, KnotMultiplicities, Knots);
    // CorrespondingKnotLists : SIZEOF(KnotMultiplicities) = UpperIndexOnKnots;
}
