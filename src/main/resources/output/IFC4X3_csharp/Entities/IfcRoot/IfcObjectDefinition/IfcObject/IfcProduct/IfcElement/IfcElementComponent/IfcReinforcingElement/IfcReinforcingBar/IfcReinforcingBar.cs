public class IfcReinforcingBar : IfcReinforcingElement
{
    public IfcPositiveLengthMeasure NominalDiameter { get; set; }
    public IfcAreaMeasure CrossSectionArea { get; set; }
    public IfcPositiveLengthMeasure BarLength { get; set; }
    public IfcReinforcingBarTypeEnum PredefinedType { get; set; }
    public IfcReinforcingBarSurfaceEnum BarSurface { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcReinforcingBarTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcingBarTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCREINFORCINGBARTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
