public class IfcProcess extends IfcObject {
    public IfcIdentifier Identification;
    public IfcText LongDescription;

    // === EXTENDED BY ===
    // IfcEvent
    // IfcProcedure
    // IfcTask

    // === INVERSE CLAUSES ===
    // IsPredecessorTo : SET [0:?] OF IfcRelSequence FOR RelatingProcess
    // IsSuccessorFrom : SET [0:?] OF IfcRelSequence FOR RelatedProcess
    // OperatesOn : SET [0:?] OF IfcRelAssignsToProcess FOR RelatingProcess
}
