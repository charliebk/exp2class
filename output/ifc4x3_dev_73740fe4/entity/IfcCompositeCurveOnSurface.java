package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcCompositeCurveOnSurface extends IfcCompositeCurve {

    // INVERSE attributes:
    // BasisSurface : SET [0:1] OF IfcSurface := IfcGetBasisSurface(SELF);
    // INVERSE attributes:
    // SameSurface : SIZEOF(BasisSurface) > 0;

    // SUPERTYPE OF:
    // - IfcBoundaryCurve SUBTYPE OF IfcCompositeCurve

    // WHERE constraints:
    // SameSurface : SIZEOF(BasisSurface) > 0;
}
