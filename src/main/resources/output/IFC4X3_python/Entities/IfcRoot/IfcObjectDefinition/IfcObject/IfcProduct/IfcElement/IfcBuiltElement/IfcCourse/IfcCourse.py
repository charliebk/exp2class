class IfcCourse(IfcBuiltElement):
    def __init__(self):
        self.PredefinedType: IfcCourseTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcCourseTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCourseTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCCOURSETYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
