package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcToroidalSurface extends IfcElementarySurface {

    public IfcPositiveLengthMeasure MajorRadius;
    public IfcPositiveLengthMeasure MinorRadius;
    // INVERSE attributes:
    // MajorLargerMinor : MinorRadius < MajorRadius;

    // WHERE constraints:
    // MajorLargerMinor : MinorRadius < MajorRadius;
}
