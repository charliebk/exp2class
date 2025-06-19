public class IfcStructuralResultGroup : IfcGroup
{
    public IfcAnalysisTheoryTypeEnum TheoryType { get; set; }
    public IfcStructuralLoadGroup ResultForLoadGroup { get; set; }
    public IfcBoolean IsLinear { get; set; }

    // === INVERSE CLAUSES ===
    // ResultGroupFor : SET [0:1] OF IfcStructuralAnalysisModel FOR HasResults

    // === WHERE CLAUSES ===
    // HasObjectType : (TheoryType <> IfcAnalysisTheoryTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
}
