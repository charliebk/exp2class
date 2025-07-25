public class IfcExtrudedAreaSolid : IfcSweptAreaSolid
{
    public IfcDirection ExtrudedDirection { get; set; }
    public IfcPositiveLengthMeasure Depth { get; set; }

    // === EXTENDED BY ===
    // IfcExtrudedAreaSolidTapered

    // === WHERE CLAUSES ===
    // ValidExtrusionDirection : IfcDotProduct(IfcRepresentationItem() || IfcGeometricRepresentationItem() || IfcDirection([0.0,0.0,1.0]), SELF.ExtrudedDirection) <> 0.0
}
