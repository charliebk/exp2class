class IfcDerivedUnit {
    constructor() {
        /** @type {SET [1:?] OF IFCDERIVEDUNITELEMENT} */
        this.Elements = null;
        /** @type {IFCDERIVEDUNITENUM} */
        this.UnitType = null;
        /** @type {IFCLABEL} */
        this.UserDefinedType = null;
        /** @type {IFCLABEL} */
        this.Name = null;
    }

    // === WHERE CLAUSES ===
    // WR1 : (SIZEOF (Elements) > 1) OR ((SIZEOF (Elements) = 1) AND (Elements[1].Exponent <> 1 ))
    // WR2 : (UnitType <> IfcDerivedUnitEnum.USERDEFINED) OR ((UnitType = IfcDerivedUnitEnum.USERDEFINED) AND (EXISTS(SELF.UserDefinedType)))

    // === DERIVE CLAUSES ===
    // Dimensions : IfcDimensionalExponents := IfcDeriveDimensionalExponents(Elements)
}
