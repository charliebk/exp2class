class IfcStructuralSurfaceMember(IfcStructuralMember):
    def __init__(self):
        self.PredefinedType: IfcStructuralSurfaceMemberTypeEnum = None
        self.Thickness: IfcPositiveLengthMeasure = None

    # === EXTENDED BY ===
    # IfcStructuralSurfaceMemberVarying

    # === WHERE CLAUSES ===
    # HasObjectType : (PredefinedType <> IfcStructuralSurfaceMemberTypeEnum.USERDEFINED) OR EXISTS(SELF\IfcObject.ObjectType)
