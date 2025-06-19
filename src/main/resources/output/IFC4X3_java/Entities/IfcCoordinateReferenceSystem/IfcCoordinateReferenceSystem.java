public class IfcCoordinateReferenceSystem {
    public IfcLabel Name;
    public IfcText Description;
    public IfcIdentifier GeodeticDatum;

    // === EXTENDED BY ===
    // IfcGeographicCRS
    // IfcProjectedCRS

    // === INVERSE CLAUSES ===
    // HasCoordinateOperation : SET [0:1] OF IfcCoordinateOperation FOR SourceCRS
    // WellKnownText : SET [0:1] OF IfcWellKnownText FOR CoordinateReferenceSystem

    // === WHERE CLAUSES ===
    // NameOrWKT : (HIINDEX(WellKnownText) = 1) OR EXISTS(Name)
}
