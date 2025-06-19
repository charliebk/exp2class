class IfcCompositeProfileDef extends IfcProfileDef {
    constructor() {
        /** @type {SET [2:?] OF IFCPROFILEDEF} */
        this.Profiles = null;
        /** @type {IFCLABEL} */
        this.Label = null;
    }

    // === WHERE CLAUSES ===
    // InvariantProfileType : SIZEOF(QUERY(temp <* Profiles | temp.ProfileType <> Profiles[1].ProfileType)) = 0
    // NoRecursion : SIZEOF(QUERY(temp <* Profiles | 'IFC4X3_DEV_73740fe4.IFCCOMPOSITEPROFILEDEF' IN TYPEOF(temp))) = 0
}
