public class IfcStructuralLoadGroup : IfcGroup
{
    public IfcLoadGroupTypeEnum PredefinedType { get; set; }
    public IfcActionTypeEnum ActionType { get; set; }
    public IfcActionSourceTypeEnum ActionSource { get; set; }
    public IfcRatioMeasure Coefficient { get; set; }
    public IfcLabel Purpose { get; set; }

    // === EXTENDED BY ===
    // IfcStructuralLoadCase

    // === INVERSE CLAUSES ===
    // SourceOfResultGroup : SET [0:1] OF IfcStructuralResultGroup FOR ResultForLoadGroup
    // LoadGroupFor : SET [0:?] OF IfcStructuralAnalysisModel FOR LoadedBy

    // === WHERE CLAUSES ===
    // HasObjectType : ( (PredefinedType <> IfcLoadGroupTypeEnum.USERDEFINED) AND (ActionType <> IfcActionTypeEnum.USERDEFINED) AND (ActionSource <> IfcActionSourceTypeEnum.USERDEFINED) ) OR EXISTS(SELF\IfcObject.ObjectType)
}
