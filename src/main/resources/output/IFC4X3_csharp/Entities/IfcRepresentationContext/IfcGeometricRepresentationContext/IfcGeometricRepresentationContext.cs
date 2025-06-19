public class IfcGeometricRepresentationContext : IfcRepresentationContext
{
    public IfcDimensionCount CoordinateSpaceDimension { get; set; }
    public IfcReal Precision { get; set; }
    public IfcAxis2Placement WorldCoordinateSystem { get; set; }
    public IfcDirection TrueNorth { get; set; }

    // === EXTENDED BY ===
    // IfcGeometricRepresentationSubContext

    // === INVERSE CLAUSES ===
    // HasSubContexts : SET [0:?] OF IfcGeometricRepresentationSubContext FOR ParentContext
    // HasCoordinateOperation : SET [0:1] OF IfcCoordinateOperation FOR SourceCRS

    // === WHERE CLAUSES ===
    // North2D : NOT(EXISTS(TrueNorth)) OR (HIINDEX(TrueNorth.DirectionRatios) = 2)
}
