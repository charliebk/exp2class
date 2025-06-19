class IfcCaissonFoundation(IfcDeepFoundation):
    def __init__(self):
        self.PredefinedType: IfcCaissonFoundationTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcCaissonFoundationTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCaissonFoundationTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCCAISSONFOUNDATIONTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
