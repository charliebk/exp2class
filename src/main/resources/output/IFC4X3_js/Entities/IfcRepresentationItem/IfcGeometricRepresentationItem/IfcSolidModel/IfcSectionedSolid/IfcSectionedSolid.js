class IfcSectionedSolid extends IfcSolidModel {
    constructor() {
        /** @type {IFCCURVE} */
        this.Directrix = null;
        /** @type {IFCPROFILEDEF[]} */
        this.CrossSections = null;
    }

    // === EXTENDED BY ===
    // IfcSectionedSolidHorizontal

    // === WHERE CLAUSES ===
    // ConsistentProfileTypes : SIZEOF(QUERY(temp <* CrossSections | CrossSections[1].ProfileType <> temp.ProfileType)) = 0
    // DirectrixIs3D : Directrix.Dim = 3
    // SectionsSameType : SIZEOF(QUERY(temp <* CrossSections | TYPEOF(CrossSections[1]) :<>: TYPEOF(temp))) = 0
}
