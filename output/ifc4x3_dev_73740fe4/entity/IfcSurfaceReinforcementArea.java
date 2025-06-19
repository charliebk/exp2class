package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcSurfaceReinforcementArea extends IfcStructuralLoadOrResult {

    public IfcRatioMeasure ShearReinforcement; // OPTIONAL
    // INVERSE attributes:
    // NonnegativeArea1 : (NOT EXISTS(SurfaceReinforcement1)) OR (
    // (SurfaceReinforcement1[1] >= 0.) AND
    // (SurfaceReinforcement1[2] >= 0.) AND
    // ((SIZEOF(SurfaceReinforcement1) = 1) OR (SurfaceReinforcement1[1] >= 0.))
    // );
    // NonnegativeArea2 : (NOT EXISTS(SurfaceReinforcement2)) OR (
    // (SurfaceReinforcement2[1] >= 0.) AND
    // (SurfaceReinforcement2[2] >= 0.) AND
    // ((SIZEOF(SurfaceReinforcement2) = 1) OR (SurfaceReinforcement2[1] >= 0.))
    // );
    // NonnegativeArea3 : (NOT EXISTS(ShearReinforcement)) OR (ShearReinforcement >= 0.);
    // SurfaceAndOrShearAreaSpecified : EXISTS(SurfaceReinforcement1) OR EXISTS(SurfaceReinforcement2) OR EXISTS(ShearReinforcement);

    // WHERE constraints:
    // NonnegativeArea1 : (NOT EXISTS(SurfaceReinforcement1)) OR (
    // (SurfaceReinforcement1[1] >= 0.) AND
    // (SurfaceReinforcement1[2] >= 0.) AND
    // ((SIZEOF(SurfaceReinforcement1) = 1) OR (SurfaceReinforcement1[1] >= 0.))
    // );
    // NonnegativeArea2 : (NOT EXISTS(SurfaceReinforcement2)) OR (
    // (SurfaceReinforcement2[1] >= 0.) AND
    // (SurfaceReinforcement2[2] >= 0.) AND
    // ((SIZEOF(SurfaceReinforcement2) = 1) OR (SurfaceReinforcement2[1] >= 0.))
    // );
    // NonnegativeArea3 : (NOT EXISTS(ShearReinforcement)) OR (ShearReinforcement >= 0.);
    // SurfaceAndOrShearAreaSpecified : EXISTS(SurfaceReinforcement1) OR EXISTS(SurfaceReinforcement2) OR EXISTS(ShearReinforcement);
}
