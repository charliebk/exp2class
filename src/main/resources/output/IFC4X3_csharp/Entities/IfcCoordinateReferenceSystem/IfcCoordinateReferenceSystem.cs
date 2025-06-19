public class IfcCoordinateReferenceSystem
{
    public IfcLabel Name { get; set; }
    public IfcText Description { get; set; }
    public IfcIdentifier GeodeticDatum { get; set; }

    // === EXTENDED BY ===
    // IfcGeographicCRS
    // IfcProjectedCRS

    // === INVERSE CLAUSES ===
    // HasCoordinateOperation : SET [0:1] OF IfcCoordinateOperation FOR SourceCRS
    // WellKnownText : SET [0:1] OF IfcWellKnownText FOR CoordinateReferenceSystem

    // === WHERE CLAUSES ===
    // NameOrWKT : (HIINDEX(WellKnownText) = 1) OR EXISTS(Name)
}
