class IfcStructuralLoadGroup(IfcGroup):
    def __init__(self):
        self.PredefinedType: IfcLoadGroupTypeEnum = None
        self.ActionType: IfcActionTypeEnum = None
        self.ActionSource: IfcActionSourceTypeEnum = None
        self.Coefficient: IfcRatioMeasure = None
        self.Purpose: IfcLabel = None

    # === EXTENDED BY ===
    # IfcStructuralLoadCase

    # === INVERSE CLAUSES ===
    # SourceOfResultGroup : SET [0:1] OF IfcStructuralResultGroup FOR ResultForLoadGroup
    # LoadGroupFor : SET [0:?] OF IfcStructuralAnalysisModel FOR LoadedBy

    # === WHERE CLAUSES ===
    # HasObjectType : ( (PredefinedType <> IfcLoadGroupTypeEnum.USERDEFINED) AND (ActionType <> IfcActionTypeEnum.USERDEFINED) AND (ActionSource <> IfcActionSourceTypeEnum.USERDEFINED) ) OR EXISTS(SELF\IfcObject.ObjectType)
