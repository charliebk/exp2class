public class IfcStructuralLoadGroup extends IfcGroup {
    public IfcLoadGroupTypeEnum PredefinedType;
    public IfcActionTypeEnum ActionType;
    public IfcActionSourceTypeEnum ActionSource;
    public IfcRatioMeasure Coefficient;
    public IfcLabel Purpose;

    // === EXTENDED BY ===
    // IfcStructuralLoadCase

    // === INVERSE CLAUSES ===
    // SourceOfResultGroup : SET [0:1] OF IfcStructuralResultGroup FOR ResultForLoadGroup
    // LoadGroupFor : SET [0:?] OF IfcStructuralAnalysisModel FOR LoadedBy

    // === WHERE CLAUSES ===
    // HasObjectType : ( (PredefinedType <> IfcLoadGroupTypeEnum.USERDEFINED) AND (ActionType <> IfcActionTypeEnum.USERDEFINED) AND (ActionSource <> IfcActionSourceTypeEnum.USERDEFINED) ) OR EXISTS(SELF\IfcObject.ObjectType)
}
