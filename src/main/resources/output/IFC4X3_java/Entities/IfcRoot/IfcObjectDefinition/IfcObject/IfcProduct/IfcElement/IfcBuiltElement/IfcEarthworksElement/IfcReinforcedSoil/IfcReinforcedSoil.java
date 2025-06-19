public class IfcReinforcedSoil extends IfcEarthworksElement {
    public IfcReinforcedSoilTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcReinforcedSoilTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcedSoilTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
