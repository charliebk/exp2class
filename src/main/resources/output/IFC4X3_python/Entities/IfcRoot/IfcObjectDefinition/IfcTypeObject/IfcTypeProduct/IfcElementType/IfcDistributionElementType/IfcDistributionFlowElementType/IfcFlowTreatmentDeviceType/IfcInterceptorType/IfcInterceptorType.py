class IfcInterceptorType(IfcFlowTreatmentDeviceType):
    def __init__(self):
        self.PredefinedType: IfcInterceptorTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcInterceptorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcInterceptorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
