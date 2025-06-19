public class IfcProcess : IfcObject
{
    public IfcIdentifier Identification { get; set; }
    public IfcText LongDescription { get; set; }

    // === EXTENDED BY ===
    // IfcEvent
    // IfcProcedure
    // IfcTask

    // === INVERSE CLAUSES ===
    // IsPredecessorTo : SET [0:?] OF IfcRelSequence FOR RelatingProcess
    // IsSuccessorFrom : SET [0:?] OF IfcRelSequence FOR RelatedProcess
    // OperatesOn : SET [0:?] OF IfcRelAssignsToProcess FOR RelatingProcess
}
