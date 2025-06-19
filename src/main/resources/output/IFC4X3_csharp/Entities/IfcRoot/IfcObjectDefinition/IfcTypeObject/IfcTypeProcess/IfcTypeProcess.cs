public class IfcTypeProcess : IfcTypeObject
{
    public IfcIdentifier Identification { get; set; }
    public IfcText LongDescription { get; set; }
    public IfcLabel ProcessType { get; set; }

    // === EXTENDED BY ===
    // IfcEventType
    // IfcProcedureType
    // IfcTaskType

    // === INVERSE CLAUSES ===
    // OperatesOn : SET [0:?] OF IfcRelAssignsToProcess FOR RelatingProcess
}
