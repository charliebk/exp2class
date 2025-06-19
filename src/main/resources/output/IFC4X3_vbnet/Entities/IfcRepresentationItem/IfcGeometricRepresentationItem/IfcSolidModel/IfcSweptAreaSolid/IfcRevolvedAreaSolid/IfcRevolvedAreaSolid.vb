Public Class IfcRevolvedAreaSolid Inherits IfcSweptAreaSolid
    Public Axis As IfcAxis1Placement
    Public Angle As IfcPlaneAngleMeasure

    ' === EXTENDED BY ===
    ' IfcRevolvedAreaSolidTapered

    ' === WHERE CLAUSES ===
    ' AxisDirectionInXY : Axis.Z.DirectionRatios[3] = 0.0
    ' AxisStartInXY : ('IFC4X3_DEV_73740fe4.IFCCARTESIANPOINT' IN TYPEOF(Axis.Location)) AND (Axis.Location\IfcCartesianPoint.Coordinates[3] = 0.0)

    ' === DERIVE CLAUSES ===
    ' AxisLine : IfcLine := IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcCurve() || IfcLine(Axis.Location, IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcVector(Axis.Z,1.0))
End Class
