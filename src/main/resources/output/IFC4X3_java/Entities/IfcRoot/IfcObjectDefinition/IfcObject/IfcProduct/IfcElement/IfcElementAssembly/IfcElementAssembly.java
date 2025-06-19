public class IfcElementAssembly extends IfcElement {
    public IfcAssemblyPlaceEnum AssemblyPlace;
    public IfcElementAssemblyTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcElementAssemblyTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElementAssemblyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCELEMENTASSEMBLYTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
