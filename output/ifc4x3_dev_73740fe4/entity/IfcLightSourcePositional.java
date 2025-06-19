package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcLightSourcePositional extends IfcLightSource {

    public IfcCartesianPoint Position;
    public IfcPositiveLengthMeasure Radius;
    public IfcReal ConstantAttenuation;
    public IfcReal DistanceAttenuation;
    public IfcReal QuadricAttenuation;

    // SUPERTYPE OF:
    // - IfcLightSourceSpot SUBTYPE OF IfcLightSource
}
