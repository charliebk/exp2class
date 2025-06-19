class IfcProjectedCRS extends IfcCoordinateReferenceSystem {
    constructor() {
        /** @type {IFCIDENTIFIER} */
        this.VerticalDatum = null;
        /** @type {IFCIDENTIFIER} */
        this.MapProjection = null;
        /** @type {IFCIDENTIFIER} */
        this.MapZone = null;
        /** @type {IFCNAMEDUNIT} */
        this.MapUnit = null;
    }

    // === WHERE CLAUSES ===
    // MapUnitIsLength : NOT(EXISTS(SELF.MapUnit)) OR (SELF.MapUnit.UnitType = IfcUnitEnum.LENGTHUNIT)
}
