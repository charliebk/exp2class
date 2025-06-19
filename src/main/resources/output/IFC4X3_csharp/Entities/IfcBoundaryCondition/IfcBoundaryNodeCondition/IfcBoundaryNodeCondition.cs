public class IfcBoundaryNodeCondition : IfcBoundaryCondition
{
    public IfcTranslationalStiffnessSelect TranslationalStiffnessX { get; set; }
    public IfcTranslationalStiffnessSelect TranslationalStiffnessY { get; set; }
    public IfcTranslationalStiffnessSelect TranslationalStiffnessZ { get; set; }
    public IfcRotationalStiffnessSelect RotationalStiffnessX { get; set; }
    public IfcRotationalStiffnessSelect RotationalStiffnessY { get; set; }
    public IfcRotationalStiffnessSelect RotationalStiffnessZ { get; set; }

    // === EXTENDED BY ===
    // IfcBoundaryNodeConditionWarping
}
