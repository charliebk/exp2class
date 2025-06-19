package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcPolygonalBoundedHalfSpace extends IfcHalfSpaceSolid {

    public IfcAxis2Placement3D Position;
    public IfcBoundedCurve PolygonalBoundary;
    // INVERSE attributes:
    // BoundaryDim : PolygonalBoundary.Dim = 2;
    // BoundaryType : SIZEOF(TYPEOF(PolygonalBoundary) * [
    // 'IFC4X3_DEV_73740fe4.IFCPOLYLINE',
    // 'IFC4X3_DEV_73740fe4.IFCCOMPOSITECURVE',
    // 'IFC4X3_DEV_73740fe4.IFCINDEXEDPOLYCURVE'
    // ]) = 1;

    // WHERE constraints:
    // BoundaryDim : PolygonalBoundary.Dim = 2;
    // BoundaryType : SIZEOF(TYPEOF(PolygonalBoundary) * [
    // 'IFC4X3_DEV_73740fe4.IFCPOLYLINE',
    // 'IFC4X3_DEV_73740fe4.IFCCOMPOSITECURVE',
    // 'IFC4X3_DEV_73740fe4.IFCINDEXEDPOLYCURVE'
    // ]) = 1;
}
