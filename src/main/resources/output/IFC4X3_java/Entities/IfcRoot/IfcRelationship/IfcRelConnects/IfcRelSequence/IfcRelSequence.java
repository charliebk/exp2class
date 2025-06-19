public class IfcRelSequence extends IfcRelConnects {
    public IfcProcess RelatingProcess;
    public IfcProcess RelatedProcess;
    public IfcLagTime TimeLag;
    public IfcSequenceEnum SequenceType;
    public IfcLabel UserDefinedSequenceType;

    // === WHERE CLAUSES ===
    // AvoidInconsistentSequence : RelatingProcess :<>: RelatedProcess
    // CorrectSequenceType : (SequenceType <> IfcSequenceEnum.USERDEFINED) OR ((SequenceType = IfcSequenceEnum.USERDEFINED) AND EXISTS(UserDefinedSequenceType))
}
