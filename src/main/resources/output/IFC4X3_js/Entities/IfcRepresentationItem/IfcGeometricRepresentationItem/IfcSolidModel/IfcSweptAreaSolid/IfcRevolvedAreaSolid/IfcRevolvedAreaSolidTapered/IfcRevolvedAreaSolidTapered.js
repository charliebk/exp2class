class IfcRevolvedAreaSolidTapered extends IfcRevolvedAreaSolid {
    constructor() {
        /** @type {IFCPROFILEDEF} */
        this.EndSweptArea = null;
    }

    // === WHERE CLAUSES ===
    // CorrectProfileAssignment : IfcTaperedSweptAreaProfiles(SELF\IfcSweptAreaSolid.SweptArea, SELF.EndSweptArea)
}
