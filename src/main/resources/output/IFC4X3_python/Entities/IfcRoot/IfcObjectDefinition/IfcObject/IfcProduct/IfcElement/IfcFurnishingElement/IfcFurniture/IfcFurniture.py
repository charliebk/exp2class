class IfcFurniture(IfcFurnishingElement):
    def __init__(self):
        self.PredefinedType: IfcFurnitureTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcFurnitureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFurnitureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCFURNITURETYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
