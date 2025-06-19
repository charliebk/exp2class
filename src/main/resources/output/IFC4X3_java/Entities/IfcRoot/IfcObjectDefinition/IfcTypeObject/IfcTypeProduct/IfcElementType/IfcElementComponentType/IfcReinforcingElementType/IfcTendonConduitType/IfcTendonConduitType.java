public class IfcTendonConduitType extends IfcReinforcingElementType {
    public IfcTendonConduitTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcTendonConduitTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTendonConduitTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
