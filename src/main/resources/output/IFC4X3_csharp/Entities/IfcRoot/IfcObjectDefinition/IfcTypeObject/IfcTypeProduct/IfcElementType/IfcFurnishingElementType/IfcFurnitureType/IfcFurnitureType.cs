public class IfcFurnitureType : IfcFurnishingElementType
{
    public IfcAssemblyPlaceEnum AssemblyPlace { get; set; }
    public IfcFurnitureTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcFurnitureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFurnitureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
