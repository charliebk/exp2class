public class IfcTendonConduitType : IfcReinforcingElementType
{
    public IfcTendonConduitTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : (PredefinedType <> IfcTendonConduitTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTendonConduitTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
