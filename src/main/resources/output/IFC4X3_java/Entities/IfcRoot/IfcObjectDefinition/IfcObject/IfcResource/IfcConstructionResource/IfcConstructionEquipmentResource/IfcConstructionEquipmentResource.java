public class IfcConstructionEquipmentResource extends IfcConstructionResource {
    public IfcConstructionEquipmentResourceTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcConstructionEquipmentResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcConstructionEquipmentResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
}
