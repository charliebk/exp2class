class IfcKerb(IfcBuiltElement):
    def __init__(self):
        self.PredefinedType: IfcKerbTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcKerbTypeEnum.USERDEFINED) OR ((PredefinedType = IfcKerbTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCKERBTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
