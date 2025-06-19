public class IfcFurnitureType extends IfcFurnishingElementType {
    public IfcAssemblyPlaceEnum AssemblyPlace;
    public IfcFurnitureTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcFurnitureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFurnitureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
