class IfcVibrationIsolator(IfcElementComponent):
    def __init__(self):
        self.PredefinedType: IfcVibrationIsolatorTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcVibrationIsolatorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcVibrationIsolatorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCVIBRATIONISOLATORTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
