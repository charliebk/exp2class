public class IfcTendonType extends IfcReinforcingElementType {
    public IfcTendonTypeEnum PredefinedType;
    public IfcPositiveLengthMeasure NominalDiameter;
    public IfcAreaMeasure CrossSectionArea;
    public IfcPositiveLengthMeasure SheathDiameter;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcTendonTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTendonTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
