class IfcCurtainWall(IfcBuiltElement):
    def __init__(self):
        self.PredefinedType: IfcCurtainWallTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcCurtainWallTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCurtainWallTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCCURTAINWALLTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
