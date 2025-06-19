class IfcStructuralResultGroup(IfcGroup):
    def __init__(self):
        self.TheoryType: IfcAnalysisTheoryTypeEnum = None
        self.ResultForLoadGroup: IfcStructuralLoadGroup = None
        self.IsLinear: IfcBoolean = None

    # === INVERSE CLAUSES ===
    # ResultGroupFor : SET [0:1] OF IfcStructuralAnalysisModel FOR HasResults

    # === WHERE CLAUSES ===
    # HasObjectType : (TheoryType <> IfcAnalysisTheoryTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
