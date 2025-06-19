public class IfcReinforcedSoil : IfcEarthworksElement
{
    public IfcReinforcedSoilTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcReinforcedSoilTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcedSoilTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
