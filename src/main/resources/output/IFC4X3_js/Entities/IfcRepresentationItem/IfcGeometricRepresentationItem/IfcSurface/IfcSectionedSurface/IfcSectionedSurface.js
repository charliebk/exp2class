class IfcSectionedSurface extends IfcSurface {
    constructor() {
        /** @type {IFCCURVE} */
        this.Directrix = null;
        /** @type {IFCAXIS2PLACEMENTLINEAR[]} */
        this.CrossSectionPositions = null;
        /** @type {IFCPROFILEDEF[]} */
        this.CrossSections = null;
    }

    // === WHERE CLAUSES ===
    // AreaProfileTypes : SIZEOF(QUERY(temp <* CrossSections | temp.ProfileType = IfcProfileTypeEnum.CURVE)) <> 0
    // CorrespondingSectionPositions : SIZEOF(CrossSections) = SIZEOF(CrossSectionPositions)
    // DirectrixIs3D : Directrix.Dim = 3
    // NoOffsets : SIZEOF(QUERY(temp <* CrossSectionPositions | EXISTS(temp.Location.OffsetLateral) OR EXISTS(temp.Location.OffsetVertical) OR EXISTS(temp.Location.OffsetLongitudinal))) = 0
    // SectionsSameType : SIZEOF(QUERY(temp <* CrossSections | TYPEOF(CrossSections[1]) :<>: TYPEOF(temp))) = 0
}
