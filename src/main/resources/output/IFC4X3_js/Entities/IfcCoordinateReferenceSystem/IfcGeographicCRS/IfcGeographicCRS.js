class IfcGeographicCRS extends IfcCoordinateReferenceSystem {
    constructor() {
        /** @type {IFCIDENTIFIER} */
        this.PrimeMeridian = null;
        /** @type {IFCNAMEDUNIT} */
        this.AngleUnit = null;
        /** @type {IFCNAMEDUNIT} */
        this.HeightUnit = null;
    }

    // === WHERE CLAUSES ===
    // AngleUnitIsPlaneAngle : NOT(EXISTS(SELF.AngleUnit)) OR (SELF.AngleUnit.UnitType=IfcUnitEnum.PLANEANGLEUNIT)
    // HeightUnitIsLength : NOT(EXISTS(SELF.HeightUnit)) OR (SELF.HeightUnit.UnitType=IfcUnitEnum.LENGTHUNIT)
}
