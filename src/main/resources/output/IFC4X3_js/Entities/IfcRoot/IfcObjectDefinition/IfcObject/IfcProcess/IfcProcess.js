class IfcProcess extends IfcObject {
    constructor() {
        /** @type {IFCIDENTIFIER} */
        this.Identification = null;
        /** @type {IFCTEXT} */
        this.LongDescription = null;
    }

    // === EXTENDED BY ===
    // IfcEvent
    // IfcProcedure
    // IfcTask

    // === INVERSE CLAUSES ===
    // IsPredecessorTo : SET [0:?] OF IfcRelSequence FOR RelatingProcess
    // IsSuccessorFrom : SET [0:?] OF IfcRelSequence FOR RelatedProcess
    // OperatesOn : SET [0:?] OF IfcRelAssignsToProcess FOR RelatingProcess
}
