package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcRectangularTrimmedSurface extends IfcBoundedSurface {

    public IfcSurface BasisSurface;
    public IfcParameterValue U1;
    public IfcParameterValue V1;
    public IfcParameterValue U2;
    public IfcParameterValue V2;
    public IfcBoolean Usense;
    public IfcBoolean Vsense;
    // INVERSE attributes:
    // U1AndU2Different : U1 <> U2;
    // UsenseCompatible : (('IFC4X3_DEV_73740fe4.IFCELEMENTARYSURFACE' IN TYPEOF(BasisSurface)) AND
    // (NOT ('IFC4X3_DEV_73740fe4.IFCPLANE' IN TYPEOF(BasisSurface)))) OR
    // ('IFC4X3_DEV_73740fe4.IFCSURFACEOFREVOLUTION' IN TYPEOF(BasisSurface)) OR
    // (Usense = (U2 > U1));
    // V1AndV2Different : V1 <> V2;
    // VsenseCompatible : Vsense = (V2 > V1);

    // WHERE constraints:
    // U1AndU2Different : U1 <> U2;
    // UsenseCompatible : (('IFC4X3_DEV_73740fe4.IFCELEMENTARYSURFACE' IN TYPEOF(BasisSurface)) AND
    // (NOT ('IFC4X3_DEV_73740fe4.IFCPLANE' IN TYPEOF(BasisSurface)))) OR
    // ('IFC4X3_DEV_73740fe4.IFCSURFACEOFREVOLUTION' IN TYPEOF(BasisSurface)) OR
    // (Usense = (U2 > U1));
    // V1AndV2Different : V1 <> V2;
    // VsenseCompatible : Vsense = (V2 > V1);
}
