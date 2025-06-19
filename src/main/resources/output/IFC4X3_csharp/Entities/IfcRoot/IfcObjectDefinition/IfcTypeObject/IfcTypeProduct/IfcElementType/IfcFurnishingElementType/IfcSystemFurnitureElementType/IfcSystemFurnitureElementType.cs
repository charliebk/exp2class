public class IfcSystemFurnitureElementType : IfcFurnishingElementType
{
    public IfcSystemFurnitureElementTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcSystemFurnitureElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSystemFurnitureElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
