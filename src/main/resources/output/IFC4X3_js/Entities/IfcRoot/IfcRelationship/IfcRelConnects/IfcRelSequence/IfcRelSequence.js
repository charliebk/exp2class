class IfcRelSequence extends IfcRelConnects {
    constructor() {
        /** @type {IFCPROCESS} */
        this.RelatingProcess = null;
        /** @type {IFCPROCESS} */
        this.RelatedProcess = null;
        /** @type {IFCLAGTIME} */
        this.TimeLag = null;
        /** @type {IFCSEQUENCEENUM} */
        this.SequenceType = null;
        /** @type {IFCLABEL} */
        this.UserDefinedSequenceType = null;
    }

    // === WHERE CLAUSES ===
    // AvoidInconsistentSequence : RelatingProcess :<>: RelatedProcess
    // CorrectSequenceType : (SequenceType <> IfcSequenceEnum.USERDEFINED) OR ((SequenceType = IfcSequenceEnum.USERDEFINED) AND EXISTS(UserDefinedSequenceType))
}
