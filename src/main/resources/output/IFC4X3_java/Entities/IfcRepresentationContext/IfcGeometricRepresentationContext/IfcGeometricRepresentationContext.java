public class IfcGeometricRepresentationContext extends IfcRepresentationContext {
    public IfcDimensionCount CoordinateSpaceDimension;
    public IfcReal Precision;
    public IfcAxis2Placement WorldCoordinateSystem;
    public IfcDirection TrueNorth;

    // === EXTENDED BY ===
    // IfcGeometricRepresentationSubContext

    // === INVERSE CLAUSES ===
    // HasSubContexts : SET [0:?] OF IfcGeometricRepresentationSubContext FOR ParentContext
    // HasCoordinateOperation : SET [0:1] OF IfcCoordinateOperation FOR SourceCRS

    // === WHERE CLAUSES ===
    // North2D : NOT(EXISTS(TrueNorth)) OR (HIINDEX(TrueNorth.DirectionRatios) = 2)
}
