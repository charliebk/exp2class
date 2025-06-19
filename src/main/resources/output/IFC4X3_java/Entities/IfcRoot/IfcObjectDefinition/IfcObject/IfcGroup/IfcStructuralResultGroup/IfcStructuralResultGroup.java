public class IfcStructuralResultGroup extends IfcGroup {
    public IfcAnalysisTheoryTypeEnum TheoryType;
    public IfcStructuralLoadGroup ResultForLoadGroup;
    public IfcBoolean IsLinear;

    // === INVERSE CLAUSES ===
    // ResultGroupFor : SET [0:1] OF IfcStructuralAnalysisModel FOR HasResults

    // === WHERE CLAUSES ===
    // HasObjectType : (TheoryType <> IfcAnalysisTheoryTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
}
