public class IfcSystemFurnitureElement extends IfcFurnishingElement {
    public IfcSystemFurnitureElementTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcSystemFurnitureElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSystemFurnitureElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCSYSTEMFURNITUREELEMENTTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
