public class IfcTendonType : IfcReinforcingElementType
{
    public IfcTendonTypeEnum PredefinedType { get; set; }
    public IfcPositiveLengthMeasure NominalDiameter { get; set; }
    public IfcAreaMeasure CrossSectionArea { get; set; }
    public IfcPositiveLengthMeasure SheathDiameter { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcTendonTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTendonTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
