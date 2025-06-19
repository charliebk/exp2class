public class IfcReinforcingBar extends IfcReinforcingElement {
    public IfcPositiveLengthMeasure NominalDiameter;
    public IfcAreaMeasure CrossSectionArea;
    public IfcPositiveLengthMeasure BarLength;
    public IfcReinforcingBarTypeEnum PredefinedType;
    public IfcReinforcingBarSurfaceEnum BarSurface;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcReinforcingBarTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcingBarTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCREINFORCINGBARTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
