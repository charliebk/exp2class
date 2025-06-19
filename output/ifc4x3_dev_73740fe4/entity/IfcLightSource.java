package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public abstract class IfcLightSource extends IfcGeometricRepresentationItem {

    public IfcLabel Name; // OPTIONAL
    public IfcColourRgb LightColour;
    public IfcNormalisedRatioMeasure AmbientIntensity; // OPTIONAL
    public IfcNormalisedRatioMeasure Intensity; // OPTIONAL

    // SUPERTYPE OF:
    // - IfcLightSourceAmbient
    // - IfcLightSourceDirectional
    // - IfcLightSourceGoniometric
    // - IfcLightSourcePositional SUBTYPE OF IfcGeometricRepresentationItem
}
