class IfcStructuralCurveMember(IfcStructuralMember):
    def __init__(self):
        self.PredefinedType: IfcStructuralCurveMemberTypeEnum = None
        self.Axis: IfcDirection = None

    # === EXTENDED BY ===
    # IfcStructuralCurveMemberVarying

    # === WHERE CLAUSES ===
    # HasObjectType : (PredefinedType <> IfcStructuralCurveMemberTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
