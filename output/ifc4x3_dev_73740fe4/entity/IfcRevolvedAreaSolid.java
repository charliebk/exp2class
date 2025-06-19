package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcRevolvedAreaSolid extends IfcSweptAreaSolid {

    public IfcAxis1Placement Axis;
    public IfcPlaneAngleMeasure Angle;
    // INVERSE attributes:
    // AxisLine : IfcLine := IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcCurve() || IfcLine(Axis.Location,
    // IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcVector(Axis.Z,1.0));
    // INVERSE attributes:
    // AxisDirectionInXY : Axis.Z.DirectionRatios[3] = 0.0;
    // AxisStartInXY : ('IFC4X3_DEV_73740fe4.IFCCARTESIANPOINT' IN TYPEOF(Axis.Location)) AND (Axis.Location\IfcCartesianPoint.Coordinates[3] = 0.0);

    // SUPERTYPE OF:
    // - IfcRevolvedAreaSolidTapered SUBTYPE OF IfcSweptAreaSolid

    // WHERE constraints:
    // AxisDirectionInXY : Axis.Z.DirectionRatios[3] = 0.0;
    // AxisStartInXY : ('IFC4X3_DEV_73740fe4.IFCCARTESIANPOINT' IN TYPEOF(Axis.Location)) AND (Axis.Location\IfcCartesianPoint.Coordinates[3] = 0.0);
}
