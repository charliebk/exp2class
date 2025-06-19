public class IfcRelSequence : IfcRelConnects
{
    public IfcProcess RelatingProcess { get; set; }
    public IfcProcess RelatedProcess { get; set; }
    public IfcLagTime TimeLag { get; set; }
    public IfcSequenceEnum SequenceType { get; set; }
    public IfcLabel UserDefinedSequenceType { get; set; }

    // === WHERE CLAUSES ===
    // AvoidInconsistentSequence : RelatingProcess :<>: RelatedProcess
    // CorrectSequenceType : (SequenceType <> IfcSequenceEnum.USERDEFINED) OR ((SequenceType = IfcSequenceEnum.USERDEFINED) AND EXISTS(UserDefinedSequenceType))
}
