class IfcFastener(IfcElementComponent):
    def __init__(self):
        self.PredefinedType: IfcFastenerTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcFastenerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFastenerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCFASTENERTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
