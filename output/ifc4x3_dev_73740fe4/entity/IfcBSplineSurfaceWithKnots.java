package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcBSplineSurfaceWithKnots extends IfcBSplineSurface {

    public IfcKnotType KnotSpec;
    // INVERSE attributes:
    // KnotVUpper : IfcInteger := SIZEOF(VKnots);
    // KnotUUpper : IfcInteger := SIZEOF(UKnots);
    // INVERSE attributes:
    // CorrespondingULists : SIZEOF(UMultiplicities) = KnotUUpper;
    // CorrespondingVLists : SIZEOF(VMultiplicities) = KnotVUpper;
    // UDirectionConstraints : IfcConstraintsParamBSpline (
    // SELF\IfcBSplineSurface.UDegree, KnotUUpper,
    // SELF\IfcBSplineSurface.UUpper, UMultiplicities, UKnots);
    // VDirectionConstraints : IfcConstraintsParamBSpline (
    // SELF\IfcBSplineSurface.VDegree, KnotVUpper,
    // SELF\IfcBSplineSurface.VUpper, VMultiplicities, VKnots);

    // SUPERTYPE OF:
    // - IfcRationalBSplineSurfaceWithKnots SUBTYPE OF IfcBSplineSurface

    // WHERE constraints:
    // CorrespondingULists : SIZEOF(UMultiplicities) = KnotUUpper;
    // CorrespondingVLists : SIZEOF(VMultiplicities) = KnotVUpper;
    // UDirectionConstraints : IfcConstraintsParamBSpline (
    // SELF\IfcBSplineSurface.UDegree, KnotUUpper,
    // SELF\IfcBSplineSurface.UUpper, UMultiplicities, UKnots);
    // VDirectionConstraints : IfcConstraintsParamBSpline (
    // SELF\IfcBSplineSurface.VDegree, KnotVUpper,
    // SELF\IfcBSplineSurface.VUpper, VMultiplicities, VKnots);
}
