public class IfcExtrudedAreaSolid extends IfcSweptAreaSolid {
    public IfcDirection ExtrudedDirection;
    public IfcPositiveLengthMeasure Depth;

    // === EXTENDED BY ===
    // IfcExtrudedAreaSolidTapered

    // === WHERE CLAUSES ===
    // ValidExtrusionDirection : IfcDotProduct(IfcRepresentationItem() || IfcGeometricRepresentationItem() || IfcDirection([0.0,0.0,1.0]), SELF.ExtrudedDirection) <> 0.0
}
