class IfcSectionedSolidHorizontal extends IfcSectionedSolid {
    constructor() {
        /** @type {IFCAXIS2PLACEMENTLINEAR[]} */
        this.CrossSectionPositions = null;
    }

    // === WHERE CLAUSES ===
    // CorrespondingSectionPositions : SIZEOF(CrossSections) = SIZEOF(CrossSectionPositions)
    // NoLongitudinalOffsets : SIZEOF(QUERY(temp <* CrossSectionPositions | EXISTS(temp.Location.OffsetLongitudinal))) = 0
}
