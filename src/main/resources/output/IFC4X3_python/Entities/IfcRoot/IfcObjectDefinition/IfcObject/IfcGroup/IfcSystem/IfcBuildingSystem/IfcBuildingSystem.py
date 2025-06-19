class IfcBuildingSystem(IfcSystem):
    def __init__(self):
        self.PredefinedType: IfcBuildingSystemTypeEnum = None
        self.LongName: IfcLabel = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBuildingSystemTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBuildingSystemTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
