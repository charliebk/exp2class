class IfcSweptAreaSolid extends IfcSolidModel {
    constructor() {
        /** @type {IFCPROFILEDEF} */
        this.SweptArea = null;
        /** @type {IFCAXIS2PLACEMENT3D} */
        this.Position = null;
    }

    // === EXTENDED BY ===
    // IfcDirectrixCurveSweptAreaSolid
    // IfcExtrudedAreaSolid
    // IfcRevolvedAreaSolid

    // === WHERE CLAUSES ===
    // SweptAreaType : SweptArea.ProfileType = IfcProfileTypeEnum.Area
}
