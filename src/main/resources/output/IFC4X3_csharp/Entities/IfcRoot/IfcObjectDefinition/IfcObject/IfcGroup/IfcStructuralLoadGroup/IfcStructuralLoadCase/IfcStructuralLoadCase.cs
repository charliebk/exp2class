public class IfcStructuralLoadCase : IfcStructuralLoadGroup
{
    public List<IfcRatioMeasure> SelfWeightCoefficients { get; set; }

    // === WHERE CLAUSES ===
    // IsLoadCasePredefinedType : SELF\IfcStructuralLoadGroup.PredefinedType = IfcLoadGroupTypeEnum.LOAD_CASE
}
