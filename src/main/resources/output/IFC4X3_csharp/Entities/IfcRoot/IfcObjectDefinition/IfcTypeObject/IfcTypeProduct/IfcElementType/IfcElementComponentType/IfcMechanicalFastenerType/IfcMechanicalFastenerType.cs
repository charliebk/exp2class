public class IfcMechanicalFastenerType : IfcElementComponentType
{
    public IfcMechanicalFastenerTypeEnum PredefinedType { get; set; }
    public IfcPositiveLengthMeasure NominalDiameter { get; set; }
    public IfcPositiveLengthMeasure NominalLength { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcMechanicalFastenerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMechanicalFastenerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
