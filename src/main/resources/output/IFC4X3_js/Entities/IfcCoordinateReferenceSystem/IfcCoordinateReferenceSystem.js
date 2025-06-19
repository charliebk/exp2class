class IfcCoordinateReferenceSystem {
    constructor() {
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {IFCTEXT} */
        this.Description = null;
        /** @type {IFCIDENTIFIER} */
        this.GeodeticDatum = null;
    }

    // === EXTENDED BY ===
    // IfcGeographicCRS
    // IfcProjectedCRS

    // === INVERSE CLAUSES ===
    // HasCoordinateOperation : SET [0:1] OF IfcCoordinateOperation FOR SourceCRS
    // WellKnownText : SET [0:1] OF IfcWellKnownText FOR CoordinateReferenceSystem

    // === WHERE CLAUSES ===
    // NameOrWKT : (HIINDEX(WellKnownText) = 1) OR EXISTS(Name)
}
