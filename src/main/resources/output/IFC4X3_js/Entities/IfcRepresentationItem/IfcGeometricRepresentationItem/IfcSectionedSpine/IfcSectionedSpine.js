class IfcSectionedSpine extends IfcGeometricRepresentationItem {
    constructor() {
        /** @type {IFCCOMPOSITECURVE} */
        this.SpineCurve = null;
        /** @type {IFCPROFILEDEF[]} */
        this.CrossSections = null;
        /** @type {IFCAXIS2PLACEMENT3D[]} */
        this.CrossSectionPositions = null;
    }

    // === WHERE CLAUSES ===
    // ConsistentProfileTypes : SIZEOF(QUERY(temp <* CrossSections | CrossSections[1].ProfileType <> temp.ProfileType)) = 0
    // CorrespondingSectionPositions : SIZEOF(CrossSections) = SIZEOF(CrossSectionPositions)
    // SpineCurveDim : SpineCurve.Dim = 3

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := 3
}
