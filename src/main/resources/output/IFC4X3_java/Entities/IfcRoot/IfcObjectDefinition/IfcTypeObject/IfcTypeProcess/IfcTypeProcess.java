public class IfcTypeProcess extends IfcTypeObject {
    public IfcIdentifier Identification;
    public IfcText LongDescription;
    public IfcLabel ProcessType;

    // === EXTENDED BY ===
    // IfcEventType
    // IfcProcedureType
    // IfcTaskType

    // === INVERSE CLAUSES ===
    // OperatesOn : SET [0:?] OF IfcRelAssignsToProcess FOR RelatingProcess
}
