public class IfcMechanicalFastenerType extends IfcElementComponentType {
    public IfcMechanicalFastenerTypeEnum PredefinedType;
    public IfcPositiveLengthMeasure NominalDiameter;
    public IfcPositiveLengthMeasure NominalLength;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcMechanicalFastenerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMechanicalFastenerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
