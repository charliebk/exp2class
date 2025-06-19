class IfcTypeProcess extends IfcTypeObject {
    constructor() {
        /** @type {IFCIDENTIFIER} */
        this.Identification = null;
        /** @type {IFCTEXT} */
        this.LongDescription = null;
        /** @type {IFCLABEL} */
        this.ProcessType = null;
    }

    // === EXTENDED BY ===
    // IfcEventType
    // IfcProcedureType
    // IfcTaskType

    // === INVERSE CLAUSES ===
    // OperatesOn : SET [0:?] OF IfcRelAssignsToProcess FOR RelatingProcess
}
