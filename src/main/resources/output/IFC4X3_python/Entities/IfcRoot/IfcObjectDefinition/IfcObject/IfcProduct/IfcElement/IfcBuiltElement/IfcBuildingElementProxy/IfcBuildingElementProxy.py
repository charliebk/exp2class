class IfcBuildingElementProxy(IfcBuiltElement):
    def __init__(self):
        self.PredefinedType: IfcBuildingElementProxyTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBuildingElementProxyTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBuildingElementProxyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCBUILDINGELEMENTPROXYTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
    # HasObjectName : EXISTS(SELF\IfcRoot.Name)
