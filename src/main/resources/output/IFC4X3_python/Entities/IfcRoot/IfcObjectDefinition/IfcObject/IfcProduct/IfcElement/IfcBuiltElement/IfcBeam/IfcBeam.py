class IfcBeam(IfcBuiltElement):
    def __init__(self):
        self.PredefinedType: IfcBeamTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBeamTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBeamTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCBEAMTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
